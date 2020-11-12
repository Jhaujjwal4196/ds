import java.util.*;

class Converter{
    public void convertBinary(){
int x;

Scanner sc = new Scanner(System.in);
System.out.println("plesae provide us the digit you wanna convert:\n");
x= sc.nextInt();

int arr[]= new int[40];
int index=0;
while(x>0){
    int j= x%2;
    arr[index++]=j;
    x=x/2;
}
System.out.println("The Binary Conversion of the provided number is:");
for(int i=index-1;i>=0;i--){
System.out.print(arr[i]);
}
    }
}
public class DecToBinary{
    public static void main(String[] args) {
        Converter c1= new Converter();
        c1.convertBinary();
    }
}