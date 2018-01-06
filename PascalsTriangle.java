class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        
        List<Integer> prev = new ArrayList<Integer>();       
        List<List<Integer>> finalSoln = new ArrayList<List<Integer>>();
        
        if(numRows==0){
            return finalSoln;
        }
        
        for(int i=0; i<numRows; ++i){
            List<Integer> curr = new ArrayList<Integer>();
            
            if(i==0){
                curr.add(1);
                finalSoln.add(curr);
            }else if(i==1){
                curr.add(1);
                curr.add(1);
                prev = curr;
                finalSoln.add(curr);
            }else{
                curr.add(1);
                for(int j=0; j<prev.size()-1; ++j){
                    curr.add(prev.get(j)+prev.get(j+1));                    
                }
                curr.add(1);
                prev = curr;
                finalSoln.add(curr);                
            }         
            
        }
        
        
        return finalSoln;
    }
}