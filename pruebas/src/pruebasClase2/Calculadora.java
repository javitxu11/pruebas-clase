package pruebasClase2;

public class Calculadora {

	
	public int sumar(int a, int b) {
		return a +b;
	}
	
	public int restar(int a, int b) {
		return a -b;
	}
	
	public int multiplicar(int a, int b) {
		
		int resultado=0;
		for(int i=0;i<b;i++) {
			resultado= resultado +a;
		}
		
		return resultado;
		
	}
	public double cuadrado(int a) {
		return Math.pow(a,2.0);
	}
	
	
	public static void main(String  []args) {
		Calculadora c= new Calculadora();
		
		System.out.println(" 2 + 3 = "+ c.sumar(2,3));
		
		System.out.println("5 - 2 = "+c.restar(5,2));
		
		System.out.println();
		
	}
}
