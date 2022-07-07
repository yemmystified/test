import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class minMaxSum{

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        //  Collections.sort(arr);
        // long min = Long(arr.get(0) + arr.get(1) +arr.get(2) + arr.get(3));
        // long max = Long(arr.get(1) +arr.get(2) + arr.get(3) + arr.get(4));
        
        // arr = arr.stream().sorted((a, b) -> a - b).collect(Collectors.toList());
        // // for (List<Integer>  a : arr) {
        // //     a..get(+1);
        // // }
        
        // // System.out.println(min + " " + max);
        // // System.out.println(arr);
        // // return (min + " " + max);

        // // System.out.println("Hello World;");

        // int min = 0;
        // int max = 0;
        // for(int i=0; i<4; i++){
            
        //     min+=arr.get(i);
        //     // min = min + arr.get(i);

        // }
        // for(int i=1; i<5; i++){
            
        //     max+=arr.get(i);
        //     // min = min + arr.get(i);

        // }
        
        // // System.out.println(min + " " + max);
        // long minn = Long.parseLong( min);
        // System.out.println(minn + " " + max);
        // System.out.println(arr.get(0)+arr.get(1)+arr.get(2)+arr.get(3));
        // System.out.println(arr.get(4)+arr.get(1)+arr.get(2)+arr.get(3));
        //         System.out.println(arr);
        
        }

        public static void main(String[] args){
            // // System.out.println("Hello World;");
            // List<Integer> arx = new LinkedList<Integer>();
            // // arx.add(3);
            // arx.add(256741038);
            // arx.add(623958417);    
            // arx.add(467905213);
            // arx.add(714532089);
            // arx.add(938071625);

            // // System.out.println(arx);
            // miniMaxSum(arx);



            // Scanner in=new Scanner(System.in);
            // long[] m=new long[5];
            // for(int i=0;i<5;i++){
            //     m[i]=in.nextLong();
            // }
            // Arrays.sort(m);
            // long x=0;
            // long y=0;
            // for(int i=0;i<4;i++){
            //     x+=m[i];
            // }
            // for(int i=1;i<5;i++){
            //     y+=m[i];
            // }
            // System.out.println(x+" "+y);



            // Scanner in=new Scanner(System.in);
            // int[] m=new int[5];
            // for(int i=0;i<5;i++){
            //     m[i]=in.nextInt();
            // }
            // Arrays.sort(m);
            // int x=0;
            // int y=0;
            // for(int i=0;i<4;i++){
            //     x+=m[i];
            // }
            // for(int i=1;i<5;i++){
            //     y+=m[i];
            // }
            // System.out.println(x+" "+y);


            Predicate<String> length3 = (x) -> x.length()==(3);
            Predicate<String> containsA = (x) -> x.contains("A");

            List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
            List<String> answer = list.stream().filter(length3.or(containsA)).collect(Collectors.toList());
            answer.forEach(System.out::println);
        }
  }
  