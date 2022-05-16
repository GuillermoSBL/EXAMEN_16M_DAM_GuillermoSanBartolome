package coso;
import java.util.Scanner;

public class EXAMEN_16M_PRIMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Buenos dias Ceinmark, soy Guillermo San Bartolome \n Introduce"
				+ " un numero para saber si es primo o no:");
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		numero = entrada.nextInt();
		
		int contador = 0;
		
		for(int a = 1; a <= numero; a++)
        {
            if((numero % a) == 0)
            {
                contador++;
            }
        }
 
        if(contador <= 2)
        {
            System.out.println("El " + numero + " es primo");
        }else{
            System.out.println("El " + numero + " no es primo");
        }		
		    for(int i = 1 ; i <=numero ; i++){
		        if(numero%i==0){
		            System.out.println("Estos son los numeros divisores del " + numero + ": " +i);
		        }
		    }

	}

}
