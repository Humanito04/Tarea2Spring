package equipo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(JugadorConfig.class);

		Delantero manolo = contexto.getBean("delantero",Delantero.class);
		
		System.out.println(manolo.getChutar());
		
		System.out.println(manolo.getCorrer());
		
		
		
		contexto.close();
	}

}
