import java.util.ArrayList;
import java.util.Random;

public class DominoPile {
    private ArrayList<Domino> pile;
    public DominoPile(){
    }
    public ArrayList<Domino> getPile() {
        return pile;
    }
    public void newStack6(){
        for(int i=0; i<7; i++){
            for(int j=i; j<7; j++) {
                pile.add(new Domino(i, j));
            }
        }
    }
    public void shuffle(){
        ArrayList<Domino>shuffledPile = new ArrayList<Domino>();
        for(int i=pile.size(); i>0; i--){
            Random random = new Random();
            int index = random.nextInt(i);
            shuffledPile.add(pile.get(index));
            pile.remove(index);
        }
    }
}
