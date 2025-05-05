package FirstPoint;

public class Student {

    Student (long idcardNumber2, String name2,
    String surname2, int year2, int mathScore2, int econScore2, int langScore2) {
        this (idcardNumber2, name2, surname2, year2);
        this.mathScore = mathScore2;
        this.econScore = econScore2;
        this.langScore = langScore2;
    }

    Student (long idcardNumber3, String name3, String surname3, int year3) {
        this.idcardNumber = idcardNumber3;
        this.name = name3;
        this.surname = surname3;
        this.year = year3;
    }

    Student () {

    }

    long idcardNumber;
    String name;
    String surname;
    int year;
    int mathScore;
    int econScore;
    int langScore;

    public String toString() {
        return "Студент" +
               "\n Номер карты " + " " + idcardNumber +
               "\n Имя " + " " + name +
               "\n Фамилия " + " " + surname +
               "\n Сколько лет " + " " + year +
               "\n Балл по алгебре " + " " + mathScore +
               "\n Балл по экономике " + " " + econScore +
               "\n Балл по английскому языку " + " " + langScore + "\n";
    }
}

class StudentTest {
    public static void main (String[] args) {
        Student student1 = new Student(456521, "Dik", "Mitchel", 43, 5, 3, 2);
        System.out.println(student1);
        Student student2 = new Student(65456354, "Zak", "Glover", 22);
        System.out.println(student2);
        Student student3 = new Student();
        System.out.println(student3);
    }
}
