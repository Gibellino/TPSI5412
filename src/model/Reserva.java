package model;

import java.util.ArrayList;

public class Reserva {

	private String data;
	private ArrayList<Cliente> cliente = new ArrayList<Cliente>();
	private ArrayList<Restaurante> restaurante = new ArrayList<Restaurante>();
	
	public Reserva(){}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ArrayList<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(Cliente c) {
		cliente.add(c);
	}

	public ArrayList<Restaurante> getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante r) {
		restaurante.add(r);
	}

}
