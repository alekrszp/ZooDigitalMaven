package br.edu.atitus.alessandro_rosa.zoo_digital.animais.peixes;

import br.edu.atitus.alessandro_rosa.zoo_digital.animais.Animal;
import br.edu.atitus.alessandro_rosa.zoo_digital.comportamentos.Nadador;

public class Atum extends Animal implements Nadador {
    public Atum(String nome, int idade){ super(nome, idade); }
    public void emitirSom(){ System.out.println("..."); }
    public void comer(){ System.out.println("Comendo pequenos peixes."); }
    public void nadar(){ System.out.println(nome + " está nadando em cardume."); }
}

