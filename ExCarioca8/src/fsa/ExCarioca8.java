
package fsa;
//Crie um programa que leia o nome e a idade de várias pessoas e exiba a média das idades
import java.util.Scanner;


public class ExCarioca8 {

    public static void main(String[] args) {
        int qtdPessoa, indice, somaIdade = 0;
        double media;
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Quantas pessoas vão ser registradas?:");
        qtdPessoa = scanner.nextInt();
        
        String[] nomePessoas = new String[qtdPessoa];
        
        int[] idades = new int[qtdPessoa];

        for(indice=0; indice<qtdPessoa; indice++){
            
            System.out.println("Digite a idade respectiva:");
            idades [indice] = scanner.nextInt();
            
            //System.out.println("Digite o nome:");
            //nomePessoas [indice] = scanner.nextLine();
          
            somaIdade += scanner.nextInt();
        }
        media = somaIdade/qtdPessoa;
        System.out.println("A media da idade dessas pessoas é:"+media);
    }
    
}
