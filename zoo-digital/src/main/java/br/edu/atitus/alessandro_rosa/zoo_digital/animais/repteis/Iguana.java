package br.edu.atitus.alessandro_rosa.zoo_digital.animais.repteis;

import br.edu.atitus.alessandro_rosa.zoo_digital.comportamentos.Corredor;

public class Iguana extends Reptil implements Corredor {
    public Iguana(String nome, int idade){ super(nome, idade); }
    public void emitirSom(){ System.out.println("..."); }
    public void comer(){ System.out.println("Comendo folhas."); }
    public void correr(){ System.out.println(nome + " está se movimentando lentamente."); }
}

