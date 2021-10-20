package Es.Studium.TablaMultiplicar;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int tabla;
		int resultado;
		System.out.println("Dime el numero que quieres ");
		tabla=teclado.nextInt();


		for(int i=0; i<=10;i++) {
			resultado=i*tabla;
			System.out.println("El resultado es " + resultado);


		}

	}
}

/* VARIABLES
	ENTERO tabla
	ENTERO resultado

	INICIO
	ESCRIBIR "Dame un numero"
	LEER tabla
	PARA i=0 HASTA i<=10 HACER
	RESULTADO=i*tabla
	ESCRIBIR "El resultado es " + resultado
	FINPARA
	FIN
 */
