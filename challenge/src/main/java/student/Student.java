package student;

public class Student extends Person {
    private String cne;
    private Major major;
    public Student() {}
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        this.major = major;

    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(nom, prenom, telephone, email);
        this.cne = cne;

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
                ", major=" + major.getName() +
                '}';
   }
}

