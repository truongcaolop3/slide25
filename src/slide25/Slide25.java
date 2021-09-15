/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide25;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Slide25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double BMI;
        double CN,CC;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap can nang: ");
        CN = sc.nextDouble();
        System.out.println("nhap chieu cao: ");
        CC = sc.nextDouble();
        
        BMI = CN / (CC*CC);
        /*
        float bmi = (cannang)/(chieucao*chieucao);
        */
        System.out.println("BMI: " + BMI);
        if (BMI > 0) {
            
            if ( BMI < 18.5){
                System.out.println("Underweight ! ");
            }else if (BMI >= 18.5 && BMI < 25.5){
                System.out.println("Normal");
            }else if (BMI >= 25.0 && BMI <30.0){
                System.out.println("Overweight  ");
            }else {
                System.out.println("Obese");
            }
        }    
        
    }
    
}
