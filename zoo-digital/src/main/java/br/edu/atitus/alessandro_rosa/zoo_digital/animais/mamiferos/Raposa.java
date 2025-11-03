package br.edu.atitus.alessandro_rosa.zoo_digital.animais.mamiferos;

import br.edu.atitus.alessandro_rosa.zoo_digital.animais.Animal;
import br.edu.atitus.alessandro_rosa.zoo_digital.comportamentos.*;

public class Raposa extends Animal implements Corredor, Predador {
    public Raposa(String nome, int idade){ super(nome, idade); }
    public void emitirSom(){ System.out.println("Auuuu!"); }
    public void comer(){ System.out.println("Comendo carne."); }
    public void correr(){ System.out.println(nome + " está correndo na floresta."); }
    public void cacar(){ System.out.println(nome + " está caçando o coelho."); }
}

