package student;

public class Test {
    public static void main(String[] args) {
        Major mj1 = new Major("50","Art");
        Major mj2 = new Major("10","History");
        Major mj3 = new Major("20","Maths");
        Major mj4 = new Major("27","Physics");

        Major.createDefault();

        Student std1 = new Student("Safi","Amal","0653443534","ahmed@gmail.com","jc3543534");
        Student std2 = new Student("Alami","Samir","0645363536","hgdggfd@shgfd.com","JT343524");
        Student std3 = new Student("bla","Ali","0645363536","hgdggfd@shgfd.com","JT343524",mj1);
        Student std4 = new Student("bla","Ali","0645363536","hgdggfd@shgfd.com","JT343524",mj2);
        Student std5 = new Student("bla","Ali","0645363536","hgdggfd@shgfd.com","JT343524",mj3);
        Student std6 = new Student("bla","Ali","0645363536","hgdggfd@shgfd.com","JT343524",mj4);
        // Display computer science students
        System.out.println("The list of students in Computer science is: ");
        Major.computer_science.displayStudents();
        //Formatted name
        System.out.println(std3.getFullFormattedName());
        //Find student by CNE
        mj1.findStudentByCNE("JT343524");
        System.out.println("The student with the CNE JT343524 in Art major is: "+mj1.findStudentByCNE("JT343524").getFullFormattedName());
        //Remove student by CNE
        mj1.removeStudentByCne("JT343524");
        System.out.println("The student with the CNE JT343524 in Art major is: "+mj1.findStudentByCNE("JT343524"));
        Major.computer_science.getOccupancyRate();
        //Students list
        System.out.println(Major.computer_science.getStudentListAsString());

    }
}

