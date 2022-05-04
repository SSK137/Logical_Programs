public class Fibonacci_Series {
    public static void main(String[] args) {
        System.out.println("Welcome To Logical Programming");
        // veriable declaration
        int FirstNumber=0;
        int SecondNumber=1;
        int sum=0;
        /*In Every Fibonacci series it start with 0 and 1 so
        we print them first directly
         */
        System.out.println(FirstNumber);
        System.out.println(SecondNumber);
        //Calculating Fibonacci Series
        for(int i=FirstNumber;i<=5;i++){
            for(int j=SecondNumber;j<=5;j++){
                sum=FirstNumber+SecondNumber;
                FirstNumber=SecondNumber;
                SecondNumber=sum;
                System.out.println(sum);
            }
        }
    }
}
