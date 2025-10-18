package student;

public class Student extends Person {
    private String cne;
    private Major major;
    public Student() {}
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        if(major.getStudentCount() < 50){
            this.major = major;
            major.addStudent(this);
            }
        else{
            this.major = null;
        }

    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {

        this(nom, prenom, telephone, email, cne, Major.computer_science);

    }

    // Getters

    public String getCne() {
        return cne;
    }

    public Major getMajor() {
        return major;
    }

    // Setters
    public void setCne(String cne) {
        this.cne = cne;
    }
    public void setMajor(Major major) {
        this.major = major;
    }

   public String toString(){
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", cne='" + cne + '\'' +
                ", major=" + (major != null ? major.getName() : "None") +
                '}';
   }
   public String getFullFormattedName(){
        return String.format("%s, %s", firstName.toUpperCase(), secondName);

   }
}

