
package edu.desafiodio.controledefluxo;

// autora: CallmeSalvador

import java.util.Scanner;


public class Contador {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2;
        
        System.out.println("Digite o primeiro parâmetro:");
        valor1 = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        valor2 = scanner.nextInt();
        
        try{ 
            contar(valor1, valor2);
        }
        catch(ParametrosInvalidosException Exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

        
    }
    static void contar(int a, int b) throws ParametrosInvalidosException{
        int indice, contagem;
        contagem = b-a;
        
        if(a>b){
          throw new ParametrosInvalidosException();
        }
        
        for(indice=1; indice<= contagem; indice++){
                System.out.println("Imprimindo o número"+ indice);
            }

    }
    

}
    

