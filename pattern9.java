public class pattern9 {

    public static void main(String[] args) {
        printDiamond(5);
    }
    static void printDiamond(int n) {
        for(int row=0;row<2*n;row++)
        {
            if(row>=n)
            {
                for(int space=n;space<row;space++)
                {
                    System.out.print(" ");
                }
                for(int col=row;col<2*n;col++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else
            {
                for(int space=row;space<n-1;space++)
                {
                    System.out.print(" ");
                }
                for(int col=0;col<=row;col++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
