import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
    	
        String[] arr = s.split("");
        
        if(s.length() == 1) {
        	return "YES";
        }
        Map<String, Long> map =Stream.of(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
        
        Map<Long, Long> mp = map.values().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mp);
        
        List<Long> keyList = mp.keySet().stream().collect(Collectors.toList());
        
        if(mp.size() == 2 && mp.values().contains(1L) && 
        		((keyList.get(0) - keyList.get(1) == 1) || (keyList.get(1) - keyList.get(0) == 1))) {
        	return "YES";
        }
       /*Map<Integer, Integer> mp = new HashMap<>();
       List<Integer> list =  map.values().stream().collect(Collectors.toList());
       for(Integer i: list) {
    	   if(mp.containsKey(i)) {
    		   mp.put(i, mp.get(i)+1);
    	   } else {
    		   mp.put(i, 1);
    	   }
       }
       System.out.println(mp);
       System.out.println(mp.size() == 2);*/
       
       return "NO";
    }


    public static void main(String[] args) throws IOException {
    	String str = Solution.isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd");
    	System.out.println(str);
    }
}