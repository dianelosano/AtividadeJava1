package br.com.projetoGulliverTraveller.beans;


public class Destino {

	private String nomeDestino;
	private int idDestino;	
	private int fkIdCid; 
	
	public Destino(int id) {
		  this.idDestino 	= id;
		}
		
	public Destino() {
		  
	}
	
	public Destino(int id, String nome, int fkIdCid) {
		  this.idDestino 	= id;
		  this.nomeDestino  = nome;
		  this.fkIdCid      = fkIdCid;
		}
	
	public String getNomeDestino() {
		return nomeDestino;
	}
	public void setNomeDestino(String nomeDestino) {
		this.nomeDestino = nomeDestino;
	}
	public int getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}
	public int getFkIdCid() {
		return fkIdCid;
	}
	public void setFkIdCid(int fkIdCid) {
		this.fkIdCid = fkIdCid;
	}
	
}
