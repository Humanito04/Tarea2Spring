package equipo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class JugadorExperimentado implements Jugador{
	

	@Override
	public String getCorrer() {
		
		return "Está corriendo hacia la porteria";
	}

	@Override
	public String getChutar() {
		// TODO Auto-generated method stub
		return "Ha chutado el balon a la porteria";
	}

	

	
}
