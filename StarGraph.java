//Athira Unnikrishnan, Feb 18,25, We are incrementing values that the user provides into out x value and storing each x value in an array. The y value would then find the sin of x and multiply it to 20. Y values are also stored in a array each time. Everytime we add a value to the array, we would print them out. The number of x and y printed would depend on the value the user gives. The frist value of the array x is also given by the user.
import java.util.Scanner; 
public class StarGraph{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of x values to process: ");
        int N = input.nextInt();
        if(N <= 0){
            System.out.println("The number of x values must be an integer greater than 0.");
            System.exit(0);
        }
        System.out.print("Enter a minimum value for x: ");
        int min = input.nextInt();
        System.out.print("Enter the amount to increment x: ");
        double increment = input.nextDouble();
        if(increment <= 0){
            System.out.println("The increment must be a decimal number greater than 0.");
            System.exit(0);
        }
        System.out.println("\nValues");

        Double[] x = new Double[N];
        Double[] y = new Double[N];
       

        for(int i = 0; i < N; i++){
            if(i == 0){
                x[0] = (double) min;
            } else{
                x[i] = x[i - 1] + increment;
            }           
            y[i] = 20 * Math.abs(Math.sin(x[i]));

            System.out.println("x: " + String.format("%.3f", x[i]) + ", y: " + String.format("%.3f", y[i]));
        }

        input.close();
    }
}
