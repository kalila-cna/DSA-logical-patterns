public class pattern4 {
    public static void main(String[] args) {
        printTriangle(5);
    }

    static void printTriangle(int n) {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
