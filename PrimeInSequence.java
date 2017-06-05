import java.util.Scanner;
import java.util.ArrayList;
public class PrimeInSequence {
    public static void main (String [] args) {
        ArrayList<Integer> primeNums = new ArrayList<Integer>();
        Scanner endLimit = new Scanner(System.in);
        System.out.println("Prime in sequence finder");
        System.out.println("Enter the end limit of your sequence: ");
        int end = endLimit.nextInt();
        for(int i = 1; i <= end; i++) {
            if(isPrime(i)) {
                primeNums.add(i);
            }
        }
        System.out.println(primeNums);
    }
    public static boolean isPrime(int x) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        boolean prime;
        int base = 1;
        while(x >= base) {
            if(x % base == 0) {
                factors.add(base);
            }
            base++;
        }
        if(factors.size() == 2) {
             prime = true;
        } else {
             prime = false;
        }
        factors.clear();
        return prime;
    }
}