package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeriodoEntreReajustes implements ValidacaoReajuste {
	
	public void valida(Funcionario funcionario, BigDecimal aumento) {
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		
		if (ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual) < 6L)
			throw new ValidacaoException("O intervalo entre reajustes deve ser no mínimo seis meses!");	
	}

}
