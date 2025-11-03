package br.edu.atitus.alessandro_rosa.zoo_digital.animais.repteis;

import br.edu.atitus.alessandro_rosa.zoo_digital.comportamentos.*;

public class Jacu extends Reptil implements Corredor, Voador {
    public Jacu(String nome, int idade){ super(nome, idade); }
    public void emitirSom(){ System.out.println("Coo coo"); }
    public void comer(){ System.out.println("Comendo frutas."); }
    public void correr(){ System.out.println(nome + " está correndo."); }
    public void voar(){ System.out.println(nome + " está voando baixo."); }
}
