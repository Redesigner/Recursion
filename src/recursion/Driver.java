package recursion;

public class Driver {

    public static void main(String[] args) {
        Chessboard chessboard = new Chessboard(8);
        System.out.println(chessboard.addQueen());
        Temple temple = new Temple(5);
        System.out.println(temple.move());
    }
}
