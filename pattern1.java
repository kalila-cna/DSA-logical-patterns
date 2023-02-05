class pattern {
    public static void main(String[] args) {
        printSquare(5);
    }

    static void printSquare(int n) {
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}