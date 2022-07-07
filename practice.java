import java.math.BigInteger;
import java.util.Scanner;

public class practice {

    public static void incrementArray(int[] input) {
        for(int i = 0; i < input.length; i++){
                input[i]+= 1;
        }
        System.out.println(input);

        // System.arraycopy(src, srcPos, dest, destPos, length);
        
    }

    public static void bigInte(){
        
        Scanner scan = new Scanner(System.in);
        
        BigInteger  x =  scan.nextBigInteger();
        if (x.isProbablePrime(25)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        scan.close();
    
    }

    public static void bigInte2(){
        
        Scanner scan = new Scanner(System.in);
        
        int  x =  scan.nextInt();
        if (x < 100 && x % 2 != 0 && x % 3 != 0){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        scan.close();

        //This is part of a test
    
    }

    
    public static void main(String[] args){
        // Scanner scan = new Scanner(System.in);
        bigInte2();
        // int[] inputx = scan.nextDouble();
        
        // incrementArray(inputx);

        // scan.close();
        // System.out.println("Hello World");
    }
}

