public class pattern3 {
    public static void main(String[] args) {
        printTriangle(5);
    }

    static void printTriangle(int n) {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
