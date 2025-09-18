import java.util.Scanner;
public class matrixpattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.of rows");
        int rows=sc.nextInt();
        System.out.println("enter no.of rows");
        int col=sc.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                int k=(i%2==0)?j:(col-1-j);
                int val=(k==0)?0:(k<=2)?1:2;
                System.out.print(val);
            }
            System.out.println();
        }
    }
}