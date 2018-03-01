package br.com.marcospcruz.pregao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tipologradouro")
public class TipoLogradouroTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3627553978820245362L;
	private int idTipoLogradouro;
	private String descricao;

	public int getIdTipoLogradouro() {
		return idTipoLogradouro;
	}

	public void setIdTipoLogradouro(int idTipoLogradouro) {
		this.idTipoLogradouro = idTipoLogradouro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "TipoLogradouroTO [idTipoLogradouro=" + idTipoLogradouro + ", descricao=" + descricao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + idTipoLogradouro;
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
		TipoLogradouroTO other = (TipoLogradouroTO) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (idTipoLogradouro != other.idTipoLogradouro)
			return false;
		return true;
	}

}
