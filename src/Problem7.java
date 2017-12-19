/**
 * Created by Payne on 2017/12/18.
 */
public class Problem7 {
    public int reverse(int x){
        int sign = x > 0 ? 1 : -1;
        long abs = x;
        abs = abs * sign;

        long remainder = abs % 10;
        long quotient = abs / 10;
        long sum = remainder;

        while(quotient > 0){
            remainder = quotient % 10;
            quotient = quotient / 10;
            sum = sum * 10 + remainder;
        }

        if (sum > 2147483647 ) {
            return 0;
        } else {
            return ((int)sum) * sign;
        }

    }

    public static void main(String[] args){
        Problem7 p = new Problem7();
        p.reverse(123);
        int[] test = {123, -123, 120};
        for(int i : test){
            System.out.println(p.reverse(i));
        }
    }
}
