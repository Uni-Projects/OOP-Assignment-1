package assignment.pkg1;

public class Student {
    private String givenName;
    private String familyName;
    private int studentNumber;
    
    public Student (String name, String surname, int id){
        this.givenName = name;
        this.familyName = surname;
        this.studentNumber = id;
    }
    
    public void setName (String name){
        this.givenName = name;
    }
    public void setSurname (String surname){
        this.familyName = surname;
    }
    public boolean isStudent (int id){
        return id == studentNumber;
    }
    @Override
    public String toString(){
        return givenName + " " + familyName + " , " + "s"+studentNumber;
    }
}
