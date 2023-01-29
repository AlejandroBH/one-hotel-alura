package controller;

import java.sql.Connection;

import dao.ReservaDAO;
import factory.ConnectionFactory;
import model.Reserva;

public class ReservasController {

	private ReservaDAO reservaDAO;

	public ReservasController() {
		Connection connection = new ConnectionFactory().recuperaConexion();
		this.reservaDAO = new ReservaDAO(connection);
	}

	public void guardar(Reserva reserva) {
		this.reservaDAO.guardar(reserva);
	}

}
