/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enumexceptiontask;

import static java.lang.Character.getNumericValue;

/**
 *
 * @author oleg
 */
public class Person {
    private String firstName;
    private String lastName;
    private int dateOfBirth;
    
    Person(){
    this.firstName=firstName;
    this.lastName=lastName;
    this.dateOfBirth=dateOfBirth;
    }
    public static Person createPerson (String firstName, String lastName,int dateOfBirth){
        int numA=getNumericValue('a');
        int numZ=getNumericValue('z');
        for (int i=0;i<=firstName.length();i++){
            int tempChar=firstName.charAt(i);
            if((tempChar<='a')||(tempChar>='z')&&(tempChar=='-')){
                break;
                }
            }        
        }
        
    }
}
