package instructor;

public class Test {
    public static void main(String[] args) {

        // --- Test Instructor ---
        Instructor prof1 = new Instructor("John", "Smith", "0653443534", "jsmith@example.com", "EMP 123");
        Instructor prof2 = new Instructor(null, "Doe", null, "doe@example.com", "EMP 456");
        Instructor prof3 = new Instructor("Alice", null, "0653443536", null, "EMP 789");
        Instructor prof4 = new Instructor(null, null, null, null, "EMP 000");

        // Clean employee numbers
        prof1.cleanEmployeeNumber();
        prof2.cleanEmployeeNumber();

        // Display cards
        System.out.println("--- Instructor Cards ---");
        System.out.println(prof1.toCard());
        System.out.println(prof2.toCard());

        // Display names
        System.out.println("--- Display Names ---");
        System.out.println(prof1.displayName()); // Smith John
        System.out.println(prof2.displayName()); // Doe
        System.out.println(prof3.displayName()); // Alice
        System.out.println(prof4.displayName()); // Unknown

        // Summary line
        System.out.println("--- Summary Lines ---");
        System.out.println(prof1.summaryLine());
        System.out.println(prof2.summaryLine());

        // --- Test Subject ---
        Subject math = new Subject();
        Subject cs = new Subject();

        // Set code and title using setters
        math.setCode("MATH101");
        math.setTitle("introduction to algebra");

        cs.setCode("CS201");
        cs.setTitle("intro to programming");

        // Proper title and normalization
        System.out.println("--- Proper Titles & Codes ---");
        System.out.println(math.properTitle());       // Introduction To Algebra
        System.out.println(math.normalizeCode());     // MATH101
        System.out.println(cs.properTitle());         // Intro To Programming
        System.out.println(cs.normalizeCode());       // CS201

        // Syllabus lines using getters from Instructor
        System.out.println("--- Syllabus Lines ---");
        System.out.println(math.syllabusLine(prof1)); // MATH101 - introduction to algebra (Instructor: Smith John)
        System.out.println(cs.syllabusLine(prof2));   // CS201 - intro to programming (Instructor: Doe null)

        // Intro course check
        System.out.println("--- Intro Courses ---");
        System.out.println(math.isIntroCourse()); // false
        System.out.println(cs.isIntroCourse());   // true
    }
}
