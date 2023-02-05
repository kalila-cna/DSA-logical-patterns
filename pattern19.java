public class pattern19 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        for(int row=0;row<2*n;row++)
        {
            if(row==0 || row==2*n-1)
            {
                for(int col=0;col<2*n;col++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else if(row<n)
            {
                for(int col=0;col<n-row;col++)
                {
                    System.out.print("*");
                }
                for(int space=0;space<2*n - (2*(n-row));space++)
                {
                    System.out.print(" ");
                }
                for(int col=0;col<n-row;col++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else
            {
                for(int col=0;col<=row-n;col++)
                {
                    System.out.print("*");
                }
                for(int space=0;space<2*n -(2*(row-n))-2;space++)
                {
                    System.out.print(" ");
                }
                for(int col=0;col<=row-n;col++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
