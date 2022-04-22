package br.com.projetoGulliverTraveller.beans;

import java.util.Date;

public class Cliente {

	private String nomeCli;
	private String sobrenomeCli;
	private String email;
	private int idCliente;
	private String cpfCliente;
	private Date dt_nasc;

	public Cliente(String cpf) {
		this.cpfCliente = cpf;
	}

	public Cliente(int id, String nome, String sobrenome) {
		this.idCliente = id;
		this.nomeCli = nome;
		this.sobrenomeCli = sobrenome;
	}

	public Cliente() {

	}

	public Cliente(int id, String nome, String sobrenome, String email, String cpf, Date nascimento) {
		this.idCliente = id;
		this.nomeCli = nome;
		this.sobrenomeCli = sobrenome;
		this.email = email;
		this.cpfCliente = cpf;
		this.dt_nasc = nascimento;
	}

	public String getNomeCli() {
		return nomeCli;
	}

	public void setNomeCli(String parametroNomeCli) {
		this.nomeCli = parametroNomeCli;
	}

	public String getSobrenomeCli() {
		return sobrenomeCli;
	}

	public void setSobrenomeCli(String parametroSobrenomeCli) {
		this.sobrenomeCli = parametroSobrenomeCli;
	}

	public String getEmailCli() {
		return email;
	}

	public void setEmailCli(String parametroEmailCli) {
		this.email = parametroEmailCli;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int parametroIdCliente) {
		this.idCliente = parametroIdCliente;
	}

	public String getCPFCliente() {
		return cpfCliente;
	}

	public void setCPFCliente(String parametroCPFCliente) {
		this.cpfCliente = parametroCPFCliente;
	}

	public Date getNascCliente() {
		return dt_nasc;
	}

	public void setNascCliente(Date parametroNascCliente) {
		this.dt_nasc = parametroNascCliente;
	}

	// Fim da classe
}
