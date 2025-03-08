package firstPoint;

public class IdeaForWork {
    public static void main(String[] args) {
        int value = 225;
        int count = 0;

        while (value != 0){
            value /= 10;
            count++;
        }
        System.out.println(count);
    }
}

// в цикле do while, сначала выполняется действие, затем идет проверка

// цикл switch проверяет разные кейсы, case 1  и т.д. проверяет переменные и какое условие
// при взаимодействии с ними, можно нескольким кейсам проверку на одно условие сделать, нужен break