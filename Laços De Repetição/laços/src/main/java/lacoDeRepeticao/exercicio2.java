
/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */



package lacoDeRepeticao;
import java.util.Scanner;


public class exercicio2 {

	public static int main(String[] args) {
		int numeros [10]; //armazena todos os numeros lidos
		int par=0,impar=0;
		int contador = 0; //contador la�o de repeti��o
		
		for(contador=0; contador <10; contador++){
			System.out.println(contador+1); 
			System.out.println(numeros[contador]);	
			
			if(10[contador]%2 == 0 )
			{ //se o reto da divisao for igual a zero o numero � par
			 
				par++;
			}
			else
			{
				impar++;
			}	
		}
		 
		System.out.println(impar); 
		System.out.println(par); 

		return 0;
		}
	/*
	 * 
	 * 
	 */
	