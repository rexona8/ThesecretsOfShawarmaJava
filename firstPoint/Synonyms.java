package FirstPoint;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Synonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        Map <String, String> synonyms = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] arr = scanner.nextLine().split(" ");
            String word1 = arr[0]; 
            String word2 = arr[1];

            synonyms.put(word1, word2);
            synonyms.put(word2, word1);
        }

        String inputWord = scanner.nextLine();
        String checkWord = synonyms.get(inputWord);

        if (checkWord != null) {
            System.out.println(checkWord);
        } else {
            System.out.println("Слова нет");
        }

        scanner.close();
    }
}
