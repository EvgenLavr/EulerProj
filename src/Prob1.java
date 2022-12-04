
/*

Problem1
                                           Multiples of 3 or 5.
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

*/

public class Prob1 {
    public static void main(String[] args) {
        int result=0;
        for(int StartNum=0; StartNum<1000; StartNum++){
            if(StartNum%3==0 || StartNum%5==0) {
                result+=StartNum;
            }
        }
        System.out.println(result);
    }
}
