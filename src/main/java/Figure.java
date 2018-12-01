public class Figure {
    String figure;
    String userFigureType = "X";
    String computerFigureType= "O";

    public Figure(String figure, String userFigureType, String computerFigureType)  {
        this.figure = figure;
        this.userFigureType = userFigureType;
        this.computerFigureType = computerFigureType;

    }

    public String getFigure() {
        return figure;
    }
    public String getUserFigureType() {
        return userFigureType;
    }

    public String getComputerFigureType() {
        return computerFigureType;
    }
}

