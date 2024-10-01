package questão01;

public class Gerente extends Funcionario{
    public Gerente(String nome, int nasc, String projeto, double salario){
        super(nome, salario, nasc);
        this.projeto = projeto;
    }
    String projeto;
    public String informarProjeto(){
        return projeto;
    }
}
