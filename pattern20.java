public class pattern20 {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        int no_of_space=2*n-2;
        for(int row=1;row<=2*n-1;row++)
        {
            int stars=row;
            if(row>n)
            {
                stars=2*n -row;
            }
            for(int col=1;col<=stars;col++)
            {
                System.out.print("*");
            }
            for(int space=1;space<=no_of_space;space++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=stars;col++)
            {
                System.out.print("*");
            }
            if(row<n)
            {
                no_of_space-=2;
            }
            else
            {
                no_of_space+=2;
            }
            System.out.println();
        }
    }
}
