package FirstPoint;

public class Student {

    long idcardNumber;
    String name;
    String surname;
    int year;
    byte mathAvScore;
    byte econAvScore;
    byte langAvScore;
}

class StudentTest {

    double averageScore (Student st) {
        double average = (double) (st.mathAvScore + st.econAvScore + st.langAvScore) / 3;
        System.out.println("Номер в картотеке: " + st.idcardNumber);
        System.out.println("Год обучения: " + st.year);
        System.out.println("Средняя оценка студента " + st.name + " " + st.surname + ": " + average);
        System.out.println();
        return average;
    }

    public static void main (String[] args) {
        Student student1 = new Student();
        student1.idcardNumber = 1033;
        student1.name = "Nikita";
        student1.surname = "Markov";
        student1.year = 2022;
        student1.mathAvScore = 4;
        student1.econAvScore = 4;
        student1.langAvScore = 5;
    
        Student student2 = new Student();
        student2.idcardNumber = 1455;
        student2.name = "Bogdan";
        student2.surname = "Byrkov";
        student2.year = 2023;
        student2.mathAvScore = 3;
        student2.econAvScore = 2;
        student2.langAvScore = 2;
    
        Student student3 = new Student();
        student3.idcardNumber = 997;
        student3.name = "John";
        student3.surname = "Taylor";
        student3.year = 2022;
        student3.mathAvScore = 5;
        student3.econAvScore = 5;
        student3.langAvScore = 2;

        StudentTest studentTest = new StudentTest();
        studentTest.averageScore(student1);
        studentTest.averageScore(student2);
        studentTest.averageScore(student3);
    }
}
