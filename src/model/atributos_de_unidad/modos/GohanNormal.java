package model.atributos_de_unidad.modos;

import model.Unidad;
import model.atributos_de_unidad.Modo;

public class GohanNormal extends Modo {

	private int velocidad = 2;

	@Override
	public boolean puedeTransformarse(Unidad u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Modo transformarA(Unidad u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNombre() {
		return "Normal";
	}

	@Override
	public int getVelocidad() {
		return velocidad;
	}
}