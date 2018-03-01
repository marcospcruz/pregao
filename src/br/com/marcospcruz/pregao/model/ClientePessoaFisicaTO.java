package br.com.marcospcruz.pregao.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
@DiscriminatorColumn(name="idTipoPessoa")
@DiscriminatorValue(value="1")
public class ClientePessoaFisicaTO extends ClienteBaseTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3053176357649330524L;

	@Column(unique = true)
	private String cpf;
	@Column(unique = true)
	private String registroGeral;

	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	@Override
	public String toString() {
		return "ClientePessoaFisicaTO [cpf=" + cpf + ", registroGeral=" + registroGeral + ", getNome()=" + getNome()
				+ ", getEndereco()=" + getEndereco() + ", getIdCliente()=" + getIdCliente() + ", getTipoPessoa()="
				+ getTipoPessoa() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((registroGeral == null) ? 0 : registroGeral.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientePessoaFisicaTO other = (ClientePessoaFisicaTO) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (registroGeral == null) {
			if (other.registroGeral != null)
				return false;
		} else if (!registroGeral.equals(other.registroGeral))
			return false;
		return true;
	}

}
