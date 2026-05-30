package BitManipulation;

public class DecimalConversion {
    public static void main(String[]args){
        DecimalToBinaryConversion DC= new DecimalToBinaryConversion(53);
        System.out.println(DC.convert());
    }
}

class DecimalToBinaryConversion {
    int number;
    String binary="";

    DecimalToBinaryConversion(int number) {
        this.number = number;
    }

    public String convert() {
        while (number > 0) {
            int rem = number % 2;
            binary+=rem;
            number = number / 2;
        }
        return binary;
    }



}
