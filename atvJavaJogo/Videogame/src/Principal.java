public class Principal{

    public static void main(String[] args) {

        //exer1();
        //exer2();
        exer3();
    }   
    public static void exer1(){
        /*Em um mundo cada vez mais digital, um grupo de amigos apaixonados por videogames percebe
     uma oportunidade de combinar seus hobbies com a prática de programação. Eles decidem criar
    um sistema para gerenciar perfis de jogadores em seus jogos favoritos, algo que permitiria
    acompanhar o progresso, as conquistas e as estatísticas de cada jogador de forma personalizada
    e automatizada.
    Inspirado por esse projeto entre amigos, o desafio é desenvolver uma parte desse sistema de
    gerenciamento de jogadores utilizando Java, com um foco especial na orientação a objetos. O
    sistema deve permitir a criação de perfis de jogadores, armazenando informações como nome,
    pontuação e nível. Além disso, deve ser possível atualizar a pontuação e o nível dos jogadores no
    Sistema.
    */

        PerfJogador perfil1 = new PerfJogador();
        int numeroMenu;
        do {
            System.out.println("Informe uma opção: ");
            System.out.println("1) Criar Perfil do jogador");
            System.out.println("2) Exibir informaçoes do perfil do jogador");
            System.out.println("3) Atualizar o nivel do jogador");
            System.out.println("4) Atualizar a pontuação do jogador");
            System.out.println("0) finalizar programa");
            numeroMenu = Console.lerInt();
            

            if(numeroMenu !=1 && numeroMenu !=2 && numeroMenu !=3 && numeroMenu !=4 && numeroMenu !=0 ){
                System.out.println("Opção invalida!! \n" );

            }else if(numeroMenu ==1){
                perfil1 = PerfJogador.criarPerfil();

            }else if(numeroMenu ==2){
                if(perfil1.getNome()!=null){
                    perfil1.visualizarPerfil();
                }else {
                    System.out.println("Voce ainda nao criou um perfil de jogador, visualização indisponivel. \n");
                    System.out.println("Porfavor crie um perfil de jogador!! ");
                }
            }else if(numeroMenu ==3){
                if(perfil1.getNome()!=null){
                    perfil1.atualizarnivel();
                }else {
                    System.out.println("Voce ainda nao criou um perfil de jogador, Atualização de nivel indisponivel. \n");
                    System.out.println("Porfavor crie um perfil de jogador!! ");
                }     
            }else if(numeroMenu ==4){
                if(perfil1.getNome()!=null){
                    perfil1.atualizarPontuacao();
                }else {
                    System.out.println("Voce ainda nao criou um perfil de jogador, visualização de pontuação indisponivel. \n");
                    System.out.println("Porfavor crie um perfil de jogador!! ");
                }    
            }
            
        } while (numeroMenu !=0);
        System.out.println("\nprograma finalizado");
    }
    public static void exer2() {
        /*
        Inspirado pela organização de um grande evento de networking, onde os participantes trocam
        contatos e informações profissionais, um desenvolvedor decide criar um sistema para gerenciar
        uma agenda de contatos. Este sistema ajudará os usuários a manter suas conexões organizadas,
        permitindo-lhes adicionar, remover e buscar contatos facilmente.
        */
        //instanciei agenda 
        Agenda ag1= new Agenda();
        
        int numeroMenu;

        do{
            System.out.println("Informe uma opção: ");
            System.out.println("4) Quantidade de contatos possiveis na sua agendA ");
            System.out.println("1) Adicionar contato a agenda");
            System.out.println("2) Buscar contato pelo nome ");
            System.out.println("3) excluir contato da agenda");
            System.out.println("0) sair");
            numeroMenu = Console.lerInt();

            if(numeroMenu !=1 && numeroMenu !=2 && numeroMenu !=3 && numeroMenu !=4 && numeroMenu !=0 ){
                System.out.println("Opção invalida!! \n" );

            }
            else if(numeroMenu ==1){
                ag1.adContatosAgenda();
                
            }else if(numeroMenu ==2){
                ag1.buscarContato();
                
            }else if(numeroMenu ==3){
                ag1.excluircontato();
    
            }
        } while (numeroMenu !=0);
        System.out.println("\nprograma finalizado");
        
        
    }
    public static void exer3(){
        /*Em uma tranquila cidade conhecida por sua paixão por automobilismo, um grupo de entusiastas
        de carros clássicos decide organizar um evento para exibir seus veículos. Para tornar o evento mais
        interessante, eles planejam criar um sistema que permita aos participantes registrarem seus
        carros, incluindo informações detalhadas e a capacidade de controlar algumas funcionalidades
        dos carros, como a velocidade.
        Motivado por esse evento de carros clássicos, o desafio é desenvolver uma classe `Carro` em Java,
        aplicando os princípios da orientação a objetos. Este sistema deve permitir aos usuários criarem
        objetos `Carro` com informações como marca, modelo, ano e velocidade atual. Além disso, os
        carros devem ter métodos que permitam acelerar e frear, ajustando a velocidade atual de acordo
        com a ação realizada. */
        Carro carro1 = new Carro();
        
        int numeroMenu;

        do{
            System.out.println("Informe uma opção: ");
            System.out.println("1) Cadastrar carro");
            System.out.println("2) Acelerar o carro ");
            System.out.println("3) frear o carro");
            System.out.println("0) sair");

            numeroMenu = Console.lerInt();

            if(numeroMenu !=1 && numeroMenu !=2 && numeroMenu !=3 && numeroMenu !=4 && numeroMenu !=0 ){
                System.out.println("Opção invalida!! \n" );

            }else if(numeroMenu ==1){
                carro1.criarCarro();
                
            }else if(numeroMenu ==2){
                
                carro1.acelerar();
                
            }else if(numeroMenu ==3){
                carro1.frear();
    
            }
        } while (numeroMenu !=0);
        System.out.println("\nprograma finalizado");
    }

    
}