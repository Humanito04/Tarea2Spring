package equipo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Delantero implements Jugador{

	private JugadorExperimentado jugador;
	
	@Autowired
	public Delantero(JugadorExperimentado jugador) {
		this.jugador=jugador;
	}
	
	@Override
	public String getCorrer() {
		// TODO Auto-generated method stub
		return jugador.getCorrer();
	}

	@Override
	public String getChutar() {
		// TODO Auto-generated method stub
		return jugador.getChutar();
		
	}

	

}
