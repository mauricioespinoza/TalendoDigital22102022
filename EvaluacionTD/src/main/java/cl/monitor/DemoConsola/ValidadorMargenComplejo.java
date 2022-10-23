package cl.monitor.DemoConsola;

public class ValidadorMargenComplejo implements ValidadorMargen {

	@Override
	public String Validador(double Precio, double Costo) {
		double Margen = ((Precio - Costo)/Precio) * 100;
		String resultado = null;
		if (Margen > 100 && Precio >= 1000) {
			resultado ="ADVERTENCIA POSIBLE ERROR EN COSTO";
		}
		else if (Margen > 50 && Precio < 1000) {
			resultado ="ADVERTENCIA POSIBLE ERROR COSTO";
		}
		else if (Margen < 10 && Margen > 0) {
			resultado ="ALERTA MARGEN BAJO MINIMO";		
		}
		else if (Margen >= 10) {
			resultado ="MARGEN OK";	
		}
		else if (Margen < 0){
			resultado ="ERROR MARGEN NEGATIVO";
		}
		return resultado;
	}

}
