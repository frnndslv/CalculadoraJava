import java.util.Scanner;

public class Exercicios {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        vetores();
    }
    
    public static void vetores(){
        /*  Construa um programa que leia em um vetor uma sequência de 5 números digitadospelo usuário, calcule a média destes valores 
       em um outro vetor, e depois apresentena tela quais valores que são menores, iguais ou superiores à média. */
        int[] numero = new int[5];
        int soma = 0;
       

        for(int i = 0; i < numero.length ; i ++ ){
            System.out.println("Digite o numero da posição  "+ i + ": ");
            numero[i] = scan.nextInt();

        }
        for(int i = 0 ; i < numero.length ; i++ ){
            soma = soma + numero[i];

        } 
        int media = soma / numero.length;

    
        for(int i = 0; i < numero.length ; i++ ){
            if(numero[i] > media){
                System.out.println("Numero " + numero[i] + " é maior que a media.");
            }else if(numero[i] < media){
                System.out.println("Numero " + numero[i] + " é menor que a media.");

            }else if(numero[i] == media){
                System.out.println("Numero " + numero[i] + " é igual a media.");
            }
        }
        

    }
}
