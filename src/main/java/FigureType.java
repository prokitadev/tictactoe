import java.util.Scanner;

public class FigureType {
    private String figureType;

    @Override
    public String toString() {
        return figureType;
    }

    public FigureType(String figureType) throws OnlyXandOExcepions {
        Scanner scanner = new Scanner(System.in);

        this.figureType = figureType;
        figureType = scanner.nextLine();



        if (!figureType.equals("X") || !figureType.equals("O")) {
            throw new OnlyXandOExcepions();
        }

    }

    public String getFigureType() {
        return figureType;
    }
}
