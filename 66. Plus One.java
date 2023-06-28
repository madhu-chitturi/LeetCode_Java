import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        String s="";
        for(int i=0;i<digits.length;i++){
            s+=String.valueOf(digits[i]);
        }
        BigInteger res=new BigInteger(s);
        BigInteger ans = res.add(BigInteger.ONE);
        String r=String.valueOf(ans);
        int[] arr=new int[r.length()];
        for(int i=0;i<r.length();i++){
            arr[i]=Integer.parseInt(String.valueOf(r.charAt(i)));
        }
        return arr;
    }
}
