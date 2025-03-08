package firstPoint;

public class IdeaForWork {
    public static void HowNumbers(int value) {
        int count = 0;

        if (value == 0) {
            count = 1;
        } else {
            while (value != 0) {
                value /= 10; // Уменьшаем число на один разряд
                count++;
            }
        System.out.println(count);
        }
    }

// в цикле do while, сначала выполняется действие, затем идет проверка

// цикл switch проверяет разные кейсы, case 1  и т.д. проверяет переменные и какое условие
// при взаимодействии с ними, можно нескольким кейсам проверку на одно условие сделать, нужен break
    
    public static void FillArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public static void PrintArr(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }

    }

    public static void main(String[] args) {
    int []massiv = new int[10];
    
    HowNumbers(225);
    FillArr(massiv);
    PrintArr(massiv);
    }
}