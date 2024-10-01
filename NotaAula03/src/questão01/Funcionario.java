package questão01;

public class Funcionario {
    public Funcionario(String nome, double salario, int nasc){
        this.nasc = nasc;
        this.nome = nome;
        this.salario = salario;
    }
    protected String nome;
    protected double salario;
    protected int nasc;
    protected double informarSalario(){
        return salario;
    }
    protected int calcularIdade(){
        return nasc - 2024;
    }
}
