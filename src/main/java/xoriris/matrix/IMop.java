package xoriris.matrix;

public interface IMop {
    double[][] slice(double[][] src,int start,int end);
    double[][] transpose(double[][] src);
    double[][] dice(double[][] src,int start, int end);
    void print(String msg, double[][] src);
}
