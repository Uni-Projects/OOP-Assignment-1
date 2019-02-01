package assignment.pkg1;

public class Group {
    
    private Student[] students;
    private int size;
    
    public Group (int groupSize){
        this.size = groupSize;
        this.students = new Student[size]; 
    }
    
    public void addStudent(int index, String name, String surname, int id){
        Student student = new Student (name, surname, id);
        this.students[index] = student;
    }
    
    public void modifyStudent(int id, String name, String surname){ 
        for (int i = 0 ; i < size ; i++){
            if(students[i].isStudent(id))
            {
                this.students[i].setName(name);
                this.students[i].setSurname(surname);
            }
        }
    }
    
    public void showGroup(){
        System.out.println("The group now contains:");
        for (int i = 0 ; i < size ; i++){
            System.out.println(students[i]);
        }
    } 
}
    
