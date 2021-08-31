package br.com.alura.rh.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anuenio implements Reajuste {
	
	private BigDecimal valor;
	private LocalDate data;
	
	public Anuenio(BigDecimal valor) {
		this.valor = valor;
		this.data = LocalDate.now();
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public BigDecimal valor() {
		return valor;
	}

	@Override
	public LocalDate data() {
		return data;
	}
	
}
