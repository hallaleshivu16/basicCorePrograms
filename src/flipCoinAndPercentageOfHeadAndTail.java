import java.util.Scanner;

public class flipCoinAndPercentageOfHeadAndTail {
    public static int heads = 0;
    public static int tails = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of flip coin n: ");
        int n= scan.nextInt();
        for (int i=0;i<n;i++) {
            if (Math.random() < 0.5) {
                System.out.println("heads");
                heads = heads + 1;
            } else {
                System.out.println("tails");
                tails = tails + 1;
            }
        }
        System.out.println("Number of Heads " + heads);
        System.out.println("Number of Tails " + tails );
        System.out.println("Heads percentage :" +(heads/n)*100 + "%");
        System.out.println("Tails percentage :" +(tails/n)*100 + "%");

    }
}
