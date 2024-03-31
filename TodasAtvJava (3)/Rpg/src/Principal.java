public class Principal {

    public static void main(String[] args) {
        //pegar informações de um heroi
        

        

        
        /*Crie um menu que apresente os seguintes itens:
            1) Cadastrar Herói
            2) Exibir dados do Herói
            3) Atacar!
            0) Sair
            Informe uma opção: */

        Heroi h1 = new Heroi();

        int numeroMenu;
        
        
        do {
            System.out.println("Informe uma opção: \n");
            System.out.println(" 1) cadastrar heroi\n");
            System.out.println(" 2) Exibir dados do Herói\n");
            System.out.println(" 3) Atacar!\n");
            System.out.println(" 0) Sair\n");
            
            numeroMenu = Console.lerInt();

            if(numeroMenu!= 1 && numeroMenu!=2 && numeroMenu!= 3 && numeroMenu!= 0){

                System.out.println("Opção inválida, digite novamente");
                
    
            } else if (numeroMenu == 1){
                System.out.println(" Cadastre o Herói: \n");
                h1 = cadastrarHeroi();

                
            }else if (numeroMenu == 2){
                if(h1.getNome()!=null){
                    System.out.println(" Exibindo dados do Herói: \n");
                    h1.mostrarDados();
                }else {
                   System.out.println("Cadastre um herói antes de exibir seus dados"); 
                }
                

                
    
                
            }else if (numeroMenu == 3){
                if(h1.getNome()!=null){
                    h1.atacar();
                    
                }else{
                    System.out.println("Heroi nao cadastrado.\n");
                    System.out.println("Cadastre um heroi para atacar.\n");
                }
                
                
                
            }
            
        } while ( numeroMenu!=0);
        System.out.println("o programa foi finalizado");
       
    }

    public static Heroi cadastrarHeroi(){
        Heroi heroiGenerico = new Heroi();
        System.out.println("Nome do heroi:\n");
        heroiGenerico.setNome(Console.lerString());
        System.out.println("Raça do heroi:\n");
        heroiGenerico.setRaca(Console.lerString());
        System.out.println("Golpe especial do heroi:\n");
        heroiGenerico.setGolpeEspecial(Console.lerString());
        return heroiGenerico;

    }

    
}