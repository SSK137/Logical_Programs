public class Reverse_Number {
    public static void main(String[] args) {
        //Veriable Declaration
        int number=231;
        int remainder=0;
        int reverse=0;
        //Calculating Reverse for given input
        for(int i=1;i<=3;i++){
            remainder=number%10;
            reverse=(reverse*10)+remainder;
            number=number/10;
        }
        System.out.println(reverse);
    }
}
