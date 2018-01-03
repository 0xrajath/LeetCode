class Solution {
    public int romanToInt(String s) {
        int stringLength = s.length();
        int finalSoln = 0;
        
        
        
        for(int i=0 ; i<stringLength;++i){
            String currentChar = Character.toString(s.charAt(i));            
            int currentCharValue = romanCharToInt(currentChar);
            boolean subtractCheck = false;
            
            if(i<stringLength-1){
                String nextChar = Character.toString(s.charAt(i+1));
                int nextCharValue = romanCharToInt(nextChar);
                if(currentCharValue < nextCharValue){
                   finalSoln = finalSoln - currentCharValue;
                   subtractCheck = true;
                }
            }
            
            if(!subtractCheck){
                finalSoln = finalSoln + currentCharValue;
            }            
            
        }
        
        return finalSoln;
        
    }
    
    private int romanCharToInt(String s){
        switch(s){
                case "I":
                  return 1;
                case "V":
                  return 5;
                case "X":
                  return 10;
                case "L":
                  return 50;
                case "C":
                  return 100;
                case "D":
                  return 500;
                case "M":
                  return 1000;                
                default:
                  return 0;
             }
    }
    
}