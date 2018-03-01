package br.com.marcospcruz.pregao.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
@DiscriminatorColumn(name = "idTipoPessoa")
@DiscriminatorValue(value = "2")
public class ClientePessoaJuridica extends ClienteBaseTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4852718703999267313L;
	private String cnpj;
	private String razaoSocial;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((razaoSocial == null) ? 0 : razaoSocial.hashCode());
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
		ClientePessoaJuridica other = (ClientePessoaJuridica) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (razaoSocial == null) {
			if (other.razaoSocial != null)
				return false;
		} else if (!razaoSocial.equals(other.razaoSocial))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClientePessoaJuridica [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", getNome()=" + getNome()
				+ ", getEndereco()=" + getEndereco() + ", getIdCliente()=" + getIdCliente() + ", getTipoPessoa()="
				+ getTipoPessoa() + "]";
	}

}
