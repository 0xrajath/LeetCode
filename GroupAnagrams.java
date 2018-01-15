import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> lookup = new HashMap<String, List<String>>();
        
        for(int i=0; i<strs.length; ++i){
            char[] ar = strs[i].toCharArray();
            Arrays.sort(ar);
            String sorted = String.valueOf(ar);
            
            if(lookup.containsKey(sorted)){
                (lookup.get(sorted)).add(strs[i]);
            }else{
                List<String> temp = new ArrayList<String>();
                temp.add(strs[i]);
                lookup.put(sorted, temp);
            }         
        }
        
        List<List<String>> finalSoln = new ArrayList<List<String>>();
        
        for(List<String> stringList : lookup.values()){
            finalSoln.add(stringList);
        }
        
        return finalSoln;
    }
}