package questão01;

public class Programador extends Funcionario{
    public Programador(String nome, int nasc, String linguagem, double salario){
        super(nome, salario, nasc);
        this.linguagem = linguagem;
    }
    String linguagem;
    public String informarLinguagem(){
        return linguagem;
    }
}
