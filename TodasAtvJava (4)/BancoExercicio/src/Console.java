import java.util.Scanner;

public class Console {
    /*Inspirado por essa necessidade comunitária, o objetivo é desenvolver um sistema bancário simples
    em Java, focando na orientação a objetos. Este sistema permitirá a criação de contas bancárias,
    cada uma capaz de realizar operações básicas como depósitos, saques e consultas de saldo. O
    desafio é estruturar o programa de forma que cada conta seja um objeto, refletindo os princípios
    da programação orientada a objetos. */
    public static Scanner leitor = new Scanner(System.in);



    public static String lerString(){
        String valor = leitor.nextLine();
        return valor;
    }
    public static int lerInt(){
        int valor = leitor.nextInt();
        leitor.nextLine();
        return valor;
    }
    public static float lerFloat(){
        float valor = leitor.nextFloat();
        leitor.nextLine();
        return valor;
    }
    
}
