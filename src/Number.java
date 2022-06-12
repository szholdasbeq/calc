abstract class Number {
    int number;
    String type;

    Number sum(Number second) { return NumberType.setNumber(number + second.number, type); }
    Number dif(Number second) { return NumberType.setNumber(number - second.number, type); }
    Number mul(Number second) { return NumberType.setNumber(number * second.number, type); }
    Number div(Number second) { return NumberType.setNumber(number / second.number, type); }
}