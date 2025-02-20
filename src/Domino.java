public class Domino {
    private int top;
    private int bottom;
    public Domino(){
        top = 0;
        bottom = 0;
    }
    public Domino(int one, int two){
        top = one;
        bottom= two;
    }
    public int getTop(){
        return top;
    }
    public int getBottom(){
        return bottom;
    }
    public void setTop(int top){
        this.top = top;
    }
    public void setBottom(int bottom){
        this.bottom=bottom;
    }
    public String toString(int top, int bottom){
        return top + "/" + bottom;
    }
    public void flip(){
        int temp = top;
        top = bottom;
        bottom = temp;
    }
    public void settle(){
        if(top>bottom)flip();
    }
    public int compareTo(Domino other){
        this.settle();
        other.settle();
        if(this.top<other.top)return -1;
        else if(this.top>other.top)return 1;
        else{
            if(this.bottom<other.bottom)return -1;
            if(this.bottom>other.bottom)return 1;
            else return 0;
        }
    }
    public int compareToWeight(Domino other){
        int thisTotal = this.top+this.bottom;
        int otherTotal = other.top+other.bottom;
        if(thisTotal<otherTotal)return -1;
        else if(thisTotal>otherTotal)return 1;
        else return 0;
    }
    public boolean canConnect(Domino other){
        return this.top==other.top || this.top==other.bottom || this.bottom==other.top || this.bottom==other.bottom;
    }
}
