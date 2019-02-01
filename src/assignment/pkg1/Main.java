package assignment.pkg1;

import java.util.Scanner;

/**
 * @author Paolo Scattolin s1023775
 * @author Johan Urban s1024726
 */

public class Main {
    
    public static Group createGroup (int groupSize){ 
        Scanner scan = new Scanner(System.in);
       
        Group group = new Group(groupSize);
        
        for(int i = 0 ; i < groupSize ; i ++){
            System.out.println("Please enter "+(i+1)+"° student name:");
            String name = scan.next();
            System.out.println("Please enter "+(i+1)+"° student surname:");
            String surname = scan.next();
            System.out.println("Please enter "+(i+1)+"° student number:");
            int id = scan.nextInt();
            
            group.addStudent(i, name, surname, id);      
        }
        return group;
    }
    
    public static void modifyGroup (Group group){   
        Scanner scan = new Scanner(System.in);
        boolean nextInput = true;
        
        do{
            System.out.println("Please enter student number:");
            int id = scan.nextInt();
            if (id>=0){
              System.out.println("Please enter a new name:");
              String name = scan.next();
              System.out.println("Please enter a new surname:");
              String surname = scan.next();
            
              group.modifyStudent(id, name, surname);
              group.showGroup();  
            }
            else{
                nextInput = false;
                System.out.println("Bye!");
            }   
        }while(nextInput);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the group size:");
        int groupSize = scan.nextInt();
        
        Group group = createGroup(groupSize);
        group.showGroup();
        modifyGroup(group);    
    } 
}


