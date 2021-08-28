package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {
	
	private List<ValidacaoReajuste> validacoes;
	
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}

	public void reajustaSalario(Funcionario funcionario, BigDecimal aumento) {
		this.validacoes.forEach(v -> v.valida(funcionario, aumento));
		
		funcionario.atualizaSalario(funcionario.getSalario().add(aumento));
	}

}
