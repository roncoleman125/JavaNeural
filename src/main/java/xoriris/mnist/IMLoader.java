package xoriris.mnist;

import java.io.IOException;

/**
 * Interface to load the MNIST data.
 * <p>There is one instance for each sample, ie, one for the training and one for the testing database.</p>
 * @author Ron.Coleman
 */
public interface IMLoader {
    ////////////////
    // TODO: Add a constructor which takes the pixel and label paths.
    ////////////////

    /**
     * Gets the pixel and label data in row-major order.
     * @return Data in row-major order.
     */
    public double[][] load();

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
     * Gets the checksum.
     * @return Checksum
     */
    public long getChecksum();
}
