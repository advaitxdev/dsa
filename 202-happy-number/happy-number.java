class Solution {
    public boolean isHappy(int n) {
        int slow = Square(n);
        int fast = Square(Square(n));

        while(slow!=fast){
            slow = Square(slow);
            fast = Square(Square(fast));

            if(slow == 1 || fast == 1){
                return true;
            } 
        }
        
        return slow==1;

        

    }

    public int Square(int n){
        int ans = 0;
        while(n>0){
            int x = n%10;
            ans += x*x;
            n = n/10;
        }
        return ans;
    }
}