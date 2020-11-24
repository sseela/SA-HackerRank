public class Solution1 {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
    	String str1 = a;
    	String str2 = b;
        for(int i=0; i<str1.length(); i++) {
        for(int j=0; j<str2.length(); j++) {
            if(str1.charAt(i) == str2.charAt(j)) {
                str2 = str2.substring(0,j)+str2.substring(j+1);
                break;
            }
        }
    }
        
        for(int i=0; i<b.length(); i++) {
            for(int j=0; j<a.length(); j++) {
                if(b.charAt(i) == a.charAt(j)) {
                    a = a.substring(0,j)+a.substring(j+1);
                    break;
                }
            }
        }
    return (a.length())+(str2.length());	//how many letter can be deleted from both words to make anagram

    }

    

    public static void main(String[] args) {
       int s= makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke");
       System.out.println(s);
    }
}
