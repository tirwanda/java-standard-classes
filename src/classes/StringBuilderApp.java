package classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("Edho");
        builder.append(" ");
        builder.append("Dwi");
        builder.append(" ");
        builder.append("Tirwanda");

        String fullName = builder.toString();

        System.out.println(fullName);
    }
}
