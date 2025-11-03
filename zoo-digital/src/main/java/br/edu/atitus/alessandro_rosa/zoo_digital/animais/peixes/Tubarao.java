package br.edu.atitus.alessandro_rosa.zoo_digital.animais.peixes;

import br.edu.atitus.alessandro_rosa.zoo_digital.animais.Animal;
import br.edu.atitus.alessandro_rosa.zoo_digital.comportamentos.*;

public class Tubarao extends Animal implements Nadador, Predador {
    public Tubarao(String nome, int idade){ super(nome, idade); }
    public void emitirSom(){ System.out.println("..."); } // Peixes geralmente não emitem som
    public void comer(){ System.out.println("Comendo peixes menores."); }
    public void nadar(){ System.out.println(nome + " está nadando rapidamente."); }
    public void cacar(){ System.out.println(nome + " está caçando presas."); }
}

