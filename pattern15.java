public class pattern15 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n-row;col++)
            {
                System.out.print((char)(65+col));
            }
            System.out.println();
        }
    }
}
