package model;

public class Cliente {

	private String nome, morada, email, tlm;

	public Cliente(String nome, String morada, String email, String tlm) {
		this.nome = nome;
		this.morada = morada;
		this.email = email;
		this.tlm = tlm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTlm() {
		return tlm;
	}

	public void setTlm(String tlm) {
		this.tlm = tlm;
	}
	
}
