/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author hp
 */
public class Girl extends IdealOld{
 
   public void hasilinfog(){
        if (getTotal() < 17.0) {
            this.info = "You are skinny woman";
        }else if (getTotal() < 22.0){
            this.info = "You are the ideal woman";
        }else if (getTotal() < 27.9){
            this.info = "You are an overweight woman";
        }else if (getTotal() > 30.0){
            this.info = "You are obese woman";
        }
}
}
