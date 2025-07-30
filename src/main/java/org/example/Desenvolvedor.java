package org.example;

public class Desenvolvedor extends Funcionario {
    private String linguagem;
    private String frameWork;

    public Desenvolvedor() {
        linguagem = "";
        frameWork = "";
    }

    public Desenvolvedor(String nome, float salario, String cpf, String linguagem, String frameWork) {
        super(nome, salario, cpf);//Classe generica Classe pai - // Class Funcionario.
        this.frameWork = frameWork;
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getFrameWork() {
        return frameWork;
    }

    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
    }

    //Polimorfismo-Sobreescrita.
    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Linguagem : " + linguagem);
        System.out.println("Framework : " + frameWork);
    }

    //Polimorfismo-Sobrecarga (Overload).
}
