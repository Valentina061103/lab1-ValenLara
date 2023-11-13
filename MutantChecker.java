import java.util.Scanner;

public class MutantChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String exitApp = "s";
        while (!exitApp.equals("n")) {
            int option = 0;
            while (option < 1 || option > 5) {
                System.out.println("Ingrese la opción deseada: ");
                System.out.println("1 NUEVO MUTANTE");
                System.out.println("2 Demostracion de un No mutante");
                option = scanner.nextInt();
            }

            if (option == 1) {
                String[] dna = new String[6];
                for (int i = 0; i < 6; i++) {
                    StringBuilder wordADN = new StringBuilder();
                    int letterPosition = 1;
                    while (wordADN.length() < 6) {
                        System.out.printf("Ingrese letra %d de la secuencia de ADN %d (A, T, C, G): ", letterPosition, i + 1);
                        String letterADN = scanner.next().toUpperCase();
                        if (letterADN.matches("[ATCG]")) {
                            wordADN.append(letterADN);
                            letterPosition++;
                        } else {
                            System.out.println("Por favor, ingrese una letra entre las válidas (A, T, C, G).");
                        }
                    }
                    dna[i] = wordADN.toString();
                    System.out.println(dna[i]);
                }

                boolean isMutant = isMutant(dna);
                System.out.println(isMutant ? "Es mutante." : "No es mutante.");
            } else if (option == 2) {
                String[] dnaNot = {
                        "ATGCGA",
                        "CAGTGC",
                        "TTGTGT",
                        "AGAAGG",
                        "CGACTA",
                        "TCACTG"
                };
                boolean isMutant = isMutant(dnaNot);
                System.out.println(isMutant ? "Es mutante." : "No es mutante.");
            }

            System.out.print("Desea ingresar otro ADN? Ingrese la letra 's' para sí y la letra 'n' para no: ");
            exitApp = scanner.next();
        }
    }

    public static boolean isMutant(String[] dna) {
        boolean isMutant = false;
        int countTimes = 0;
        char[][] compareDna = new char[6][6];

        for (int i = 0; i < 6; i++) {
            compareDna[i] = dna[i].toCharArray();
        }

        System.out.println("MATRIZ DNA ");
        for (char[] row : compareDna) {
            System.out.println(new String(row));
        }

        int isRow = checkRow(compareDna);
        if (isRow >= 1) {
            if (isRow >= 2) {
                System.out.println("mutante en adn por filas");
            }
            countTimes += isRow;
        }

        int isCol = checkCol(compareDna);
        if (isCol >= 1) {
            if (isCol >= 2) {
                System.out.println("mutante en adn por columna");
            }
            countTimes += isCol;
        }

        int isDiag = checkDiag(compareDna);
        if (isDiag >= 1) {
            if (isDiag >= 2) {
                System.out.println("mutante en diagonal por fila");
            }
            countTimes += isDiag;
        }

        if (countTimes >= 2) {
            isMutant = true;
        }

        return isMutant;
    }

    private static int checkRow(char[][] compareDna) {
        int countTimes = 0;
        for (int i = 0; i < 6; i++) {
            int count = 0;
            int j = 0;
            while (j < 5) {
                count = (compareDna[i][j] == compareDna[i][j + 1]) ? count + 1 : 0;
                if (count >= 3) {
                    countTimes++;
                    break;
                }
                j++;
            }
        }
        return countTimes;
    }

    private static int checkCol(char[][] compareDna) {
        int countTimes = 0;
        for (int j = 0; j < 6; j++) {
            int count = 0;
            int i = 0;
            while (i < 5) {
                count = (compareDna[i][j] == compareDna[i + 1][j]) ? count + 1 : 0;
                if (count >= 3) {
                    countTimes++;
                    break;
                }
                i++;
            }
        }
        return countTimes;
    }

    private static int checkDiag(char[][] compareDna) {
        int countTimes = -1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int count = 0;
                char actualPosition = compareDna[i][j];
                int newRow = i + 1;
                int newCol = j + 1;

                while (newRow < 6 && newCol < 6 && actualPosition == compareDna[newRow][newCol]) {
                    if (count >= 3) {
                        countTimes++;
                        count = 0;
                    }
                    count++;
                    newRow++;
                    newCol++;
                }
            }
        }

        for (int i = 0; i < compareDna.length - 1; i++) {
            for (int j = 0; j < compareDna[0].length - 1; j++) {
                int count = 0;
                int newRow = i + 1;
                int finalCol = (compareDna[0].length - 1) - j;
                char actualPosition = compareDna[i][finalCol];
                int checkDiagonal = finalCol - 1;

                while (newRow < compareDna.length && checkDiagonal > -1
                        && actualPosition == compareDna[newRow][checkDiagonal]) {
                    count++;
                    if (count >= 3) {
                        countTimes++;
                        count = 0;
                    }
                    newRow++;
                    checkDiagonal--;
                }
            }
        }

        return countTimes;
    }
}
