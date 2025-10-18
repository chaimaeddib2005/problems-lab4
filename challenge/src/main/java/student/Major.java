package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;
    public static Major computer_science;

    public Major(String code, String name) {
        this.code = code;
        this.name = name;
        this.id = nextId++;
        this.students = new Student[0];
    }

    public void addStudent(Student s) {
        s.setMajor(this);
        Student[] newStudents = new Student[studentCount + 1];
        for (int i = 0; i < studentCount; i++) {
            newStudents[i] = students[i];
        }
        newStudents[studentCount] = s;
        this.students = newStudents;
        this.studentCount++;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public String getCode() { return code; }
    public Student[] getStudents() { return students; }
    public int getStudentCount() { return studentCount; }

    public void displayStudents() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println((i+1) +"."+students[i].getCne()+", "+students[i].getSecondName()+", "+students[i].getFirstName());
        }
    }

    @Override
    public String toString() {
        return "Major{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void createDefault() {
        computer_science = new Major("23", "Computer Science");
        computer_science.id = 0;
        computer_science.students = new Student[0];
        computer_science.studentCount = 0;
    }
    public Student findStudentByCNE(String cne){

        for(int i=0;i<studentCount;i++){
            if(students[i].getCne().equals(cne)){
                return students[i];

            }

        }
        return null;
    }
    public boolean removeStudentByCne(String cne) {
        Student studentToRemove = findStudentByCNE(cne);

        if (studentToRemove == null) {
            return false; // No student found with that CNE
        }

        int indexToRemove = -1;
        for (int i = 0; i < studentCount; i++) {
            if (students[i] == studentToRemove) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            for (int j = indexToRemove + 1; j < studentCount; j++) {
                students[j - 1] = students[j];
            }
            studentCount--; // Decrease the count after removal
            return true;
        }

        return false;
    }

    public void getOccupancyRate(){
        double rate = (double) studentCount / 50 * 100;
        System.out.println(name+ "capacity: "+50);
        System.out.println("Current enrollment: "+studentCount+" students");
        System.out.println("Occupancy rate: "+rate+"%");
    }
    public String getStudentListAsString() {
        StringBuilder sb = new StringBuilder();

        if (studentCount == 0) {
            sb.append("No students enrolled in ").append(name).append(".\n");
        } else {
            sb.append("List of students in ").append(name).append(":\n");
            for (int i = 0; i < studentCount; i++) {
                sb.append(students[i].getFullFormattedName());
                if (i < studentCount - 1) {
                    sb.append("\n");
                }
            }
        }

        return sb.toString();
    }

}
