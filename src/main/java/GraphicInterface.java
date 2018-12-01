import java.util.Arrays;

public class GraphicInterface {
    int position = 0;


    public GraphicInterface (Figure[] place) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                if ((j == 3 || j == 7) && i % 2 == 1) {
                    System.out.print("+");
                } else if (i % 2 == 1) {
                    System.out.print("-");
                } else if (i % 2 == 0 && (j == 3 || j == 7)) {
                    System.out.print("|");
                } else if (i % 2 == 0 && j % 2 == 1) {
                    System.out.print(place[position].getFigure());
                    position++;

                } else
                    System.out.print(" ");

            }
            System.out.println();

        }
    }
    public GraphicInterface (String[] place) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                if ((j == 3 || j == 7) && i % 2 == 1) {
                    System.out.print("+");
                } else if (i % 2 == 1) {
                    System.out.print("-");
                } else if (i % 2 == 0 && (j == 3 || j == 7)) {
                    System.out.print("|");
                } else if (i % 2 == 0 && j % 2 == 1) {
                    System.out.print(place[position]);
                    position++;

                } else
                    System.out.print(" ");

            }
            System.out.println();

        }
    }
}
