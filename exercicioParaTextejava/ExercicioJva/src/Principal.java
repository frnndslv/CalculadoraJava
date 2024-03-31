public class Principal{
    public static void main(String[] args) {
        /*EXERCÍCIO 01:
Imagine uma pequena biblioteca pessoal, uma coleção que você começou a construir com seus
livros favoritos. No entanto, com o tempo e o acúmulo de mais e mais livros, você percebe a
necessidade de organizar e acessar rapidamente as informações de cada um deles.
Para ajudar nessa organização, você decide criar um sistema simples em Java que permitirá
registrar cada livro com detalhes cruciais: o título, o autor e o ano de publicação. Além de
armazenar esses dados, você quer uma maneira fácil de exibir as informações de qualquer livro da
sua coleção, para quando quiser relembrar um título ou sugerir uma leitura a um amigo.  */
    //Livro l1 = new Livro();
    //aqui eu pego o metodo do obj generico e digo que o livro que eu quero vai receber tds os atributos do livro generico
    //l1 = registrarL();
    //Livro l2 = new Livro();
    //l2 = registrarL();
    //Livro l3 = new Livro();
    //l3= registrarL();

    Livro[] livro = new Livro[3];
    //guardar livro em vetor de  Livro
    for(int i =0 ; i< livro.length; i++){
        
        livro[i] = registrarL();

    }
    System.out.println("\nExibindo todas informaçoes dos livros;\n ");
    for(int i =0 ; i< livro.length; i++){
        livro[i].exibirInfoL();
        

    }


    System.out.println("\nexibindo só os titulos dos livros; \n ");
    for(int i =0 ; i< livro.length; i++){
        livro[i].exibirTodosTitulos();    
        

    }




    }
    // crio o obj generico dentro dessa clase, seto tds os atributos  
    public static Livro registrarL(){
        Livro livroGenerico = new Livro();
        System.out.println("\nQual o nome do Livro? \n");
        livroGenerico.setTitulo(Console.lerString());
        System.out.println("\nQual o nome do Autor?\n");
        livroGenerico.setAutor(Console.lerString());
        System.out.println("\nQual o Ano de publicação do libro?\n");
        livroGenerico.setAnoP(Console.lerInt());
        System.out.println("\nproximo livro\n");
        return livroGenerico ;

    }
}