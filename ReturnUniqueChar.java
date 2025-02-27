   /* Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

    Input: s = "leetcode"
    Output: 0
    
    Explanation:
    The character 'l' at index 0 is the first character that does not occur at any other index.
    
    Input: s = "loveleetcode"
    Output: 2

    Input: s = "aabb"
    Output: -1*/
public class ReturnUniqueChar {
  
    public int uniqueChar(String s){
        for (int i=0;i<=s.length();i++){
            char c=s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                return i;
            }
        }
        return -1;
     }
     public static void main(String[] args) {
        ReturnUniqueChar obj = new ReturnUniqueChar();
        String s = "interview";
        int result = obj.uniqueChar(s);
        System.out.println(result);
    }
  

}
