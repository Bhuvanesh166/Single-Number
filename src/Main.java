import java.util.Scanner;

class SingleNumber{
    public int findNumber(int[] arr){
        int res=0;
        for(int i=0;i< arr.length;i++){
            res=res^arr[i];
           // System.out.println(res);
        }
        return res;
    }

    public static void main(String[] args) {
  SingleNumber singleNumber=new SingleNumber();
        Scanner scanner=new Scanner(System.in);
        int sze=scanner.nextInt();
        int arr[]=new int[sze];
        for(int i=0;i<sze;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Single Number "+singleNumber.findNumber(arr));
    }
}