package Classes.Exercise1;

public class ClassesExercise1 {

    public static void main(String[] args) {
        Course math = new Course("Math", "101", "MAT");
        Course physics = new Course("Physics", "101", "PHY");
        Course chemistry = new Course("Chemistry ", "101", "CHM");

        Teacher t1 = new Teacher("Mahmut Hoca", "5424367863", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "5415414142", "PHY");
        Teacher t3 = new Teacher("Ali Veli", "5555544321", "CHM");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Tayfun", 4, "140144015", math, physics, chemistry);
        s1.addBulkExamNote(50,20,40);
        s1.addVerbalExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Reşat", 4, "2211133", math, physics, chemistry);
        s2.addBulkExamNote(100,50,40);
        s2.addVerbalExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Ahmet", 4, "221121312", math, physics, chemistry);
        s3.addBulkExamNote(50,20,40);
        s3.addVerbalExamNote(50,20,40);
        s3.isPass();

    }
}
