package classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String value = "Edho Dwi Tirwanda";
        StringTokenizer tokenizer = new StringTokenizer(value, " ");

        while(tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
        }

        String[] stringArr =  value.split(" ");
        for (var arr : stringArr) {
            System.out.println(arr);
        }
    }
}
