public class Principal{

    public static void main(String[] args) {


        Aluno a1 = new Aluno("fernanda", "analise ", "terceiro", "manha");
        Aluno a2 = new Aluno();

        System.out.println("Digite o nome: ");
        a2.setNome(Console.lerString());

        System.out.println("Digite o curso: ");
        a2.setCurso(Console.lerString());

        System.out.println("Digite o periodo: ");
        a2.setPeriodo(Console.lerString());

        System.out.println("Digite o turno: \n");
        a2.setTurno(Console.lerString());

        
        System.out.println("Os dados do aluno a1 : \n");
        a1.mostrarDados();
        System.out.println("Os dados do aluno a2 : \n");
        a2.mostrarDados();
        System.out.println("digite novo nome");
        a1.setNome(Console.lerString());
        
        
        System.out.println("O nome diogitado foi:" + a1.getNome());


        Aluno a3 = new Aluno(a1.getNome(),a2.getCurso(),a2.getPeriodo(),a2.getTurno());
        

        a3.setTurno("agua");
        System.out.println("Os dados do aluno a3 : \n");
        a3.mostrarDados();

        Aluno a4 = a3;

        System.out.println("Os dados do aluno a4 : \n");
        a4.mostrarDados();
        //Altere todos os dados de "a4" com valores vindos do teclado
        System.out.println("alterando os valores , porfavor digite de novo \n");
        System.out.println("Digite o nome: ");
        a4.setNome(Console.lerString());
        System.out.println("Digite o curso: ");
        a4.setCurso(Console.lerString());
        System.out.println("Digite o periodo: ");
        a4.setPeriodo(Console.lerString());
        System.out.println("Digite o turno: ");
        a4.setTurno(Console.lerString());
        
        System.out.println("Os nomes dos alunos são: \n" +  a1.getNome()  + "\n" + a2.getNome() + "\n" + a3.getNome()+ "\n"  + a4.getNome());

        System.out.println("digite o novo curso\n");
        a4.setCurso(Console.lerString());

        System.out.println("a1 recebe curso  a4\n");
        a1.setCurso(a4.getCurso());

        System.out.println("os curos dos alunos sao: \n" + a1.getCurso() + "\n" + a2.getCurso() + "\n" + a3.getCurso() +  "\n" + a4.getCurso());

        
        System.out.println("Os dados do aluno a1 : \n");
        a1.mostrarDados();
        System.out.println("Os dados do aluno a2 : \n");
        a2.mostrarDados();
        System.out.println("Os dados do aluno a3 : \n");
        a3.mostrarDados();
        System.out.println("Os dados do aluno a4 : \n");
        a4.mostrarDados();
    }


}