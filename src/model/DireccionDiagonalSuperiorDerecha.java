package model;

import model.error.ErrorPosicionInvalida;

public class DireccionDiagonalSuperiorDerecha extends Direccion{
	
	public Posicion obtenerPosicionNueva(Posicion actual) throws ErrorPosicionInvalida {
		return new Posicion(actual.getX() + 1, actual.getY() - 1);
	}

}