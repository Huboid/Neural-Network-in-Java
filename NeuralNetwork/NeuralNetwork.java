public class NeuralNetwork {
    Layer[] layers;
    //Constructor for Neural Network Objects
    public NeuralNetwork(int numOfLayers, int NumNeurons, int inputSize){
        layers = new Layer[numOfLayers];
        layers = LayerNet.Build(layers, NumNeurons, inputSize);

    }
    //Predict function that returns result in double[]
    public double[] predict(double[] inputs){
        double[] output = inputs;
        //TrueFlow sents data through net
        output = DataFlow.True(layers, output);
        return output;
    }
}
