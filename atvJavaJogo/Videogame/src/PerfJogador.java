public class PerfJogador {

    //atributos encapsulados
    private String nome;
    private int pontuacao;
    private int nivel;
    // construtor padrao( nao vou usar mas é sempre bom ter)
    public PerfJogador(){

    }// construtor parametrizado
    public PerfJogador(String nome,int pontuacao, int nivel){
        this.nome = nome;
        this.nivel = nivel;
        this.pontuacao = pontuacao;
    }
    // criei tds os getts e setts
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    public String getNome() {
        return nome;
    }
    public int getPontuacao() {
        return pontuacao;
    }
    public int getNivel() {
        return nivel;
    }
    //metodo criar perfil
    public static PerfJogador criarPerfil(){
        PerfJogador perfilGenerico = new PerfJogador();
        System.out.println("digite o nome do jogador\n");
        perfilGenerico.setNome(Console.lerString());
        System.out.println("digite o nivel do jogador\n");
        perfilGenerico.setNivel(Console.lerInt());
        System.out.println("digite a pontuação do jogador\n");
        perfilGenerico.setPontuacao(Console.lerInt());
        System.out.println("Perfil do jogador criado com sucesso\n");
        return perfilGenerico;

    } // visualizar perfil
    public void visualizarPerfil(){
        
        System.out.println("\n Exibindo Perfil do jogador\n" );
        System.out.println(" o nome do jogador é \n" + this.nome);
        System.out.println(" o nivel do jogador\n" + this.nivel);
        System.out.println(" a pontuação do jogador\n" + this.pontuacao);
        
    }
    // metodo atualizar pontuação
    public void  atualizarPontuacao(){
        
        System.out.println("digite a nova pontuação do jogador\n");
        this.pontuacao = Console.lerInt();
        System.out.println("a nova pontuAÇÃO É :" + this.pontuacao );
        
    }//metodo atualizar nivel
    public void  atualizarnivel(){
        
        System.out.println("digite o novo nivel do jogador\n");
        this.nivel = Console.lerInt();
        System.out.println(" o novo nivel É :" + this.nivel);
    
    }
    

   
    

    


}
