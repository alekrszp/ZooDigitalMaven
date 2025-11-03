package br.edu.atitus.alessandro_rosa.zoo_digital.animais;

public abstract class Animal {
    protected String nome;
    protected int idade;
    protected static int contador = 0;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        contador++;
    }

    public abstract void emitirSom();
    public abstract void comer();

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public static int getContador() { return contador; }
}


