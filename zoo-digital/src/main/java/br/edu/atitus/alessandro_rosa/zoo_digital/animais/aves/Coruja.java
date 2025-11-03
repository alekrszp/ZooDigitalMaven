package br.edu.atitus.alessandro_rosa.zoo_digital.animais.aves;

import br.edu.atitus.alessandro_rosa.zoo_digital.animais.Animal;
import br.edu.atitus.alessandro_rosa.zoo_digital.comportamentos.*;

public class Coruja extends Animal implements Voador, Predador {
    public Coruja(String nome, int idade){ super(nome, idade); }
    public void emitirSom(){ System.out.println("Huu Huu"); }
    public void comer(){ System.out.println("Comendo roedores."); }
    public void voar(){ System.out.println(nome + " está voando silenciosamente."); }
    public void cacar(){ System.out.println(nome + " está caçando à noite."); }
}
