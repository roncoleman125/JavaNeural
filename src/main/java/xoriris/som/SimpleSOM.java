package xoriris.som;

import org.encog.Encog;
import org.encog.ml.data.MLData;
import org.encog.ml.data.MLDataSet;
import org.encog.ml.data.basic.BasicMLData;
import org.encog.ml.data.basic.BasicMLDataSet;
import org.encog.neural.som.SOM;
import org.encog.neural.som.training.basic.BasicTrainSOM;
import org.encog.neural.som.training.basic.neighborhood.NeighborhoodSingle;

/**
 * Implement a simple SOM using Encog.  It learns to recognize two patterns.
 * @author jeff
 *
 */
public class SimpleSOM {

    public static double SOM_INPUT[][] = {
            { -1.0, -1.0, 1.0, 1.0 },
            { 1.0, 1.0, -1.0, -1.0 } };

    public static void main(String args[])
    {
        // create the training set
        MLDataSet training = new BasicMLDataSet(SOM_INPUT,null);

        // Create the neural network.
        SOM network = new SOM(4,2);
        network.reset();

        BasicTrainSOM train = new BasicTrainSOM(
                network,
                0.7,
                training,
                new NeighborhoodSingle());

        int iteration = 0;

        for(iteration = 0;iteration<=10;iteration++)
        {
            train.iteration();
            System.out.println("Iteration: " + iteration + ", Error:" + train.getError());
        }

        MLData data1 = new BasicMLData(SOM_INPUT[0]);
        MLData data2 = new BasicMLData(SOM_INPUT[1]);
        System.out.println("Pattern 1 winner: " + network.classify(data1));
        System.out.println("Pattern 2 winner: " + network.classify(data2));
        Encog.getInstance().shutdown();
    }
}
