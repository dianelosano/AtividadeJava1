package br.com.projetoGulliverTraveller.implementacao;

import br.com.projetoGulliverTraveller.beans.Cliente;
import br.com.projetoGulliverTraveller.beans.Destino;
import br.com.projetoGulliverTraveller.beans.Reserva;

public class TesteUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente objeto = new Cliente();
		objeto.setNomeCli("Gulliver");		
		objeto.setSobrenomeCli("Traveller");
		objeto.setIdCliente(1);
		
		System.err.println("Teste Cliente");
		
		System.out.println(objeto.getNomeCli());
		System.out.println(objeto.getSobrenomeCli());
		System.out.println(objeto.getIdCliente());
		
		
		Destino objetoDestino = new Destino();
		
		objetoDestino.setFkIdCid(1);
		objetoDestino.setIdDestino(1);
		objetoDestino.setNomeDestino("Osasco");
		
		System.err.println("Teste Destino");
		
		System.out.println(objetoDestino.getFkIdCid());
		System.out.println(objetoDestino.getIdDestino());
		System.out.println(objetoDestino.getNomeDestino());
		
		
		//teste Reserva
		
		Reserva objetoReserva = new Reserva();
		
		objetoReserva.setFkIdCliente(1);
		objetoReserva.setFkIdEst(1);
		objetoReserva.setIdReserva(1);
		
		System.err.println("Teste Reserva");
		
		System.out.println(objetoReserva.getFkIdCliente());
		System.out.println(objetoReserva.getFkIdEst());
		System.out.println(objetoReserva.getIdReserva());
	}

}
