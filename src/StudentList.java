import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// Learning about comparators...

public class StudentList {
    public static void GenerateStudentList(String[] args) {
        Scanner in = new Scanner(System.in);
        int numbStudents = Integer.parseInt(in.nextLine());
        List<Student> studentList = new ArrayList<Student>();

        while (numbStudents > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            Student student = new Student(id, fname, cgpa);
            studentList.add(student);
            numbStudents--;
        }

        in.close();

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getCgpa() == s2.getCgpa()) {
                    return s1.getFname().compareTo(s2.getFname());
                } else if (s1.getCgpa() < s2.getCgpa()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        for(Student st: studentList) {
            System.out.println(st.getFname());
        }

    }
}
