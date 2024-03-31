public class Agenda {

    private Contato[] contato;

    public Agenda(){

    }
    public Agenda(Contato[] contato){
        this.contato = contato;
        
    }

    public Contato[] getContato() {
        return contato;
    }

    public void setContato(Contato[] contato) {
        this.contato = contato;
    }
    
    //criar agenda
    public void adContatosAgenda(){
        
        Contato[] contato = new Contato[3];
        for(int i= 0 ; i<contato.length;i++){
            Contato c1 = new Contato();

            c1.criarContato();
            contato[i] = c1;
        }
        this.contato = contato;
       
    }
    // buscar contato
    public void buscarContato(){
        String nomeBuscar;
        System.out.println("digite o nome do Contato: \n");
        nomeBuscar = Console.lerString();
        boolean encontrou= false;
        for(int i = 0;i<this.contato.length;i++){

            if(this.contato[i].getNome().equals(nomeBuscar) == true){
            
                System.out.println("Contato encontrado ; \n" + this.contato[i].toString());
                encontrou = true;
            }
        } 
        if(encontrou == false) {

            System.out.println("Contato  nao encontrado ; \n");

        }    
    }
    public void excluircontato(){
       
        String nomeExcluir;
        System.out.println("digite o nome do Contato: \n");
        nomeExcluir = Console.lerString();
        for(int i = 0;i<this.contato.length;i++){
            if(this.contato[i].getNome().equals(nomeExcluir) == true){

                System.out.println("Contato excluido ; \n" + this.contato[i].toString());
                this.contato[i]= null;
            
                
    
            }else {
                System.out.println("contato nao encontrado.\n");
            }
        } 
    }
    

    
    
    
        
        
    
    //mostrar todos contatos da agenda
    
}
