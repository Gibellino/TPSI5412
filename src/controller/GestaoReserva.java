package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;
import model.Reserva;
import model.Restaurante;

public class GestaoReserva {

	Scanner read = new Scanner(System.in);
	
	public Cliente addC(){
		
		System.out.printf("Insira o nome do cliente: ");
		String nome = read.nextLine();
		
		System.out.printf("Insira a morada do cliente: ");
		String morada = read.nextLine();
		
		System.out.printf("Insira o mail do cliente: ");
		String mail = read.nextLine();
		
		System.out.printf("Insira o numero de telemovel do cliente: ");
		String tlm = read.nextLine();
		
		Cliente c = new Cliente(nome,morada,mail,tlm);
		
		return c;
	}
	
	public Restaurante addRt(){
		
		System.out.printf("Insira o nome do restaurante: ");
		String nome = read.nextLine();
		
		System.out.printf("Insira a morada do restaurante: ");
		String morada = read.nextLine();
		
		System.out.printf("Insira o numero de telemovel do restaurante: ");
		String contacto = read.nextLine();
		
		System.out.printf("Insira a especialidade do restaurante: ");
		String espec = read.nextLine();
		
		Restaurante r = new Restaurante(nome, morada, contacto, espec);
		
		return r;
		
	}
	
	public void addR(ArrayList<Reserva> r){
		
		Cliente c = addC();
		Restaurante rt = addRt();
		
		Reserva rs = new Reserva();
		
		r.get(0).getCliente().add(c);
		r.get(0).getRestaurante().add(rt);
		
	}
}
