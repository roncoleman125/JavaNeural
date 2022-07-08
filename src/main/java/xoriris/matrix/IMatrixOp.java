package xoriris.matrix;

public interface IMatrixOp {
    double[][] slice(double[][] src,int start,int end);
    double[][] transpose(double[][] src);
    void print(String msg, double[][] src);
}
