package equipo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Extremo implements Jugador{
	
	private JugadorExperimentado jugador;
	
	@Autowired
	public Extremo(JugadorExperimentado jugador) {
		this.jugador = jugador;
	}

	@Override
	public String getCorrer() {
		return jugador.getCorrer();
	}

	@Override
	public String getChutar() {
		return jugador.getChutar();
	}

	

}
