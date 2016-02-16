/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe;

/**
 *
 * @author Jimmy
 */
public class Q4 {
    public static void main(String[] args) {
        int max1 = 0;
        int max2 = 0;
        boolean woo;
        for (int i = 1; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                woo = true;
                String strVal = String.valueOf(i*j);
                for (int k = 0; k < strVal.length(); k++) {
                    if (strVal.charAt(strVal.length() - k - 1) != strVal.charAt(k)) {
                        woo = false;
                        break;
                    }
                }
                //System.out.println(strVal.charAt(strVal.length() - k - 1) + "," + strVal.charAt(k));
                if (woo == true) {
                    System.out.printf("%d %d\n", i, j);
                    if (i*j > max1*max2) {
                        max1 = i;
                        max2 = j;
                    }
                }
            }
        }
//        for (int i = 0; i < test.length(); i++) {
//            if (test.charAt(test.length() - i - 1) == test.charAt(i)) {
//                System.out.println(test.charAt(test.length() - i - 1) + "," + test.charAt(i));
//        }
        System.out.printf("%d %d %d", max1, max2, (max1*max2));
    }
}
    
