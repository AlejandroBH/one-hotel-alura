package controller;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

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

	public List<Reserva> buscar() {
		return this.reservaDAO.buscar();
	}

	public List<Reserva> buscarId(String id) {
		return this.reservaDAO.buscarId(id);
	}

	public void actualizar(Date fechaEntrada, Date fechaSalida, String valor, String formaPago, Integer id) {
		this.reservaDAO.Actualizar(fechaEntrada, fechaSalida, valor, formaPago, id);
	}

	public void Eliminar(Integer id) {
		this.reservaDAO.Eliminar(id);
	}

}