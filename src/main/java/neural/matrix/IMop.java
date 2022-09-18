package neural.matrix;

/**
 * Matrix operations
 * @author Ron.Coleman
 */
public interface IMop {
    /**
     * Slices a matrix horizontally.
     * @param src Source matrix in row-major order.
     * @param startRow Starting row
     * @param endRow Ending row (exclusive)
     * @return Sliced matrix in row-major order.
     */
    double[][] slice(double[][] src,int startRow,int endRow);

    /**
     * Dices a matrix vertically.
     * @param src Source matrix in row-major order.
     * @param startCol Starting row
     * @param endCol Ending row (exclusive)
     * @return Diced matrix in row-major order.
     */
    double[][] dice(double[][] src,int startCol, int endCol);
    double[][] transpose(double[][] src);
    void print(String msg, double[][] src);
}
