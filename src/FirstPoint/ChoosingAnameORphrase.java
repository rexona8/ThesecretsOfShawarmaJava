package FirstPoint;

public class ChoosingAnameORphrase {
    public static void main(String[] args) {
    String[] phrase = {"Добро", "пожаловать", "в", "Секретики", "Шаурмячной!"};
    String[] phraseInverted = new String[phrase.length];

    for (int i = phrase.length - 1, j = 0; i >= 0; i--, j++) {
        phraseInverted[j] = phrase[i];
    }

    PrintArr(phrase); // напечатал изначальный массив
    PrintArr(phraseInverted); // заполненный дубликат, перевернутый массив
    PrintArrReversed(phrase); // напечатал метод, который перевернул изначальный массив
    PrintArrReversed(phraseInverted); // инвертировал интвертированное!!! Безумие
    }

    public static void PrintArr(String[] array) {
        for (String item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void PrintArrReversed(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}