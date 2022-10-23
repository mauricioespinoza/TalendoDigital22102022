package cl.monitor.DemoConsola;

public class ValidadorMargenSimple implements ValidadorMargen {

	@Override
	public String Validador(double Precio, double Costo) {
		double Margen = ((Precio - Costo)/Precio) * 100;
		String resultado = "hola mundo";
		if (Margen >= 10) {
			resultado= "MARGEN OK";	
		}
		else {
			resultado="MARGEN BAJO MINIMO";
		}
		return resultado;
	}

}
