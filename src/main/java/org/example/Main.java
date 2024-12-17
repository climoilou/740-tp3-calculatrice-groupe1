package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenue aux commandes de la calculatrice.");

        Calculateur calculateur = new Calculateur();

        System.out.println("Entrez un premier opérande (nombre entier).");
        int operande1 = obtenirUnNombreEntierValide();

        System.out.println("Entrez un deuxième opérande (nombre entier).");
        int operande2 = obtenirUnNombreEntierValide();

        System.out.println("Voici les opérations disponibles: 1 (somme) 2 (soustraction) 3 (multiplication) 4 (division) 5 (exponentiation)");
        int numeroFonction = obtenirUnNombreEntierValide();

        System.out.println("Voici le résultat:");
        switch (numeroFonction) {
            case 1:
                System.out.println(operande1 + operande2);
                break;
            case 2:
                System.out.println(operande1 - operande2);
                break;
            case 3:
                System.out.println(operande1 * operande2);
                break;
            case 4:
                System.out.println(operande1 / operande2 + " (résultat tronqué à zéro décimale)");
                break;
            case 5:
                System.out.println((int)Math.pow(operande1, operande2) + " (résultat tronqué à zéro décimale)");
                break;
            default:
                System.out.println("Choix invalide. Aucune opération effectuée.");
                break;
        }

        System.out.println("Merci de votre essai du logiciel. Achetez la version complète pour calculer plus d'une fois consécutive.");
    }

    private static int obtenirUnNombreEntierValide() {
        int entree;

        Scanner scanneur = new Scanner(System.in);
        boolean estUnNombreEntier = scanneur.hasNextInt();

        while (estUnNombreEntier == false) {
            System.out.println("L'entrée n'est pas un nombre entier. Essayez à nouveau.");
            scanneur.next();
            estUnNombreEntier = scanneur.hasNextInt();
        }

        entree = scanneur.nextInt();

        return entree;
    }
}