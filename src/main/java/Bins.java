import java.text.DecimalFormat;

public class Bins {
    private static DecimalFormat df = new DecimalFormat("0.00");

    private int two = 0;
    private int three = 0;
    private int four = 0;
    private int five = 0;
    private int six = 0;
    private int seven = 0;
    private int eight = 0;
    private int nine = 0;
    private int ten = 0;
    private int eleven = 0;
    private int twelve = 0;
    private int setError = 0;
    private int getError = 0;

    public Bins(){
    }


    public void setBin(int diceNum){
        switch (diceNum){
            case 2:
                this.two++;
                break;
            case 3:
                this.three++;
                break;
            case 4:
                this.four++;
                break;
            case 5:
                this.five++;
                break;
            case 6:
                this.six++;
                break;
            case 7:
                this.seven++;
                break;
            case 8:
                this.eight++;
                break;
            case 9:
                this.nine++;
                break;
            case 10:
                this.ten++;
                break;
            case 11:
                this.eleven++;
                break;
            case 12:
                this.twelve++;
                break;
            default:
                   this.setError++;
                break;
        }
    }
    public int getBin(int num) {
        switch (num) {
            case 2:
                return this.two;
            case 3:
                return this.three;
            case 4:
                return this.four;
            case 5:
                return this.five;
            case 6:
                return this.six;
            case 7:
                return this.seven;
            case 8:
                return this.eight;
            case 9:
                return this.nine;
            case 10:
                return this.ten;
            case 11:
                return this.eleven;
            case 12:
                return this.twelve;
            case 13:
                 System.out.println("total error:");
                return this.setError + this.getError;
            default:
                 this.getError++;
                 System.out.println("error");
                 return 0;
        }
    }
    public void incrementBin(int diceNum){
        setBin(diceNum);
    }

    public void printBin(double numOfRolls){
        System.out.println("2:    " + this.two + ": " + df.format(this.two/numOfRolls) + "  ********" + " \n"  +
                "4:    " + this.four + ": " + df.format(this.four/numOfRolls) + "  ********"  + "\n" +
                "5:    " + this.five + ": " + df.format(this.five/numOfRolls) + "  ********" + "\n" +
                "6:    " + this.six + ": " + df.format(this.six/numOfRolls) + "  ********" + "\n" +
                "7:    " + this.seven + ": " + df.format(this.seven/numOfRolls) + "  ********" + "\n" +
                "8:    " + this.eight + ": " + df.format(this.eight/numOfRolls) + "  ********" + "\n" +
                "9:    " + this.nine + ": " + df.format(this.nine/numOfRolls) + "  ********" + "\n" +
                "10:   " + this.ten + ": " + df.format(this.ten/numOfRolls) + "  ********" + "\n" +
                "11:   " + this.eleven + ": " + df.format(this.eleven/numOfRolls) + "  ********" + "\n" +
                "12:   " + this.twelve + ": " + df.format(this.twelve/numOfRolls)+ "  ********" + "\n" );
    }

}
