package neural.mnist;

/**
 * Container of MNIST digits
 * @param no Digit number in the database
 * @param pixels 8-bit pixels
 * @param label Corresponding label
 * @author Ron.Coleman
 */
public record MDigit(int no, double[] pixels, int label) {}
