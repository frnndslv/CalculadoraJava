public class Calculadora {
    private float n1;
    private float n2;

    public  Calculadora(){

    }public  Calculadora(float n1, float n2){
        this.n1 = n1;
        this.n2 = n2;

    }public void setN1(float n1) {
        this.n1 = n1;
    }public void setN2(float n2) {
        this.n2 = n2;
    }
    public float getN1() {
        return n1;
    }
    public float getN2() {
        return n2;
    }


    public float soma(float n1, float n2){
        return  n1 + n2;
        
    }
    public float subtracao( float n1 , float n2){
       return n1 - n2;
        
        
        
    }
    public float divisao(float n1, float n2){
        return  n1 / n2;
        
    }
    public float mutiplicacao(float n1, float n2){
        return n1 * n2;
       
       
    }
    

    


}
