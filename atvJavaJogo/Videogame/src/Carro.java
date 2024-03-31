

public class Carro {
    private String modelo;
    private int ano;
    private float velocidadeAt;

    public Carro(){

    }
    public Carro(String modelo, int ano, float velocidadeAt){
        this.modelo=modelo;
        this.ano=ano;
        this.velocidadeAt=velocidadeAt;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public float getVelocidadeAt() {
        return velocidadeAt;
    }
    public void setVelocidadeAt(float velocidadeAt) {
        this.velocidadeAt = velocidadeAt;
    }
    public void criarCarro(){
        System.out.println("Informe o modelo do carro: \n");
        this.modelo = Console.lerString();
        System.out.println("Informe o ano do carro: \n");
        this.ano = Console.lerInt();
        System.out.println("Informe a velocidade do carro: \n");
        this.velocidadeAt = Console.lerInt();
        
    }
    
    /* métodos que permitam acelerar e frear, ajustando a velocidade atual de acordo
    com a ação realizada. */
    public void frear(){
        if(this.modelo!=null){
            System.out.println(" a velocidade atual do carro é  \n" + this.velocidadeAt);
            this.velocidadeAt = 0;
            System.out.println(" Os freios foram ativados, você parou. \n Sua velocidade atual é de " + this.velocidadeAt);
        }else{
            System.out.println("Você ainda nao realizou cadastro do carro , porfavor cadastre um carro \n" );
            
        }
        
        
    }
    public void acelerar(){
        if(this.modelo!=null){
            System.out.println(" a velocidade atual do carro é  \n" + this.velocidadeAt);
            System.out.println("Quanto deseja acelerar? \n");
            int velocidadeAcc = Console.lerInt();
            this.velocidadeAt += velocidadeAcc;
            System.out.println(" O acelerador foi acionado, você esta em \n" + this.velocidadeAt);
        }else{
            System.out.println("Você ainda nao realizou cadastro do carro , porfavor cadastre um carro \n" );
            
        }
        
    }

}



