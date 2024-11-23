public class linear_search {
    public static int linear_search(int arr[],int search){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == search){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14};
        int search = 10;
        System.out.println(linear_search(arr,search));
    }
}
