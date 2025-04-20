import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set; // это интерфейс, который позволяет использовать коллекцию Set - беспорядочный список, в котором легко искать, добавлять и даулять элементы
import java.util.HashSet; // это класс, инструмент, с помощью которого реализуются коллекции Set, с HashSet ещё проще искать, добавлять и удалять элементы
import java.util.TreeSet; // ещё класс, инструмент, который реализует в Set элементы по порядку и использует диапазоны между элементами


public class Polyglots {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine()); // Количество школьников
        Set<String> allLanguages = new HashSet<>(); // Языки, которые знают все, надо заполнить
        Set<String> anyLanguages = new HashSet<>(); // Языки, которые знает хотя бы один, надо заполнить

        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(reader.readLine()); // Количество языков у данного школьника
            Set<String> studentLanguages = new HashSet<>();

            for (int j = 0; j < M; j++) {
                String language = reader.readLine();
                studentLanguages.add(language);
                anyLanguages.add(language);
            }

            // через условия выясняем, какие языки знают все школьники
            if (i == 0) { // Для первого ученика просто заполняем множество
                allLanguages.addAll(studentLanguages);
            } else {
                allLanguages.retainAll(studentLanguages); // Оставляем только те, которые есть у всех
            }
        }

        // Вывод языков, которые знают все
        writer.write(allLanguages.size() + "\n");
        for (String language : new TreeSet<>(allLanguages)) {
            writer.write(language + "\n");
        }

        // Вывод языков, которые знает хотя бы один школьник
        writer.write(anyLanguages.size() + "\n");
        for (String language : new TreeSet<>(anyLanguages)) {
            writer.write(language + "\n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }
}
