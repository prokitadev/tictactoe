import java.util.Scanner;

public class MyTicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tic-tac-toe. You want X or O?");
        String userType = scanner.nextLine();
        if (!userType.equals("X") && !userType.equals("O")) {
            System.out.println("Only X or O");
            userType = scanner.nextLine();
        }

        String computerType;
        if (userType.equals("X")) {
            computerType = "O";
        } else computerType = "X";

        // Definiuje tablicę z numerami pól, w trakcie gry będzie ona zamieniana na X lub O.
        String[] play = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        //Drukuje pole gry
        GraphicInterface graphicInterface = new GraphicInterface(play);

        System.out.println("Choose start position");
        int userPosition = scanner.nextInt();

        // I runda, kluczowa

        for (int i = 0; i < 9; i++) {
            if (i == userPosition - 1) {
                play[i] = userType;
            } else play[i] = " ";
            if (userPosition == 5) {
                play[8] = computerType;
            }
            if (userPosition != 5 && play[4].equals(" ")) {
                play[4] = computerType;
            }

        }
        GraphicInterface graphicInterface2 = new GraphicInterface(play);
        userPosition = scanner.nextInt();

        // II runda
        for (int j = 0; j < 8; j++) {
            if (!play[userPosition - 1].equals(" "))  {
                System.out.println("Error. This is not empty place");
                userPosition = scanner.nextInt();
            }
            play[userPosition - 1] = userType;

            if (userPosition == 2) {
                play[7] = computerType;
            } else if (userPosition == 8) {
                play[1] = computerType;
            } else if (userPosition == 3) {
                play[6] = computerType;
            } else if (userPosition == 7) {
                play[2] = computerType;
            } else if (userPosition == 4) {
                play[5] = computerType;
            } else if (userPosition == 6) {
                play[3] = computerType;
            } else play[6] = computerType;
        }
        GraphicInterface graphicInterface3 = new GraphicInterface(play);
        userPosition = scanner.nextInt();

        // III runda


    }
}
