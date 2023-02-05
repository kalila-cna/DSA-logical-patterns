public class pattern21 {
    public static void main(String[] args) {
        printSquare(5);
    }
    static void printSquare(int n) {
        for(int row=0;row<n;row++)
        {
            if(row==0 || row==n-1)
            {
                for(int col=0;col<n;col++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else
            {
                System.out.print("*");
                for(int space=0;space<n-2;space++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
