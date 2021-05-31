package modified.fibonacci;

public class ModFib {

    //method to find the kth term in a modified fibonacci sequence where k>=0
    public static int modFibonacci(int k) {
        //deal with negative input
        //if the input is negative
        if (k < 0) {
            //throws an error to let user know the input is not allowed
            throw new IllegalArgumentException("Cannot have a negative term for Fibonnaci sequence");
        } //base case 1
        //else if k is 0
        else if (k == 0) {
            //return 3
            return 3;
        } //base case 2
        //else if k is 1
        else if (k == 1) {
            //return 5
            return 5;
        } //base case 3
        //else if k is 
        else if (k == 2) {
            //return 8
            return 8;
        }
        //recursive part
        //return the sum of the previous 3 terms of the modified fibonacci sequence
        return modFibonacci(k - 1) + modFibonacci(k - 2) + modFibonacci(k - 3);
    }
}
