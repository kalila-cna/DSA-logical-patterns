public class pattern11 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        for(int row=1;row<=n;row++)
        {
            for(int col=row;col>0;col--)
            {
                System.out.print(col%2 + " ");
            }
            System.out.println();
        }
    }
}
