public class Dice {
   private int roll;

    public  Dice(){

    }
    public Integer tossAndSum(int amountOfDie){
        this.roll=(int)(amountOfDie*(Math.random()*6+1));
        return this.roll;
    }

}
