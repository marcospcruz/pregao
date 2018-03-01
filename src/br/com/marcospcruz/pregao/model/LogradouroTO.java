package br.com.marcospcruz.pregao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "logradouro")
public class LogradouroTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3763783126222061196L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idLogradouro;
	private String nome;
	private TipoLogradouroTO tipoLogradouro;
	@Column(length = 9)
	private String cep;
	@ManyToOne
	@JoinColumn(name = "idLocalizacao")
	private LocalizacaoTO localizacao;

	public int getIdLogradouro() {
		return idLogradouro;
	}

	public void setIdLogradouro(int idLogradouro) {
		this.idLogradouro = idLogradouro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoLogradouroTO getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouroTO tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public LocalizacaoTO getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(LocalizacaoTO localizacao) {
		this.localizacao = localizacao;
	}

	@Override
	public String toString() {
		return "LogradouroTO [idLogradouro=" + idLogradouro + ", nome=" + nome + ", tipoLogradouro=" + tipoLogradouro
				+ ", cep=" + cep + ", localizacao=" + localizacao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + idLogradouro;
		result = prime * result + ((localizacao == null) ? 0 : localizacao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipoLogradouro == null) ? 0 : tipoLogradouro.hashCode());
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
		LogradouroTO other = (LogradouroTO) obj;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (idLogradouro != other.idLogradouro)
			return false;
		if (localizacao == null) {
			if (other.localizacao != null)
				return false;
		} else if (!localizacao.equals(other.localizacao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipoLogradouro == null) {
			if (other.tipoLogradouro != null)
				return false;
		} else if (!tipoLogradouro.equals(other.tipoLogradouro))
			return false;
		return true;
	}

}
