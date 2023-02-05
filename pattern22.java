public class pattern22 {
    public static void main(String[] args) {
        printSquare(5);
    }
    static void printSquare(int n) {
        for(int row=1;row<=2*n -1;row++)
        {
            for(int col=1;col<=2*n-1;col++)
            {
                int value=Math.min(Math.min(row-1,col-1),Math.min(2*n-1-row,2*n-1-col));
                System.out.print(n-value+" ");
            }
            System.out.println();
        }
    }
}
