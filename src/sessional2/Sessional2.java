/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessional2;

/**
 *
 * @author fa14-bse-027
 */
public class Sessional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Admin takeexam1 = new exam("Sessional","MCQ'S", new Takeexam1());
      Admin takeexam2 = new exam("Sessiona2","Objective Type", new Takeexam2());

      takeexam1.takeexam();
      takeexam2.takeexam();
   }
    
    
}
