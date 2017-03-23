package application;

import java.util.ArrayList;

import controller.GestaoReserva;
import model.Reserva;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Reserva> r = new ArrayList<Reserva>();
		
		new GestaoReserva().addR(r);
	}

}
