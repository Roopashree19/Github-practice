public class arrays {
    public static void main(String[] args){
        int[] arr=new int[3];
        int sum=0;
        arr[0]=1;
        arr[1]=10;
        arr[2]=-11;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
