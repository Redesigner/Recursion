package recursion;
import java.util.ArrayList;

public class Chessboard {
    final int SIZE;
    ArrayList<Queen> queens = new ArrayList<Queen>();
    private String answers = "";
    private int numAnswers = 0;
    
    public Chessboard(int size) {
        SIZE = size;
    }
    
    public void addQueen(int x, int y){
        if(!valid(x,y)) {
            return;
        }
        queens.add(new Queen(x, y));
        if(queens.size() < SIZE){
            for(int i = 0; i < SIZE; i++) {
                addQueen(x+1, i);
            }
        }
        else {
            answers += queens.toString() + "\n";
            numAnswers++;
        }
        queens.remove(queens.size()-1);
    }
 
    public String addQueen() {
        for(int i = 0; i < SIZE; i++) {
            System.out.println(i);
            addQueen(0, i);
            queens.clear();
        }
        return answers + numAnswers;
    }
    
    private boolean valid(int x, int y) {
        for(int i=0; i < queens.size(); i++) {
            Queen target = queens.get(i);
            if((target.x == x ) || (target.y == y) || (target.x - target.y == x - y) || (target.x + target.y == x + y)){
                return false;
            }
        }
        return true;
    }
}
