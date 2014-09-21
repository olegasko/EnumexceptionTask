/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package enumexceptiontask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author oleg
 */
public enum Month {
    JAN(31),FEB(28),MAR(31),APR(30),MAY(31),JUN(30),
    JUL(31),AUG(31),SEP(30),OCT(31),NOV(30),DEC(31);
    private int numberOfDays;
    private static List<Month> sortedMonths = new ArrayList<Month>(
            Arrays.asList(
                    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC));
    private Month(int numberOfDays){
        
        this.numberOfDays=numberOfDays;
    }
    public static int getNumberOfDaysBetween(Month monthFrom, Month monthTo){
         int totalDays = 0;
        int monthFromIndex = sortedMonths.indexOf(monthFrom);
        int monthToIndex = sortedMonths.indexOf(monthTo);
        if (monthFromIndex<monthToIndex){
            for (int i = monthFromIndex; i <= monthToIndex; i++) {
                totalDays+=sortedMonths.get(i).numberOfDays;
            }
        }
        else {
            totalDays=365;
            for (int i = monthFromIndex; i <=monthToIndex; i++){
                totalDays-=sortedMonths.get(i).numberOfDays;
            }
            }
        return totalDays;
    }
    
}
