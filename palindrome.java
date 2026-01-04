class Solution {
    public boolean isPalindrome(int x) {
    int rev=0;
    int temp=x;
    while(x>0){
        int ld=x%10;
        rev=(rev*10)+ld;
        x=x/10;
    }    
    if(temp==rev){
       return true;
    }
    else{
        return false;
    }
    }
}