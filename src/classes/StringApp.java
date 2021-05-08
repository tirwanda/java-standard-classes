package classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Edho Dwi Tirwanda";
        String nameLowerCase = name.toLowerCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Edho"));
        System.out.println(name.endsWith("Tirwanda"));

        String[] names = name.split(" ");
        for (var value : names) {
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(2));

        char[] chars = name.toCharArray();
        System.out.println(chars);
    }
}
