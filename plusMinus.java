import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here

    int n = arr.size();
    double negNo = 0;
    double posNo = 0;
    double zeroNo = 0;
    
    for(int i : arr){
        if(i < 0){
            negNo++;
        }
        else if(i > 0){
            posNo++;
        }
        else{
            zeroNo++;
        }
    }
    
     DecimalFormat dec = new DecimalFormat("#.000000");
        double pos = Double.valueOf(dec.format(posNo * 1.0 /n));
        double neg = Double.valueOf(dec.format(negNo * 1.0 /n));
        double zer = Double.valueOf(dec.format(zeroNo * 1.0 /n));
        System.out.println(pos);
        System.out.println(neg);
        System.out.println(zer);

  
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
