package cmp202;

public class Student extends User {
    String matricNo;
    String admissionNo;


    @Override
    String register() {
        // TODO Auto-generated method stub
        //overwritten the initial register function from Users.register
        if (admissionNo.equals("") || matricNo.equals("")) {
            return "can't be empty";
        } else {
            return "success";
        }
    }

    void registerCourses(String course) {
        System.out.println(course);
    }

    String checkResult() {
        return "cmp202" + " " + 70;
    }

    public static void main(String[] args) {
        Student newStudent = new Student();
        newStudent.registerCourses("cmp202");
        System.out.println(newStudent.checkResult());
    }
}

    

