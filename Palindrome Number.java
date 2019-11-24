class Solution {
    public boolean isPalindrome(int x) {
        
      int numberStore = x;
      
      int reversed = 0;
      
      
      
      while(numberStore != 0){
        int digit = numberStore % 10;
        reversed = reversed* 10 + digit;
        numberStore = numberStore/ 10;
      }
      
      if(reversed == x && x>= 0){
        return true;
      }
      else {
        return false;
      }
      
      
      
      
      
      
    }
}