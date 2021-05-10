package classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;
        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String example = "10000";
        Integer exampleInt = Integer.valueOf(example);

        System.out.println(example);
        System.out.println(exampleInt);
    }
}
