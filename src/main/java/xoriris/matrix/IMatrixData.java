package xoriris.matrix;

public interface IMatrixData {
    double[][] dice(boolean shuffle);
    double[][] getObservations();
    int getNumColumns();
    int getNumRows();
}
