public class Dice {
   private int roll;

    public  Dice(int amountOfDie){
        this.roll=(int)(amountOfDie*(Math.random()*6+1));
    }
    public int getRoll(){
        return this.roll;

    }

}
