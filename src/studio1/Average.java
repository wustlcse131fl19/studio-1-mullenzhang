package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Value for n1?");
        int n2 = ap.nextInt("Value for n2?");
        double z= (n1+n2)/2;
        System.out.println("the average is "+z);


    }
}
