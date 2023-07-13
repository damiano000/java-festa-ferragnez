package com.ferragnez.party;
import java.util.Scanner;
public class CheckGuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] listInvited = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.println("Come si chiama? ");
        String nome = scanner.nextLine();

        boolean isInvited = false;
        for (String invitato : listInvited) {
            if (invitato.equals(nome)) {
                isInvited = true;
                break;
            }
        }

        System.out.println("Invitato: " + isInvited);
    }
}