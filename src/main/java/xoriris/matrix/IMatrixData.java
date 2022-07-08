package xoriris.matrix;

public interface IMatrixData {
    double[][] dice(boolean shuffle);
    double[][] getReals();
    int getNumColumns();
    int getNumRows();
}
