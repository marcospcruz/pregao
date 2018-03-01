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
@Table(name = "endereco")
public class EnderecoTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3499465093032468654L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idEndereco;
	@ManyToOne
	@JoinColumn(name = "idLogradouro")
	private LogradouroTO logradouro;
	private int numero;
	private String complemento;

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public LogradouroTO getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(LogradouroTO logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Override
	public String toString() {
		return "EnderecoTO [idEndereco=" + idEndereco + ", logradouro=" + logradouro + ", numero=" + numero
				+ ", complemento=" + complemento + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + idEndereco;
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + numero;
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
		EnderecoTO other = (EnderecoTO) obj;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (idEndereco != other.idEndereco)
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

}
