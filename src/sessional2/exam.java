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
public class exam extends Admin {
       private String examname, examtype;

   public exam(String examname, String examtype, examAPI examAPI) {
      super(examAPI);
      this.examname = examname;  
      this.examtype = examtype;  
   }

   public void takeexam() {
      examAPI.exam(examname,examtype);
   }
}
