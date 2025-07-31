package org.example;

public abstract class Funcionario {
    private String nome;
    private float salario;
    private String cpf;

    public Funcionario() {
        nome = "";
        salario = 0;
        cpf = "";
    }

    public Funcionario(String nome, float salario, String cpf) {
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Cpf: " + cpf);
    }

    public abstract void falar();
}
