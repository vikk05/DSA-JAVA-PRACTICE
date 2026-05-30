package BitManipulation;

public class BinaryToDecimalConversion {
    public static void main(String[] args) {
        BinaryNumber B = new BinaryNumber(1011);
        System.out.println(B.ConvertBinaryToDecimal());
    }
}
class BinaryNumber{
    int number;
    BinaryNumber(int number){
        this.number=number;
    }
    int ConvertBinaryToDecimal(){
        int i=0;
        int answer=0;
        while(number!=0){

            int rem=number%10;
            double result=Math.pow(2,i);
            answer += rem * (1 << i);
            number=number/10;
            i++;
        }
        return answer;
    }

}

