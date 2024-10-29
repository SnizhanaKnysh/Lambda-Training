package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        MathOperation mathOperation = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Math operation is: " + mathOperation.operate(1,2));

        StringManipulator stringManipulator = str -> str.toUpperCase();
        System.out.println("Converting to UpperCase: " + stringManipulator.manipulate("check string manipulator"));

        Function<String, Integer> upperСaseCounter = StringListProcessor::countUppercase;
        System.out.println("UpperCase letters number is: " + upperСaseCounter.apply("CamelCase"));

        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println("Random number is: " + randomSupplier.get());

    }

}