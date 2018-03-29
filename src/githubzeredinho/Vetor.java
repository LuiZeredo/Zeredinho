package githubzeredinho;

import java.util.Random;

public class Vetor {
    private int vet[];
    private int vetConcat[];
    private int size;
    private int cont=0;
    private boolean igual = false;
    private int i=0;
    private int tamVet;
    
   
    public Vetor(int tam){
        vet = new int[tam];
        size = tam;
    }
    
  
    public void randomFill(){
        Random rand = new Random();
        for(cont =0 ; cont < size ; cont ++){
            vet[cont] = 2 + rand.nextInt();
        }
    }
    
    
    public void bubbleSort(){
        int troca;
        int aux;
        troca = 1;
        while (troca == 1)
        {
            troca = 0;        
            for (int i = 0; i <= 3; i++)
            {
                if (vet[i] > vet[i + 1])
                {
                    troca = 1;
                    aux = vet[i];
                    vet[i] = vet[i + 1];
                    vet[i + 1] = aux;
                }
            }
        }
    }
    
   
    public String toString(){
        String vetores[] = new String[size];
        for(cont=0; cont<size;cont++){
            vetores[cont] = Integer.toString(vet[cont]) ;
        }
        return vetores[size];
    }
    
  
    public boolean equals(int[] v){
        for(cont=0; cont<size;cont++){
            if(vet[cont] == v[cont]){
                i++;
            }
        }
        if(i == size){
            igual = true;
        }
        return igual;
    }
    
   
    public void setAt(int posicao, int value1){
        vet[posicao] = value1;
    }
    

    public int valueAt(int posicao){
        return vet[posicao];
    }
    
    
    public int length(){
        tamVet = vet.length;
        return tamVet;
    }
    
  
    public int Concat(Vetor v){
        for(cont=0;cont<(size + v.length()); cont ++){
            if(cont<size){
                vetConcat[cont] = vet[cont];
            }else{
                vetConcat[cont] = v[cont];
            }
        }
        return vetConcat[cont];
    }
}
