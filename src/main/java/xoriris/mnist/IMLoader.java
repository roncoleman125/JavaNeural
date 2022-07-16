package xoriris.mnist;

import java.io.IOException;

/**
 * Interface
 */
public interface IMLoader {
    public MDigit[] getDigits() throws IOException;
    public int getPixelsMagic();
    public int getLabelsMagic();
    public long getChecksum();
}
