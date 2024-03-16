package application;

import entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String nomeCampeaoA = input.nextLine();
        System.out.print("Vida Inicial: ");
        int vidaInicialCampeaoA = input.nextInt();
        System.out.print("Ataque: ");
        int ataqueCampeaoA = input.nextInt();
        System.out.print("Armadura: ");
        int armaduraCampeaoA = input.nextInt();
        input.nextLine();
        Champion campeaoA = new Champion(nomeCampeaoA, vidaInicialCampeaoA, ataqueCampeaoA, armaduraCampeaoA);

        System.out.println("\nDigite os dados do segundo campeão:");
        System.out.print("Nome: ");
        String nomeCampeaoB = input.nextLine();
        System.out.print("Vida Inicial: ");
        int vidaCampeaoB = input.nextInt();
        System.out.print("Ataque: ");
        int ataqueCampeaoB = input.nextInt();
        System.out.print("Armadura: ");
        int armaduraCampeaoB = input.nextInt();
        Champion campeaoB = new Champion(nomeCampeaoB, vidaCampeaoB, ataqueCampeaoB, armaduraCampeaoB);

        System.out.print("\nQuantos turnos você deseja executar? ");
        int turnos = input.nextInt();
        for(int i = 0; i < turnos; i++){
            campeaoA.takeDamage(campeaoB);
            campeaoB.takeDamage(campeaoA);
            System.out.printf("\nResultado do turno %d:%n", i + 1);
            if (campeaoA.getLife() <= 0) {
                campeaoA.setLife(0);
                i = turnos;
            } else if (campeaoB.getLife() <= 0) {
                campeaoB.setLife(0);
                i = turnos;
            }
            System.out.println(campeaoA.status(campeaoA));
            System.out.println(campeaoB.status(campeaoB));
        }
        System.out.println("\nFIM DO COMBATE");
    }
}