package br.com.marcospcruz.pregao.model;

import java.io.Serializable;

public class TipoPessoaTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1531953481753698150L;

	private int idTipoPessoa;
	
	private String descricao;

	public int getIdTipoPessoa() {
		return idTipoPessoa;
	}

	public void setIdTipoPessoa(int idTipoPessoa) {
		this.idTipoPessoa = idTipoPessoa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "TipoPessoaTO [idTipoPessoa=" + idTipoPessoa + ", descricao=" + descricao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + idTipoPessoa;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoPessoaTO other = (TipoPessoaTO) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (idTipoPessoa != other.idTipoPessoa)
			return false;
		return true;
	}
	
	

}
