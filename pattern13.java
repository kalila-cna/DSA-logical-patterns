public class pattern13 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        int k=1;
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<=row;col++)
            {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    
    }
}
