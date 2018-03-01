package br.com.marcospcruz.pregao.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author MarcosPereiradaCruz
 *
 */

public abstract class ClienteBaseTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1384777177087465587L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCliente;

	private String nome;
	@ManyToOne
	@JoinColumn(name = "idTipoPessoa")
	private TipoPessoaTO tipoPessoa;
	@ManyToOne
	@JoinColumn(name = "idEndereco")
	private EnderecoTO endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EnderecoTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoTO endereco) {
		this.endereco = endereco;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public TipoPessoaTO getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoaTO tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + idCliente;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipoPessoa == null) ? 0 : tipoPessoa.hashCode());
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
		ClienteBaseTO other = (ClienteBaseTO) obj;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (idCliente != other.idCliente)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipoPessoa == null) {
			if (other.tipoPessoa != null)
				return false;
		} else if (!tipoPessoa.equals(other.tipoPessoa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClienteBaseTO [idCliente=" + idCliente + ", nome=" + nome + ", tipoPessoa=" + tipoPessoa + ", endereco="
				+ endereco + "]";
	}

}
