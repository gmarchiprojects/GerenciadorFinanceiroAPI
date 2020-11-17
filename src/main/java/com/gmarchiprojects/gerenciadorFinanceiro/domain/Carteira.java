package com.gmarchiprojects.gerenciadorFinanceiro.domain;

public class Carteira {

	private String nomeInstituicao;
	
	private Float saldo;
	
	private Float saldoConsignado;

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public Float getSaldoConsignado() {
		return saldoConsignado;
	}

	public void setSaldoConsignado(Float saldoConsignado) {
		this.saldoConsignado = saldoConsignado;
	}
	
	
	
}
