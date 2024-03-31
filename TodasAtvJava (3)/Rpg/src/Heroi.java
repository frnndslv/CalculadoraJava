public class Heroi {

    private String nome;
    private String raca;
    private String golpeEspecial;

    public  Heroi(){

    }
    public Heroi(String nome, String raca, String golpeEspecial){

        this.nome = nome;
        this.raca = raca;
        this.golpeEspecial = golpeEspecial;

    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getGolpeEspecial() {
        return golpeEspecial;
    }
    public void setGolpeEspecial(String golpeEspecial) {
        this.golpeEspecial = golpeEspecial;
    }

    public void mostrarDados(){
        System.out.println("Informações do heroi: ");
        System.out.println("Nome do heroi " + this.nome);
        System.out.println("raca: " + this.raca);
        System.out.println("Golpe especial: " + this.golpeEspecial);
        
    }

    public void atacar(){

       System.out.println(" O herói " + this.nome +" atacou o inimigo com seu golpe especial " + this.golpeEspecial  ); 
        
    }
    


    
    

    
}
