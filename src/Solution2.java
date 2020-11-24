import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution2 {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int x = 0;
       List<Integer> lol = Arrays.stream(ar).boxed().collect(Collectors.toList());
       Map<Object, Long> map = lol.stream().collect(Collectors.groupingBy(v->v, Collectors.counting()));
       List<Long> list = map.values().stream().collect(Collectors.toList());
       Iterator itr = list.iterator();
       while(itr.hasNext()) {
           Long i = (Long)itr.next();
           x = (int)(x + i/2);
       }
        return x;
    }

    
    public static void main(String[] args) {
    	int[] arr = {10,20,20,10,10,30,50,10,20};
        System.out.println(Solution2.sockMerchant(9, arr));
    }
}

