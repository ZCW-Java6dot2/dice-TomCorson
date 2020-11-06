public class Simulation {
    int numOfDice;
    int numOfTossesToRun;
    Bins bin = new Bins();

    public Simulation(int numOfDice, int numOfTossesToRun) {
            this.numOfDice = numOfDice;
            this.numOfTossesToRun = numOfTossesToRun+1;
        }

    public void run() {
        Dice die = new Dice();
        for (int i = 0; i < this.numOfTossesToRun; i++) {
            int roll = die.tossAndSum(this.numOfDice);
            bin.setBin(roll);
        }
    }
    public void printResult(){
          bin.printBin((double)this.numOfTossesToRun);
    }
}
