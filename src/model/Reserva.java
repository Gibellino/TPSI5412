package model;

import java.util.ArrayList;

public class Reserva {

	private String data;
	private ArrayList<Cliente> cliente = new ArrayList<Cliente>();
	private ArrayList<Restaurante> restaurante = new ArrayList<Restaurante>();
	
	public Reserva(String data, ArrayList<Cliente> cliente, ArrayList<Restaurante> restaurante) {
		this.data = data;
		this.cliente = cliente;
		this.restaurante = restaurante;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ArrayList<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(ArrayList<Cliente> cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Restaurante> getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(ArrayList<Restaurante> restaurante) {
		this.restaurante = restaurante;
	}

	

}
