public class DataFlow {
    //Iterates through layers array and forwards input from layer to layer
    public static double[] True(Layer[] layers, double[] output){
        for(Layer layer : layers){
            output = layer.forward(output);
        }
        //Returns results as double[] output
        return output;
    }
}
