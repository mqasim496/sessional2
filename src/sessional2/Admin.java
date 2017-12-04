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
public abstract class Admin {
      protected examAPI examAPI;
   
   protected Admin(examAPI examAPI){
      this.examAPI = examAPI;
   }
   public abstract void takeexam(); 
}
