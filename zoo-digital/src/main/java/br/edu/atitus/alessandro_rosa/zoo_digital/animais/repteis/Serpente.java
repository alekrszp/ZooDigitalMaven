package br.edu.atitus.alessandro_rosa.zoo_digital.animais.repteis;

import br.edu.atitus.alessandro_rosa.zoo_digital.comportamentos.*;

public class Serpente extends Reptil implements Nadador, Predador {
    public Serpente(String nome, int idade){ super(nome, idade); }
    public void emitirSom(){ System.out.println("Ssss"); }
    public void comer(){ System.out.println("Engolindo presas."); }
    public void nadar(){ System.out.println(nome + " está nadando."); }
    public void cacar(){ System.out.println(nome + " está caçando ratos."); }
}
