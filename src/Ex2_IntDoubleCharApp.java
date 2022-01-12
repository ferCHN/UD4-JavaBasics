public class Ex2_IntDoubleCharApp {

	public static void main(String[] args) {
		
		int N = 5;
		double A = 4.56;
		char C = 'a';
		
		//el char 'a' lo convierto a integer mediante ASCII ya que es solo una letra
		int asciiValue = C;
		
		//el resto son calculos matematicos
		double suma = N+A;
		double resta = A-N;
		
		//se muestra por pantalla todo
		System.out.println("Variable N: "+N);
		System.out.println("Variable A: "+A);
		System.out.println("Variable C: "+C);
		System.out.println();
		System.out.println("La suma de N + A: "+suma);
		System.out.println("La diferencia de A - N: "+resta);
		System.out.println("El valor numérico correspondiente al caracter que contiene la variable C: "+asciiValue);
		
	}

}
