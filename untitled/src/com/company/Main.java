package com.company;

public class Main {
    public void main(String[] arg) {
        Student noon = new Student();

        noon.name = "Parnnipa Pohnjareon";
        noon.id = "623410007-0";
        noon.major = "CIS";

        System.out.println("1." + noon.name + " " + noon.major);

        Student[] oopStudents = {noon,};

        System.out.println("1." + oopStudents[0].name);

        find_CIS_student(oopStudents);
    }

    private void find_CIS_student(Student[] oopStudents) {
    }

    public void find_CIS_Student(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            // check student.major is "CIS"
            if (students[i].major.equals("CIS")) {
                System.out.println(i + 1 + ". " + students[i].name);
            }
        }


    }
}
