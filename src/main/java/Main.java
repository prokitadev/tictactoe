import sun.font.FontRunIterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws OnlyOneLetterExceptions {
        System.out.println("Tic-tac-toe. Let's play!");

        // Definiuje tablicę z numerami pól, w trakcie gry będzie ona zamieniana na X lub O.
        int i = 9;
        Figure[] figures = new Figure[i];
        figures[0] = new Figure("1", "X", "O");
        figures[1] = new Figure("2", "X", "O");
        figures[2] = new Figure("3", "X", "O");
        figures[3] = new Figure("4", "X", "O");
        figures[4] = new Figure("5", "X", "O");
        figures[5] = new Figure("6", "X", "O");
        figures[6] = new Figure("7", "X", "O");
        figures[7] = new Figure("8", "X", "O");
        figures[8] = new Figure("9", "X", "O");

        //Drukuje pole gry
        GraphicInterface graphicInterface = new GraphicInterface(figures);

        Scanner scanner = new Scanner(System.in);

        System.out.println("OK. You want to play X or O?");
        //User podaje kim gra
        String userFigureType = scanner.nextLine();

        if (!userFigureType.equals("X") && !userFigureType.equals("O")) {
            System.out.println("Only X to O  numbers");
        }
        if (userFigureType.equals("O")) {
            for (int d = 0; d < 9; d++) {
                figures[d].userFigureType = "O";
                figures[d].computerFigureType = "X";
            }
        }
        ///Rozpoczyna sie wlasciwa partia gry


        for (int p = 0; p < 6; p++) {
            System.out.println("Write your move");
            //User podaje pole startowe


            int userPosition = scanner.nextInt();

                if (userPosition > 9 || userPosition < 1) {
                System.out.println("Only 1 to 9  numbers");
                userPosition = scanner.nextInt();
            }
            if (figures[userPosition-1].figure.equals("X") || figures[userPosition-1].figure.equals("O")) {
                System.out.println("This position is not empty");
                userPosition = scanner.nextInt();
            }

            figures[userPosition - 1].figure = figures[userPosition - 1].userFigureType;

            GraphicInterface result = new GraphicInterface(figures);

            if (!figures[p].figure.equals("X") && !figures[p].figure.equals("O")) {
                figures[p].figure = figures[userPosition - 1].computerFigureType;

                int computerPosition = p + 1;

                ////Tu zapisuja sie ruchy komputera
                Integer[] compMoves = {0, 0, 0, 0};
                compMoves[p] = computerPosition;

                System.out.println("Computer moves on place number:" + computerPosition);
                GraphicInterface result2 = new GraphicInterface(figures);
            }
            ///Tu sprawdza czy ktos wygral

            if (figures[0].figure.equals("X") && figures[1].figure.equals("X") && figures[2].figure.equals("X") ||
                    figures[0].figure.equals("X") && figures[3].figure.equals("X") && figures[6].figure.equals("X") ||
                    figures[0].figure.equals("X") && figures[4].figure.equals("X") && figures[8].figure.equals("X") ||
                    figures[1].figure.equals("X") && figures[4].figure.equals("X") && figures[7].figure.equals("X") ||
                    figures[3].figure.equals("X") && figures[4].figure.equals("X") && figures[5].figure.equals("X") ||
                    figures[6].figure.equals("X") && figures[7].figure.equals("X") && figures[8].figure.equals("X")
                     ) System.out.println("X wins! Contratualiosn");
            if (figures[0].figure.equals("O") && figures[1].figure.equals("O") && figures[2].figure.equals("O") ||
                    figures[0].figure.equals("O") && figures[3].figure.equals("O") && figures[6].figure.equals("O") ||
                    figures[0].figure.equals("O") && figures[4].figure.equals("O") && figures[8].figure.equals("O") ||
                    figures[1].figure.equals("O") && figures[4].figure.equals("O") && figures[7].figure.equals("O") ||
                    figures[3].figure.equals("O") && figures[4].figure.equals("O") && figures[5].figure.equals("O") ||
                    figures[6].figure.equals("O") && figures[7].figure.equals("O") && figures[8].figure.equals("O")
            ) System.out.println("Y wins! Contratualiosn");


        }

    }


}


/**
 * "GUI" w postaci kresek
 * Program do wpisywania współprzędnych
 * Program do sprawdzania wygranej
 */