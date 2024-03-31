public class Principal {
    /*Inspirado por essa necessidade comunitária, o objetivo é desenvolver um sistema bancário simples
    em Java, focando na orientação a objetos. Este sistema permitirá a criação de contas bancárias,
    cada uma capaz de realizar operações básicas como depósitos, saques e consultas de saldo. O
    desafio é estruturar o programa de forma que cada conta seja um objeto, refletindo os princípios
    da programação orientada a objetos. */
    public static void main(String[] args) {

        ContaBanc conta1 = new ContaBanc(); 
        int numeroMenu;

        do {
            System.out.println("Informe a opção desejada:\n ");
            System.out.println("1) Criar conta bancaria\n ");
            System.out.println("2) Visualizar saldo\n");
            System.out.println("3) Efetuar deposito\n");
            System.out.println( "4) Sacar\n");
            System.out.println("0) finalizar programa \n");
            numeroMenu = Console.lerInt();
    
            if( numeroMenu!=1 && numeroMenu!=2 && numeroMenu!=3 && numeroMenu!=4 && numeroMenu!=0 ){
                System.out.println("Opçao invalida\n");

            }else if(numeroMenu==1){
                conta1 = cadastroConta();
                System.out.println("conta criada com sucesso!!\n");

            }else if(numeroMenu==2){
                if(conta1.getTitular()!=null){
                    System.out.println("O seu saldo é de : " + conta1.getSaldo() + "\n"); 
                    
                }else {
                    System.out.println("Voce ainda nao possui uma conta, porfavor crie uma conta.!!\n" );
                }

   
            }else if(numeroMenu==3){
                //deposito
                if(conta1.getTitular()!=null){
                    conta1.depositar();

                }else {
                    System.out.println("Voce ainda nao possui uma conta, porfavor crie uma conta.!!\n" );
                }

            }else if(numeroMenu==4){//sac
                if(conta1.getTitular()!=null){
                    conta1.sacar();
                    
                }else {
                    System.out.println("Voce ainda nao possui uma conta, porfavor crie uma conta.!!\n" );
                }
                
            }
               
        } while (numeroMenu!=0);
        System.out.println("Programa finalizado");
    }
    public static ContaBanc cadastroConta(){
        ContaBanc contaGenerica = new ContaBanc();
        System.out.println("Digite o nome do titular da conta\n");
        contaGenerica.setTitular(Console.lerString());
        System.out.println("Digite o numero da conta\n");
        contaGenerica.setNumeroConta(Console.lerInt());
        System.out.println("Digite saldo da conta\n");
        contaGenerica.setSaldo(Console.lerFloat());
        
        return contaGenerica;
    }    
}
