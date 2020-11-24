import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution3 {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	String[] arr = s.split("");
    	do {
    		for(int i=0; i<arr.length; i++) {
    				s = s.concat(arr[i]);
    		}
     	} while(s.length() <= n);
    	long l =  Arrays.stream(s.split("")).limit(n).filter(st -> st.equals("a")).count();	
    	return l;
    }

    

    public static void main(String[] args){
    	System.out.println(Solution3.repeatedString("abc", 16));
    }
}
