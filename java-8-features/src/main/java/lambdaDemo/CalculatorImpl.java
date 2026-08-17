package lambdaDemo;

interface Calculator{

    // void switchOn();

    // void sum(int input);

    int substract(int i1 , int i2);
}

public class CalculatorImpl{

    public static void main(String[] args) {

        Calculator calculator = (i1 , i2) -> {
            if(i2 < i1){
                throw new RuntimeException("message");
            }else{
                return i2 - i1;
            }
        };
        System.out.println(calculator.substract(8, 6));

       /* Calculator calculator = ( input) ->{
            System.out.println("Sum : " + input);
        };

        calculator.sum(394);
        */
        /*
        Calculator calculator = () -> {
            System.out.println("Switch On");
        };

        calculator.switchOn();
        */

    }
}
