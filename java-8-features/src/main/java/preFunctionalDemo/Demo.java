package preFunctionalDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,2,6);

        // nums.forEach(n -> System.out.println(n));

        Consumer<Integer> con = (Integer n) ->{
                System.out.println(n);
            };


        nums.forEach(con);
    }
}
