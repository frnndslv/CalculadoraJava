public class ContaBanc {
    
    private String titular;
    private int numeroConta;
    private float saldo;

    public  ContaBanc(){

    }
    public  ContaBanc(String titular, int numeroConta, float saldo){
        this.titular=titular;
        this.numeroConta=numeroConta;
        this.saldo=saldo;
    }
    
    public String getTitular() {
        return titular;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(){

        System.out.println("Digite o valor a ser depositado; \n");
        float deposito = Console.lerFloat();
        System.out.println("Voce depositou \n" + deposito);
        System.out.println("Deposito realizado mcom sucesso!! \n" + deposito);
        System.out.println("seu novo saldo é \n" + (this.saldo + deposito  ));

    }
    public void sacar(){
        System.out.println("Digite o valor a ser sacado; \n");
        float sac = Console.lerFloat();

        if(sac>0 && sac <= getSaldo()){
            System.out.println("Voce sacou \n" + sac);
            System.out.println("Sac realizado mcom sucesso!! \n" );
            System.out.println("seu novo saldo é \n" + (this.saldo - sac) );
        }
        
    }
    
    

    

}
