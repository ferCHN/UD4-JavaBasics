
public class Ex3_VariablesX_Y_N_MApp {

	public static void main(String[] args) {
		
		//Declaro las variables
		int X=5, Y=6;
		double N=5.25, M=7.75;
		
		//realizo los calculos matematicos
		int sumaXY = X+Y; double sumaNM = N+M; int sumaXN = (int) (X+N);
		int diferenciaXY = X-Y; double diferenciaNM = N-M;
		int productoXY= X*Y; double productoNM = N*M;
		int cocienteXY= X/Y; double cocienteNM = N/M; int cocienteYM = (int) (Y/M);
		int restoXY= X%Y; double restoNM = N%M; int restoYM = (int) (Y%M);
		int dobleX= X*2; int dobleY = Y*2;
		double dobleN = N*2; double dobleM = M*2;
		int sumaVariables = (int) (X+Y+N+M);
		int productoVariables = (int) (X*Y*N*M);
		
		//Muestro por consola los resultados
		System.out.println("Valor de la variable X: "+X);
		System.out.println("Valor de la variable Y: "+Y);
		System.out.println("Valor de la variable N: "+N);
		System.out.println("Valor de la variable M: "+M);
		System.out.println();
		System.out.println("La suma X + Y: "+sumaXY);
		System.out.println("La diferencia X - Y: "+diferenciaXY);
		System.out.println("El producto X * Y: "+productoXY);
		System.out.println("El cociente X / Y: "+cocienteXY);
		System.out.println("El resto X % Y: "+restoXY);
		System.out.println("La suma N + M: "+sumaNM);
		System.out.println("La diferencia N - M: "+diferenciaNM);
		System.out.println("El producto de N * M: "+productoNM);
		System.out.println("El cociente N / M: "+cocienteNM);
		System.out.println("El resto N % M: "+restoNM);
		System.out.println("La suma de X + N: "+sumaXN);
		System.out.println("El cociente Y / M: "+cocienteYM);
		System.out.println("El resto Y % M: "+restoYM);
		System.out.println("El doble de cada variable: X="+dobleX+" Y="+dobleY+" N="+dobleN+" M="+dobleM);
		System.out.println("La suma de todas las variables: "+sumaVariables);
		System.out.println("El producto de todas las variables: "+productoVariables);
	}

}
