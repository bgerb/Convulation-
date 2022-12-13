
import java.util.*;
public class Main {
    // This class contains a method that performs convolution on two input arrays
    public class Convolution {

        // This method performs convolution on two input arrays and returns the result as a new array
        public static double[] convolve(double[] x, double[] h) {
            int xLen = x.length; // get the length of the first input array
            int hLen = h.length; // get the length of the second input array
            double[] y = new double[xLen + hLen - 1]; // create a new array to store the convolution result

            // loop through each element in the new array
            for (int n = 0; n < y.length; n++) {
                // loop through each element in the second input array
                for (int k = 0; k < hLen; k++) {
                    // if the current element in the second input array is within the bounds of the first input array,
                    // multiply the elements at the corresponding positions and add the result to the current element in the new array
                    if (n - k >= 0 && n - k < xLen) {
                        y[n] += x[n - k] * h[k];
                    }
                }
            }

            return y; // return the convolution result
        }

        }

    public static void main(String[] args) {
                double[] x = {1, 2, 3, 4};
                double[] h = {1, 2, 1};
                double[] y = Convolution.convolve(x, h);

                System.out.println("x = " + Arrays.toString(x));
                System.out.println("h = " + Arrays.toString(h));
                System.out.println("y = " + Arrays.toString(y));
            }
        }

