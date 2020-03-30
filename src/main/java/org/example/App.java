package org.example;

import java.util.HashSet;
import java.util.Scanner;


public class App {

    private static Scanner sc = new Scanner(System.in);
    private static HashSet<String> listaAlunos = new HashSet<String>();

    public static void main(String[] args) {

        String option;

        do {

            System.out.println("\n----- Menu -----");
            System.out.println("[1] - Inserir Aluno\n");
            System.out.println("[2] - Imprimir Lista\n");
            System.out.println("[0] - Sair\n");
            option = sc.nextLine();

            switch (option) {
                case "1":
                    inserirAluno();
                    break;
                case "2":
                    exibirLista();
                    break;
                case "0":
                    exibirLista();
                    break;
            }
        } while (!option.equals("0"));
    }

    private static void inserirAluno() {
        System.out.println("Insira o nome: ");
        String nome = sc.nextLine();
        listaAlunos.add(nome);
    }

    private static void exibirLista() {
        System.out.println("----- Lista de nomes -----");
        listaAlunos.forEach(System.out::println);
    }
}
