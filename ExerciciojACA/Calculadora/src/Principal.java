

public class Principal{
    public static void main(String[] args) {
        
        /* desenvolver sua própria calculadora digital em Java.
        Essa calculadora simplificada deverá realizar as quatro operações matemáticas básicas: adição,
        subtração, multiplicação e divisão. Além disso, ele quer garantir que a calculadora seja fácil de
        usar, com métodos claramente definidos para cada operação. */
        /* float n1 = Console.lerFloat();
            float n2 = Console.lerFloat(); */
        Calculadora cal = new Calculadora();
        int numeroMenu;
        do {

            System.out.println("Informe o numero da operação desejada:\n");
            System.out.println("1) Soma");
            System.out.println("2) Subtraçao");
            System.out.println("3) Divisão");
            System.out.println("4) Mutiplicacão");
            System.out.println("0) finalizar");

            numeroMenu = Console.lerInt();


            
            

                if(numeroMenu!= 1 && numeroMenu!= 2 && numeroMenu!= 3  && numeroMenu!= 4  && numeroMenu!= 0 ){
                System.out.println("Opção invalida!!");

                }else if(numeroMenu== 1){
                        
                    System.out.println("Digite o primeiro numero");
                    float n1 = Console.lerFloat();
                    System.out.println("Digite o segundo numero: \n");
                    float n2 = Console.lerFloat();
                   
                    System.out.println("o resultado da operação é ; " + cal.soma(n1,n2) );
                     
                    
                }else if(numeroMenu== 2){
                    
                    System.out.println("Digite o primeiro numero");
                    float n1 = Console.lerFloat();
                    System.out.println("Digite o segundo numero: \n");
                    float n2 = Console.lerFloat();
                    System.out.println("o resultado da operação é ; " + cal.subtracao(n1, n2));
                    
                }else if(numeroMenu== 3){
                    
                    
                    System.out.println("Digite o primeiro numero");
                    float n1 = Console.lerFloat();
                    System.out.println("Digite o segundo numero: \n");
                    float n2 = Console.lerFloat();

                    if(n2!=0){
                        System.out.println("o resultado da operação é ; " + cal.divisao(n1,n2));
                    
                        

                    }else {
                        System.out.println("Não se pode dividir nada por zero, resultado indeterminado ");
                    }
                    


                }else if(numeroMenu== 4){
                    
                    System.out.println("Digite o primeiro numero");
                    float n1 = Console.lerFloat();
                    System.out.println("Digite o segundo numero: \n");
                    float n2 = Console.lerFloat();
                    System.out.println("o resultado da operação é ; " + cal.mutiplicacao(n1,n2));
                    
                    
                }
            
        } while (numeroMenu!=0);

        System.out.println("Programa finalizado");
        



    }
}