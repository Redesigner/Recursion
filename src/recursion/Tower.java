package recursion;
import java.util.Stack;

public class Tower extends Stack {
    
    public Tower(int height){
        for(int i = height; i >= 1; i--){
            push(i);
        }
    }
}
