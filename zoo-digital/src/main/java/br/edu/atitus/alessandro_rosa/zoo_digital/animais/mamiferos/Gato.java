package br.edu.atitus.alessandro_rosa.zoo_digital.animais.mamiferos;

import br.edu.atitus.alessandro_rosa.zoo_digital.animais.Animal;
import br.edu.atitus.alessandro_rosa.zoo_digital.comportamentos.*;

public class Gato extends Animal implements Corredor, Predador {
    public Gato(String nome, int idade){ super(nome, idade); }
    public void emitirSom(){ System.out.println("Miau!"); }
    public void comer(){ System.out.println("Comendo ração."); }
    public void correr(){ System.out.println(nome + " está correndo."); }
    public void cacar(){ System.out.println(nome + " está caçando o rato."); }
}

