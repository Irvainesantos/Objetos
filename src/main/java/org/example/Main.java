package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("gabriel");
        funcionario.setCpf("514.767.646-74");
        funcionario.setSalario(3900.0f);
        funcionario.apresentar();

    }
}