package br.edu.atitus.alessandro_rosa.zoo_digital.animais.peixes;

import br.edu.atitus.alessandro_rosa.zoo_digital.animais.Animal;
import br.edu.atitus.alessandro_rosa.zoo_digital.comportamentos.Nadador;

public class Dourado extends Animal implements Nadador {
    public Dourado(String nome, int idade){ super(nome, idade); }
    public void emitirSom(){ System.out.println("..."); }
    public void comer(){ System.out.println("Comendo ração de peixe."); }
    public void nadar(){ System.out.println(nome + " está nadando tranquilamente."); }
}

