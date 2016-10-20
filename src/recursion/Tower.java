package recursion;
import java.util.Stack;

public class Tower extends Stack {
    
    public Tower(int height){
        for(int i = height; i >= 1; i--){
            push(i);
        }
    }
   
    public boolean addRing(int size){
        if((int)peek() > size){ //trust me guys, TRUST ME
            super.push(size);
            return true;
        }
        else {
            System.out.println("Invalid move");
            return false;
        }
    }
}
