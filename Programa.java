package programa3;
import java.util.Scanner;

public class Programa {
	
	/*1. El cuadrado y la ra�z cuadrada de cada valor.
	2. Bhaskara utilizando ax2+ bx + c.  (ax est� al cuadrado, el 2 va arriba chiquito!!!)
	3. El mayor de tres n�meros, reutilizando el m�todo que calcula el mayor de 2.
	0. Salir. Deber� investigar en la API de Java u otro sitio web acerca de los m�todos de la clase Math.*/
	
	Scanner en = new Scanner(System.in);

	double a, b, c;

		void iniciar(){
			//escribe aqu� t� c�digo
			System.out.println("MENU");
	    
			int w=0;
	    
			switch(w) {
			case 1: System.out.println("1. El cuadrado y la ra�z cuadrada de cada valor.");
			
			System.out.println("ingrese tres valores");
			a=en.nextDouble();
			b=en.nextDouble();
			c=en.nextDouble();
			Cuadrado();
			break;
		case 2: System.out.println("2. Bhaskara utilizando ax2+ bx + c.  (ax est� al cuadrado, el 2 va arriba chiquito!!!)");
			Bhaskara();
			break;
		case 3: System.out.println("3. El mayor de tres n�meros, reutilizando el m�todo que calcula el mayor de 2.");
			break;
case 0: System.out.println("0. Salir. Deber� investigar en la API de Java u otro sitio web acerca de los m�todos de la clase Math.");
			break;
		}
			System.out.println("elija una opcion");
			w=en.nextInt();
	}  
		
		
		/////Escribe aqui el codigo que necesites para resolver el problema
		void Cuadrado() {
			
			double raiz1=Math.sqrt(a);
			double raiz2=Math.sqrt(b);
			double raiz3=Math.sqrt(c);
			
			System.out.println("la raiz del primer valor es " + raiz1);
			System.out.println("la raiz del segundo valor es " + raiz2);
			System.out.println("la raiz del tercer valor es " + raiz3);
		
			
		}
		void Bhaskara() {
			double determinante=Math.pow(b,2)-(4*a*c);
			if (determinante > 0) {
				double x1=((b*(-1)) + Math.sqrt(determinante)/(2*a));
				double x2=((b*(-1)) + Math.sqrt(determinante)/(2*a));
				System.out.println("el valor de x1 es " + x1 + " y el de x2 es " + x2);
			}
		}
	}