package instructor;
import student.*;

public class Instructor extends Person {
    private String EmployeeNumber;
    public Instructor(String firstName, String secondName, String telephone, String email,String EmployeeNumber){
        super(firstName, secondName, telephone, email);
        this.EmployeeNumber = EmployeeNumber;
    }
    public void cleanEmployeeNumber(){
        this.EmployeeNumber = this.EmployeeNumber.replace(" ","");
    }
    public String summaryLine(){
        return String.format("Instructor[EmployeeNumber=%s, lastName=%s, firstName=%s",EmployeeNumber,this.getSecondName(),this.getFirstName());

    }
    public String toCard() {
        StringBuilder sb = new StringBuilder();

        sb.append("Instructor\n");
        sb.append("----------\n");
        sb.append("Employee #: ").append(EmployeeNumber).append("\n");
        sb.append("Name      : ").append(this.getSecondName()).append(", ").append(this.getFirstName()).append("\n");
        sb.append("Email     : ").append(this.getEmail()).append("\n");
        sb.append("Phone     : ").append(this.getPhone()).append("\n");

        return sb.toString();
    }
    public String displayName() {
        StringBuilder sb = new StringBuilder();

        if (getSecondName() != null && !getSecondName().isEmpty()) {
            sb.append(getSecondName());
        }

        if (getFirstName() != null && !getFirstName().isEmpty()) {
            if (sb.length() > 0) {
                sb.append(" "); // add space if last name exists
            }
            sb.append(getFirstName());
        }

        // If both are null or empty, return a placeholder
        if (sb.length() == 0) {
            sb.append("Unknown");
        }

        return sb.toString();
    }



}
