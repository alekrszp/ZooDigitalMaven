package br.edu.atitus.alessandro_rosa.zoo_digital.animais.peixes;

import br.edu.atitus.alessandro_rosa.zoo_digital.animais.Animal;
import br.edu.atitus.alessandro_rosa.zoo_digital.comportamentos.Nadador;

public class Salmao extends Animal implements Nadador {
    public Salmao(String nome, int idade){ super(nome, idade); }
    public void emitirSom(){ System.out.println("..."); }
    public void comer(){ System.out.println("Comendo pequenas larvas."); }
    public void nadar(){ System.out.println(nome + " está nadando rio acima."); }
}

