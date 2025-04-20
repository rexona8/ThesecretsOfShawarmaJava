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
    public static void main (String[] args) {
        Student student1 = new Student();
        student1.idcardNumber = 1033;
        student1.name = "Nikita";
        student1.surname = "Markov";
        student1.year = 2022;
        student1.mathAvScore = 4;
        student1.econAvScore = 4;
        student1.langAvScore = 5;

        double allAvstudent1 = (double) (student1.mathAvScore + student1.econAvScore + student1.langAvScore) / 3.0;
    
        Student student2 = new Student();
        student2.idcardNumber = 1455;
        student2.name = "Bogdan";
        student2.surname = "Byrkov";
        student2.year = 2023;
        student2.mathAvScore = 3;
        student2.econAvScore = 2;
        student2.langAvScore = 2;

        double allAvstudent2 = (double) (student2.mathAvScore + student2.econAvScore + student2.langAvScore) / 3.0;
    
        Student student3 = new Student();
        student3.idcardNumber = 997;
        student3.name = "John";
        student3.surname = "Taylor";
        student3.year = 2022;
        student3.mathAvScore = 5;
        student3.econAvScore = 5;
        student3.langAvScore = 2;

        double allAvstudent3 = (double) (student3.mathAvScore + student3.econAvScore + student3.langAvScore) / 3.0;

        System.out.println("Nikita average ball = " + allAvstudent1);
        System.out.println("Bogdan average ball = " + allAvstudent2);
        System.out.print("John average ball = " + allAvstudent3);
    }
}
