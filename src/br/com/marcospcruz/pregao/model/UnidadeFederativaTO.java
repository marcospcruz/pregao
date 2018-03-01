package br.com.marcospcruz.pregao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "unidadefederativa")
public class UnidadeFederativaTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5741099294943846784L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUnidadeFederativa;
	private String nome;
	@ManyToOne
	@JoinColumn(name = "idPais")
	private PaisTO pais;

	public int getIdUnidadeFederativa() {
		return idUnidadeFederativa;
	}

	public void setIdUnidadeFederativa(int idUnidadeFederativa) {
		this.idUnidadeFederativa = idUnidadeFederativa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public PaisTO getPais() {
		return pais;
	}

	public void setPais(PaisTO pais) {
		this.pais = pais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idUnidadeFederativa;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
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
		UnidadeFederativaTO other = (UnidadeFederativaTO) obj;
		if (idUnidadeFederativa != other.idUnidadeFederativa)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		return true;
	}

}
