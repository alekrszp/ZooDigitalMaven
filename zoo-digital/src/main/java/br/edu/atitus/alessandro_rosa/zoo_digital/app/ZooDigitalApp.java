package br.edu.atitus.alessandro_rosa.zoo_digital.app;

import br.edu.atitus.alessandro_rosa.zoo_digital.animais.*;
import br.edu.atitus.alessandro_rosa.zoo_digital.animais.mamiferos.*;
import br.edu.atitus.alessandro_rosa.zoo_digital.animais.aves.*;
import br.edu.atitus.alessandro_rosa.zoo_digital.animais.peixes.*;
import br.edu.atitus.alessandro_rosa.zoo_digital.animais.repteis.*;
import br.edu.atitus.alessandro_rosa.zoo_digital.comportamentos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooDigitalApp {

    private static List<Animal> listaAnimais = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        do {
            mostrarMenu();

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
                sc.nextLine(); // limpar buffer
            } else {
                System.out.println("Entrada inválida! Digite um número.");
                sc.nextLine();
                continue;
            }

            if (opcao == 1) {
                cadastrarAnimal();
            } else if (opcao == 2) {
                listarTodosAnimais();
            } else if (opcao == 3) {
                listarAnimaisPorComportamento("Corredor");
            } else if (opcao == 4) {
                listarAnimaisPorComportamento("Nadador");
            } else if (opcao == 5) {
                listarAnimaisPorComportamento("Voador");
            } else if (opcao == 6) {
                listarAnimaisPorComportamento("Predador");
            } else if (opcao == 7) {
                System.out.println("Total de animais: " + Animal.getContador());
            } else if (opcao == 0) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- ZOO DIGITAL ---");
        System.out.println("1 - Cadastrar Animal");
        System.out.println("2 - Listar Todos Animais");
        System.out.println("3 - Listar Animais Corredores");
        System.out.println("4 - Listar Animais Nadadores");
        System.out.println("5 - Listar Animais Voadores");
        System.out.println("6 - Listar Animais Predadores");
        System.out.println("7 - Total de Animais");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarAnimal() {
        System.out.print("Digite o tipo de animal (ex: Cachorro, Gato, Pinguim...): ");
        String tipo = sc.nextLine().trim();

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine().trim();

        System.out.print("Digite a idade: ");
        int idade;
        if (sc.hasNextInt()) {
            idade = sc.nextInt();
            sc.nextLine();
            if (idade < 0) {
                System.out.println("Idade inválida! Deve ser maior ou igual a 0.");
                return;
            }
        } else {
            System.out.println("Idade inválida! Cadastro cancelado.");
            sc.nextLine();
            return;
        }

        Animal animal = null;

        if (tipo.equalsIgnoreCase("cachorro")) animal = new Cachorro(nome, idade);
        else if (tipo.equalsIgnoreCase("gato")) animal = new Gato(nome, idade);
        else if (tipo.equalsIgnoreCase("coelho")) animal = new Coelho(nome, idade);
        else if (tipo.equalsIgnoreCase("raposa")) animal = new Raposa(nome, idade);
        else if (tipo.equalsIgnoreCase("pinguim")) animal = new Pinguim(nome, idade);
        else if (tipo.equalsIgnoreCase("aguia")) animal = new Aguia(nome, idade);
        else if (tipo.equalsIgnoreCase("papagaio")) animal = new Papagaio(nome, idade);
        else if (tipo.equalsIgnoreCase("coruja")) animal = new Coruja(nome, idade);
        else if (tipo.equalsIgnoreCase("tubarao") || tipo.equalsIgnoreCase("tubarão")) animal = new Tubarao(nome, idade);
        else if (tipo.equalsIgnoreCase("salmao") || tipo.equalsIgnoreCase("salmão")) animal = new Salmao(nome, idade);
        else if (tipo.equalsIgnoreCase("atum")) animal = new Atum(nome, idade);
        else if (tipo.equalsIgnoreCase("dourado")) animal = new Dourado(nome, idade);
        else if (tipo.equalsIgnoreCase("iguana")) animal = new Iguana(nome, idade);
        else if (tipo.equalsIgnoreCase("camaleao")) animal = new Camaleao(nome, idade);
        else if (tipo.equalsIgnoreCase("serpente")) animal = new Serpente(nome, idade);
        else if (tipo.equalsIgnoreCase("jacu")) animal = new Jacu(nome, idade);
        else System.out.println("Animal não cadastrado. Tipo inválido!");

        if (animal != null) {
            listaAnimais.add(animal);
            System.out.println("Animal cadastrado com sucesso!");
        }
    }

    private static void listarTodosAnimais() {
        if (listaAnimais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado!");
            return;
        }
        for (Animal a : listaAnimais) {
            System.out.println("\nNome: " + a.getNome() + ", Idade: " + a.getIdade() + ", Espécie: " + a.getClass().getSimpleName());
            a.emitirSom();
            a.comer();
        }
    }

    private static void listarAnimaisPorComportamento(String comportamento) {
        boolean encontrou = false;
        for (Animal a : listaAnimais) {
            if (comportamento.equals("Corredor") && a instanceof Corredor) {
                System.out.println("\nNome: " + a.getNome() + ", Espécie: " + a.getClass().getSimpleName());
                ((Corredor) a).correr();
                encontrou = true;
            } else if (comportamento.equals("Nadador") && a instanceof Nadador) {
                System.out.println("\nNome: " + a.getNome() + ", Espécie: " + a.getClass().getSimpleName());
                ((Nadador) a).nadar();
                encontrou = true;
            } else if (comportamento.equals("Voador") && a instanceof Voador) {
                System.out.println("\nNome: " + a.getNome() + ", Espécie: " + a.getClass().getSimpleName());
                ((Voador) a).voar();
                encontrou = true;
            } else if (comportamento.equals("Predador") && a instanceof Predador) {
                System.out.println("\nNome: " + a.getNome() + ", Espécie: " + a.getClass().getSimpleName());
                ((Predador) a).cacar();
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("Nenhum animal encontrado com esse comportamento!");
    }
}




