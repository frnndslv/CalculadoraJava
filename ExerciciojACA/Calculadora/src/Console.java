import java.util.Scanner;

public class Console {
    
    public static Scanner leitor = new Scanner(System.in);

    public static float lerFloat(){
        float valor = leitor.nextFloat();
        return valor;
    }
    public static int lerInt(){
        int valor = leitor.nextInt();
        return valor;
    }

}
