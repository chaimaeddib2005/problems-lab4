package instructor;
import student.*;
public class Subject {
    private int id;
    private String code;
    private String title;
    public String normalizeCode(){
        String newCode;
        newCode = this.code.replace(" ","");
        newCode = newCode.toUpperCase();
        return newCode;
    }
    public  String properTitle(){
        if(title == null){
            return "";
        }
        String result = "";
        String[] words = title.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                result += words[i].substring(0, 1).toUpperCase()  // First letter uppercase
                        + words[i].substring(1).toLowerCase();    // Rest lowercase
                if (i < words.length - 1) {
                    result += " ";  // Add space between words
                }
            }
        }

        return result;

    }
    public boolean isIntroCourse(){
        if(this.properTitle().startsWith("Intro")){
            return true;
        }
        return false;
    }
    public String syllabusLine(Instructor instructor) {
        StringBuilder sb = new StringBuilder();

        sb.append(code)                       // Subject code
                .append(" - ")
                .append(title)                      // Subject title
                .append(" (Instructor: ")
                .append(instructor.getSecondName())   // Instructor last name
                .append(" ")
                .append(instructor.getFirstName())  // Instructor first name
                .append(")");

        return sb.toString();
    }
    public String getCode(){
        return this.code;
    }

    public String getTitle() {
        return title;
    }
    public void setCode(String code){
        this.code = code;

    }
    public void setTitle(String title){
        this.title = title;
    }
}