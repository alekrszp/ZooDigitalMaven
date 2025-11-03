package br.edu.atitus.alessandro_rosa.zoo_digital.animais.mamiferos;

import br.edu.atitus.alessandro_rosa.zoo_digital.animais.Animal;
import br.edu.atitus.alessandro_rosa.zoo_digital.comportamentos.Corredor;

public class Coelho extends Animal implements Corredor {
    public Coelho(String nome, int idade){ super(nome, idade); }
    public void emitirSom(){ System.out.println("Piu piu"); }
    public void comer(){ System.out.println("Comendo cenoura."); }
    public void correr(){ System.out.println(nome + " está correndo pelo campo."); }
}

