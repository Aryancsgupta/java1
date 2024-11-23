public class binrary_search {
    public static int binrarysearch(int num[],int search){
        int start = 0,end = num.length-1;
        while(start <= end){
            int mid = (start+end)/2;

            if(num[mid]== search){
                return mid;
            }
            if( num[mid]<search){
                start = mid+1;
            }
            else{
                end = mid-1; 
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[] = {2,4,6,8,10,12,14};
        int search = 10;
        System.out.print(binrarysearch(num,search));
    }
}
