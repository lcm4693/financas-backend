package br.com.diego.controller.result;

import java.util.Date;

public class DespesaCover {

	private long id;
	private String descricao;
	private Date data;
	private double valor;
	
	public DespesaCover(long id, String descricao, Date data, double valor) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.data = data;
		this.valor = valor;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
