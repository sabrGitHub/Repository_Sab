/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringExemple;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1795891
 */
public class Professor  extends Person{
    List<Student> students=new ArrayList<Student>();
    String photoUrl;
    public Professor(String lastName,String firstName){
            String employeeID=formateEmployeeID(lastName, firstName);
            System.out.println("New Professor: "+employeeID);
    }

    private String formateEmployeeID(String lastName1, String firstName) {
        return lastName1.toUpperCase().trim().substring(1, 3) + firstName.toUpperCase().trim().substring(1,3);//trim()enlever les espace 
    }
     public void setPhotoUrl(String photoName, String photoPath){
     this.photoUrl=photoPath+photoName;
     }

    public void isSupervisedBy(Student student) {
        this.students.add(student);
    }
    
    
}
