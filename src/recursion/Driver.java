package recursion;

public class Driver {

    public static void main(String[] args) {
        //Chessboard chessboard = new Chessboard(8);
        //System.out.println(chessboard.addQueen());
        Tower tower1 = new Tower(3);
        Tower tower2 = new Tower(0);
        Tower tower3 = new Tower(0);
        tower1.addRing(1);
        System.out.println(tower1.toString());
    }
}
