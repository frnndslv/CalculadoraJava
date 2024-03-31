

public class Livro{
    private String autor;
    private String titulo;
    private int anoP;

    public  Livro(){

    }
    public  Livro(String autor, String titulo, int anoP){

        this.autor = autor;
        this.titulo = titulo;
        this.anoP = anoP;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnoP() {
        return anoP;
    }
    public void setAnoP(int anoP) {
        this.anoP = anoP;
    }

    public void exibirInfoL(){
        System.out.println("\nTitulo:\n " + this.titulo + "\nAutor: \n" + this.autor + "\nAno de publicação: \n " + this.anoP);

    }public void exibirTodosTitulos(){
        System.out.println("\nTitulo\n" + this.titulo );

    }
    





}