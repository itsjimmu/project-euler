package pe;

import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;

public class Q3 {
    
    public static BigInteger sqrt(BigInteger n) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
        while(b.compareTo(a) >= 0) {
            BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
            if(mid.multiply(mid).compareTo(n) > 0) b = mid.subtract(BigInteger.ONE);
            else a = mid.add(BigInteger.ONE);
        }
        return a.subtract(BigInteger.ONE);
    }
    
    public static void main(String[] args) {
	BigInteger big = new BigInteger("600851475143");
       	BigInteger kindOfBig = sqrt(big);
        long biglong;
        biglong = kindOfBig.longValue();
        List primeList = new ArrayList();
//	for(int i = 0; i < biglong; i++) {
//            primeList.add(i);
//	}
        for (int j = 3; j < biglong; j++) {
            while ((big.mod(BigInteger.valueOf(j)) == BigInteger.ZERO) && (big.divide(BigInteger.valueOf(j)) != BigInteger.ONE)) {
                big = big.divide(BigInteger.valueOf(j));
                System.out.println(big.toString());
                primeList.add(j);
            }
            
            //BigInteger k = big.mod(BigInteger.valueOf(j));
            //if (k.longValue() == 0) {
            //    primeList.remove(k.longValue());
            //}
        }
        System.out.println(primeList.toString());
        
	}

}
