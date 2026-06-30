package exercicio05_pensionato;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Vetor com os 10 quartos do pensionato
        Cliente[] quartos = new Cliente[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Rent #" + (i + 1) + ":");

            sc.nextLine(); // Limpa o buffer

            System.out.print("Name: ");
            String cliente = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            quartos[roomNumber] = new Cliente(roomNumber, cliente, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");

        for (int i = 0; i < quartos.length; i++) {

            if (quartos[i] != null) {
                System.out.println(
                        i + ": "
                                + quartos[i].getCliente()
                                + ", "
                                + quartos[i].getEmail()
                );
            }
        }

        sc.close();
    }
}