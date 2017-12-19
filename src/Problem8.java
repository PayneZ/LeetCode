/**
 * Created by Payne on 2017/12/18.
 */
public class Problem8 {
    public int myAtoi(String str){
        int sum = 0;
        int sign = 1;
        boolean signed = false;

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '-'){
                if(signed)
                    return 0;
                sign = -1;
                signed = true;
                continue;
            } else if(c == '+'){
                if(signed)
                    return 0;
                signed = true;
                continue;
            } else if(c - '0' >= 0 && c - '9' <= 0)
                sum = 10 * sum + str.charAt(i) - '0';
            else
                return 0;
        }
        return sign * sum;
    }
}
