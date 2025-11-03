package br.edu.atitus.alessandro_rosa.zoo_digital.animais.aves;

import br.edu.atitus.alessandro_rosa.zoo_digital.animais.Animal;
import br.edu.atitus.alessandro_rosa.zoo_digital.comportamentos.*;

public class Papagaio extends Animal implements Voador, Corredor {
    public Papagaio(String nome, int idade){ super(nome, idade); }
    public void emitirSom(){ System.out.println("Olá!"); }
    public void comer(){ System.out.println("Comendo sementes."); }
    public void voar(){ System.out.println(nome + " está voando."); }
    public void correr(){ System.out.println(nome + " está correndo."); }
}

