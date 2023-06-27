class Solution {
    public int removeElement(int[] arr, int val) {
        int cnt=0;
        if(arr.length==0){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                cnt++;
            }
        }
        int p1=0,p2=arr.length-1;
        while(p1<p2){
            if(arr[p1]==val && arr[p2]==val){
                p2--;
            }
            else if(arr[p1]==val && arr[p2]!=val){
                arr[p1]=arr[p2];
                arr[p2]=val;
                p1++;
                p2--;
            }
            else if(arr[p1]!=val && arr[p2]==val){
                p1++;
                p2--;
            }
            else{
                p1++;
            }
        }
        return cnt;
    }
}
