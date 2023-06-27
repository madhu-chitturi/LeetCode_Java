class Solution {
    public boolean isValid(String str) {
        char[] c=str.toCharArray();
        Stack<Character> l=new Stack<>();
        for(char s:c){
            if(s=='('){
                l.push(s);
            }
            else if(s==')'){
                if(l.size()!=0){
                    if(l.peek()=='('){
                        l.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            if(s=='{'){
                l.push(s);
            }
            else if(s=='}'){
                if(l.size()!=0){
                    if(l.peek()=='{'){
                        l.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            if(s=='['){
                l.push(s);
            }
            else if(s==']'){
                if(l.size()!=0){
                    if(l.peek()=='['){
                        l.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        if(l.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
}
