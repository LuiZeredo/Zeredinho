package githubzeredinho;

import githubzeredinho.Vetor;
import java.util.Scanner;


public class GitHubZeredinho {

     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tam;
        int posicao;
        int value;
        System.out.println("Digite o tamanho do seu vetor: ");
        tam = ler.nextInt();
        Vetor vet = new Vetor(tam);
        Vetor vet2 = new Vetor(tam);
        vet.randomFill();
        vet2.randomFill();
        vet.bubbleSort();
        vet.toString();
        
        System.out.println("Digite a posição do seu vetor e o valor que deseja modificar: ");
        posicao = ler.nextInt();
        value = ler.nextInt();
        
        vet.setAt(posicao, value);
        vet.valueAt(posicao);
        vet.equals(vet2);
        vet.length();
        
        
    }
    
}
