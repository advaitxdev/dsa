// Last updated: 4/25/2026, 11:35:03 PM
class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        char ch=s.charAt(0),top=s.charAt(0);
       

        for(int i=0;i<s.length();i++) {
            char c =s.charAt(i);
             if(c=='(' || c=='{' || c=='[')
            st.push(c);

             if(ch==')' || ch=='}' || ch==']' && st.isEmpty())
              return false;

              if(!st.isEmpty())
              top=st.peek();


           if(c==')') {
            if(top=='('&& !st.isEmpty())
            st.pop();
            else
            return false;
          }

          if(c=='}') {
            if(top=='{' && !st.isEmpty())
            st.pop();
            else
            return false;
          }

           if(c==']') {
            if(top=='['&& !st.isEmpty())
            st.pop();
            else
            return false;
          }

           }
           return (st.isEmpty());
         

        }
        
    }