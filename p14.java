import java.util.*;
public class p14{
    public static void main(String[] args) {
        String strs[]={"dog","racecar","car"};
        StringBuilder ans=new StringBuilder();
        Arrays.sort(strs);
        int beg=0;
        int end=strs.length-1;
        for(int i=0 ; i<strs[0].length();i++){
            if(strs[beg].charAt(i)==strs[end].charAt(i)){
                ans.append(strs[beg].charAt(i));
            }
        }

        System.out.println(ans);


            
        }

    }

