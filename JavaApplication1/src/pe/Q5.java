/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Jimmy
 */
public class Q5 {
    public static void main(String[] args) {
        boolean flag = true;
        int j = 1;
        while (flag) {
            for (int k = 10; k < 21; k++) {
                if (j % k != 0) {
                    break;
                }
                if (k == 20) {
                    flag = false;
                }
            }
            j++;
        }
        System.out.println(j - 1);
    }
    
}
