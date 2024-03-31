

public class Contato {
    private String nome;
    private String telefone;


    public  Contato(){

    }
    public  Contato(String nome, String telefone){
        this.nome= nome;
        this.telefone= telefone;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    // criar contato
    public void criarContato(){
        
        System.out.println("digite o nome do Contato: \n");
        this.nome = Console.lerString();
        System.out.println("digite o numero do Contato: \n");
        this.telefone = Console.lerString();
        System.out.println("Contato criado com sucesso!!!");

    }

    @Override
    public String toString() {
        
        String toString = "nome:" + this.nome + "telefone" + this.telefone;
        return toString;
    }
    
    
    

}
