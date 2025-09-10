

import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[8];

        // Entrada das 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias bimestrais
        double[] mediasBimestres = new double[4];
        for (int i = 0; i < 4; i++) {
            mediasBimestres[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2.0;
        }

        // Cálculo das médias semestrais
        double semestre1 = (mediasBimestres[0] + mediasBimestres[1]) / 2.0;
        double semestre2 = (mediasBimestres[2] + mediasBimestres[3]) / 2.0;

        // Cálculo da média final
        double mediaFinal = (semestre1 + semestre2) / 2.0;

        // Saída formatada
        System.out.println("\n--- Resultados ---");
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "º Bimestre: " + mediasBimestres[i]);
        }
        System.out.println("1º Semestre: " + semestre1);
        System.out.println("2º Semestre: " + semestre2);
        System.out.println("-----------------------------");
        System.out.println("Média Final: " + mediaFinal);

        scanner.close();
    }
}