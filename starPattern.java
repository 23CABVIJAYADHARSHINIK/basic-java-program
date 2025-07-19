public class starPattern
{    public static void main(String args[])
    {
        for(int i = 6;i>=1; i--)//row
        {
            for(int j=1; j<=i; j++)//col
            {
                System.out.print(j);
            }
            System.out.println("* ");
        }
    }
}
