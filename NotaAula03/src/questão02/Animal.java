package questão02;

public class Animal {
    protected Animal(){

    }
    protected Animal(String nome){
        this.nome = nome;
    }
    protected void caminha(){
        System.out.println("Este animal caminhou");
    }
    String raca, nome;
}
