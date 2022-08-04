package neural.mnist;

/**
 * Interface to load the MNIST data.
 * <p>There is one instance for each sample, ie, one for the training and one for the testing database.</p>
 * @author Ron.Coleman
 */
public interface IMLoader {
    record Normal(double[][] pixels, double[][] labels) {}
    ////////////////
    // TODO: Add a constructor which takes the pixel and label paths.
    ////////////////

    /**
     * Gets the pixel and label data in row-major order from their respective files.
     * @return Data in row-major order.
     */
    public MDigit[] load();

    /**
     * Gets the pixel magic number.
     * @return Magic number
     */
    public int getPixelsMagic();

    /**
     * Gets the label magic number.
     * @return Magic number
     */
    public int getLabelsMagic();

    /**
     * Gets the checksum over the pixels <i>only</i>.
     * @return Checksum
     */
    public long getChecksum();

    /**
     * Normalizes the data.
     * @return Normalized data
     */
    public Normal normalize();
}
