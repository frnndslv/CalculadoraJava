public class Aluno {

    private  String nome;
    private  String curso;
    private  String periodo;
    private  String turno;

    public Aluno(){

    }

    public Aluno(String nome, String curso, String periodo, String turno){
        this.nome = nome;
        this.curso = curso;
        this.periodo = periodo;
        this.turno = turno;

    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }
    
    public String getPeriodo() {
        return periodo;
    }
    public String getTurno() {
        return turno;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }



    public void mostrarDados(){
        System.out.println("Nome do aluno " + this.nome);
        System.out.println("Curso: " + this.curso);
        System.out.println("Periodo: " + this.periodo);
        System.out.println("Turno: " + this.turno);
    }   

   
    


    
}
