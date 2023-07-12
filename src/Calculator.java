import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;  //3
    BinaryOperator<Integer> minus = (x, y) -> x - y;  //0
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    BinaryOperator<Integer> devide = (x, y) -> {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Ошибка: деление на 0");
        }
    }; //возникает ошибка public class ArithmeticException (ArithmeticException: возникает при делении на ноль;)

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
