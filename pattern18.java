public class pattern18 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        for(int row=0;row<n;row++)
        {
            for(int col=n;col>=n-row;col--)
            {
                System.out.print((char)(64+col)+" ");
            }
            System.out.println();
        }
    }
}
