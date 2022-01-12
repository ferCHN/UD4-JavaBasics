
public class Ex5_VariablesA_B_C_DApp {

	public static void main(String[] args) {
		
		int A = 4;
		int B = 5;
		int C = 7;
		int D = 9;
		
		//Muestro por consola de cada variable
		System.out.println("Valor principal de cada variable: A="+A+" B="+B+" C="+C+" D="+D);
		System.out.println();
		//B tome el valor de C
		B=C;
		//C tome el valor de A
		C=A;
		//A tome el valor de D
		A=D;
		//D tome el valor de B
		D=B;
		
		//Muestro en consola de nuevo cada variable sobre como tomo el otro valor
		System.out.println("Valor que toma cada variable:");
		System.out.println("B toma la C = "+B);
		System.out.println("C toma la A = "+C);
		System.out.println("A toma la D = "+A);
		System.out.println("D toma la B = "+D);
	}

}
