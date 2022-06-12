import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String expr;
        while (true) {
            try {
                expr = reader.readLine();

            } catch (IOException e) {
                throw new RuntimeException("Ошибочный ввод");
            }
            String[] str = expr.split(" ");
            if (str.length != 3) {
                throw new RuntimeException("Неправильный формат ввода");
            }
            Number a = NumberType.getNumber(str[0]);
            String operator = str[1];
            Number b = NumberType.getNumber(str[2]);

            Number c = calc(a, operator, b);

            System.out.println(c);
        }
    }

    private static Number calc(Number a, String operator, Number b) {
        if (a.type.equals(b.type)) {
            switch(operator) {
                case "+":
                    return a.sum(b);
                case "-":
                    return a.dif(b);
                case "*":
                    return a.mul(b);
                case "/":
                    return a.div(b);
                default:
                    throw new RuntimeException("Неизвестный оператор введен");
            }
        }
        else {
            throw new RuntimeException("Разные типы введеных чисел");
        }
    }


}