import java.util.HashMap;
import java.util.Map;

/**
 * Created by Payne on 2017/9/12.
 */
public class Problem3 {
    public static int lengthOfLongestSubstring(String s){
        if(s.length() == 0)
            return 0;

        Map<Character, Integer> holder = new HashMap<>();
        int maxLength = 1;
        int index = 0;
        int counter = 0;

        while(true){
            if(index >= s.length())
                break;

            char c = s.charAt(index);
            if(holder.containsKey(c)){
                index = holder.get(c) + 1;
                if(counter > maxLength)
                    maxLength = counter;
                counter = 0;
                holder.clear();
            } else {
                holder.put(c, index);
                counter++;
                index++;
            }
        }

        if(counter > maxLength)
            maxLength = counter;

        return maxLength;
    }

    public static void main(String[] args){
        String[] test = {"abcabcbb", "bbbbb", "pwwkew", "pwke"};

        for(String s : test){
            System.out.println(lengthOfLongestSubstring(s));
        }
    }
}
