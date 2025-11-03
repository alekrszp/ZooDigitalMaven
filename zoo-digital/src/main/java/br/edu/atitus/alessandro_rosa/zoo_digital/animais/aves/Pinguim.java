package br.edu.atitus.alessandro_rosa.zoo_digital.animais.aves;

import br.edu.atitus.alessandro_rosa.zoo_digital.animais.Animal;
import br.edu.atitus.alessandro_rosa.zoo_digital.comportamentos.*;

public class Pinguim extends Animal implements Nadador, Predador {
    public Pinguim(String nome, int idade){ super(nome, idade); }
    public void emitirSom(){ System.out.println("Piu piu!"); }
    public void comer(){ System.out.println("Comendo peixe."); }
    public void nadar(){ System.out.println(nome + " está nadando."); }
    public void cacar(){ System.out.println(nome + " está caçando Krill no gelo."); }
}

