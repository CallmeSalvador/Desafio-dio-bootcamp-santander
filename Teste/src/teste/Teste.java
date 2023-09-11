package teste;

import java.util.ArrayList;
import java.util.Collections;
//import java.text.DecimalFormat;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList< String> ativos = new ArrayList<>();

        int quantidadeAtivos = scanner.nextInt();

        for (int i = 0; i < quantidadeAtivos+1; i++) {
            String codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);
        }

        Collections.sort(ativos);
        
        for (int i = 0; i < quantidadeAtivos+1; i++) {
            System.out.println(ativos.get(i));
        }

    }

}
