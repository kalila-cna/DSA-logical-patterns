public class pattern12 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        int no_of_space=2*n-2;
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            for(int space=0;space<no_of_space;space++)
            {
                System.out.print("  ");
            }
            no_of_space-=2;
            for(int col=row;col>=1;col--)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
