package model.personajes.modos;

import model.ataque.AtaqueBasico;
import model.atributos_de_unidad.Modo;

public class GohanNormal extends Modo {

    public GohanNormal() {
    	nombre = "Gohan Normal";
    	velocidad = 2;
    	distanciaDeAtaque = 2;
     	ataqueBasico = new AtaqueBasico(20);
     	
     	costoKiSiguienteTransformacion = 10;
        siguienteModo = new GohanSSJFase1();
    }
    
}
