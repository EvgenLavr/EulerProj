
/*

Problem3
                                                         Largest prime factor
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

 */

public class Prob3 {
    public static void main(String[] args) {
        long numb = 600851475143l;
        long primeFactor=2;
        while(numb>primeFactor){
            if(numb%primeFactor==0) {
                numb = numb / primeFactor;
                continue;
            }
            primeFactor++;
        }
        System.out.println(primeFactor);
    }
}
