//Configure Weights
public class Weights {
    //Function to randomize weights
    public static double[] WeightsConfiguration(double[] weights){
        for(int x = 0; x < weights.length; x++){
            weights[x]= Math.random();
        }
        //return double[]
        return weights;
    }
}
