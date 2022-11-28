/*
 Copyright (c) Ron Coleman

 Permission is hereby granted, free of charge, to any person obtaining
 a copy of this software and associated documentation files (the
 "Software"), to deal in the Software without restriction, including
 without limitation the rights to use, copy, modify, merge, publish,
 distribute, sublicense, and/or sell copies of the Software, and to
 permit persons to whom the Software is furnished to do so, subject to
 the following conditions:

 The above copyright notice and this permission notice shall be
 included in all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package neural.io;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Demonstrates how to read a MNIST-type JPEG file for loading into Encog.
 * @author Ron.Coleman
 * @see <a href="https://www.kaggle.com/datasets/ash2703/handsignimages>hand-sign-images</a>
 */
public class JpegReader {
    public static void main(String[] args) {
        try {
            // Buffered contains the image data.
            BufferedImage img = ImageIO.read(new File("data/1003_A.jpg"));

            // Dimension needed to size the data properly.
            int numRows = img.getHeight();
            int numCols = img.getWidth();

            // Holds the pixels which we expect to be grayscale.
            double[] pixels = new double[numRows*numCols];

            // Image in buffered reader is 2D so we read across rows, row by row.
            for(int y=0; y < numRows; y++) {
                for(int x=0; x < numCols; x++) {
                    // RGB is how pixels are stored
                    int rgb = img.getRGB(x,y);

                    // Separate components to verify this is in fact grayscale
                    int r = (rgb & 0xff0000) >> 16;
                    int g = (rgb & 0x00ff00)>>8;
                    int b = rgb & 0x0000ff;
                    assert r == g && g == b:"expected grayscale not found at ("+x+", "+y+")";

                    // If this is grayscale, all the components are same -- need only one of them.
                    int idx = x + y*numCols;
                    pixels[idx] = b;
                }
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
