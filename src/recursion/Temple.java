/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

//The TEMPLE holds all of the towers. When completed... the world will end!
public class Temple {
    
    Tower a,b,c;
    final int HEIGHT;
    int moves;
    
    public Temple(int height){
        this.HEIGHT = height;
        a = new Tower(height);
        b = new Tower(0);
        c = new Tower(0);
        moves = 0;
    }
    
    private void move(Tower start, Tower swap, Tower end, int numDiscs) {
        if(a.empty() && b.empty()) {
            System.out.println("Solution reached");
        }
        else if(numDiscs == 1){
            end.push(start.pop());
            moves++;
            System.out.println(toString());
        }        
        else {
            move(start, end, swap, numDiscs-1);
            end.push(start.pop());
            moves++;
            System.out.println(toString());
            move(swap, start, end, numDiscs-1);
        }
    }
    
    public String move(){
        move(a,b,c, HEIGHT);
        return("Solved in " + moves + " moves!");
    }
    
    public String toString(){
        return "------\n" + a.toString() + "\n" + b.toString() + "\n" + c.toString();
    }
}
