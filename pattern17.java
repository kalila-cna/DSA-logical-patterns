public class pattern17 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        for(int row=0;row<n;row++)
        {
            for(int space=n-1;space>row;space--)
            {
                System.out.print(" ");
            }
            for(int col=0;col<=row;col++)
            {
                System.out.print((char)(65+col));
            }
            if(row!=0){
            for(int rcol=row-1;rcol>=0;rcol--)
            {
                System.out.print((char)(65+rcol));
            }
            }
            System.out.println();
        }
    }
}
