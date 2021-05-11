package classes;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String original = "Edho Dwi Tirwanda";

        String encoded =  Base64.getEncoder().encodeToString(original.getBytes(StandardCharsets.UTF_8));
        System.out.println(encoded);

        byte[] bytes =  Base64.getDecoder().decode(encoded);
        String result = new String(bytes);
        System.out.println(result);
    }
}
