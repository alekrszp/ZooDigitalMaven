package br.edu.atitus.alessandro_rosa.zoo_digital.animais.aves;

import br.edu.atitus.alessandro_rosa.zoo_digital.animais.Animal;
import br.edu.atitus.alessandro_rosa.zoo_digital.comportamentos.*;

public class Aguia extends Animal implements Voador, Predador {
    public Aguia(String nome, int idade){ super(nome, idade); }
    public void emitirSom(){ System.out.println("Grrrr!"); }
    public void comer(){ System.out.println("Comendo carne."); }
    public void voar(){ System.out.println(nome + " está voando alto."); }
    public void cacar(){ System.out.println(nome + " está caçando coelhos."); }
}

