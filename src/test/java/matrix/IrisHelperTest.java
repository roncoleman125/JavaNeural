package matrix;

/*
 * Copyright (c) Ron Coleman
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
import neural.util.IrisHelper;
import org.junit.Test;
import java.util.stream.IntStream;

/**
 * Tests iris helper.
 * @author Ron.Coleman
 */
public class IrisHelperTest {
    @Test
    public void test() {
        double[][] data = IrisHelper.load("data/iris.csv");
        int numRows = data.length;
        assert(numRows == 150);
        IntStream.range(0,numRows).forEach(rowno -> {
            assert(data[rowno].length == 5);
        });
    }
}
