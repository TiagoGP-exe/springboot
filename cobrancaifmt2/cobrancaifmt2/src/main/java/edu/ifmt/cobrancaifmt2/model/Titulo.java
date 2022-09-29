package edu.ifmt.cobrancaifmt2.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Titulo {

	private Long codigo;
	private String descricao;
	private Date dataVecimento;
	private BigDecimal valor;
	private StatusTitulo status;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataVecimento() {
		return dataVecimento;
	}
	public void setDataVecimento(Date dataVecimento) {
		this.dataVecimento = dataVecimento;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public StatusTitulo getStatus() {
		return status;
	}
	public void setStatus(StatusTitulo status) {
		this.status = status;
	}
	
	
}
