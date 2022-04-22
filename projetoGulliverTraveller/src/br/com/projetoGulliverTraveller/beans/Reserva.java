package br.com.projetoGulliverTraveller.beans;

import br.com.projetoGulliverTraveller.beans.*;

public class Reserva {
	
	private int fkIdEst;
	private int fkIdCliente;
	private int idReserva;
	
	public Reserva(int idReserva) {
		  this.idReserva 	= idReserva;
	}
	
	public Reserva() {
		  
	}

	public Reserva(int id, int cliente, int estabelecimento) {
		  this.fkIdEst 	    = id;
		  this.fkIdCliente  = cliente;
		  this.idReserva    = estabelecimento;
	}
	
	public int getFkIdEst() {
		return fkIdEst;
	}
	public void setFkIdEst(int fkIdEst) {
		this.fkIdEst = fkIdEst;
	}
	public int getFkIdCliente() {
		return fkIdCliente;
	}
	public void setFkIdCliente(int fkIdCliente) {
		this.fkIdCliente = fkIdCliente;
	}
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}	

}
