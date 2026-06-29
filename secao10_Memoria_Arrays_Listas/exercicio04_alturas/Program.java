package exercicio04_alturas;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Dados da " + (i + 1) + "a pessoa:");

            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double somaAltura = 0.0;
        int menores = 0;

        for (int i = 0; i < n; i++) {

            somaAltura += pessoas[i].getAltura();

            if (pessoas[i].getIdade() < 16) {
                menores++;
            }
        }

        double media = somaAltura / n;
        double porcentagem = (double) menores * 100.0 / n;

        System.out.printf("%nAltura média: %.2f%n", media);

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

        for (int i = 0; i < n; i++) {

            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }

        sc.close();
    }
}