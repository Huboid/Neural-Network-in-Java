public class Neuron {
    //Neuron object attributes
    double[] weights;
    double bias; 
    //Constructor for Neuron Objects
    public Neuron(int inputSize){
        //Initializes Array length
        weights = new double[inputSize];
        //Initializing Weights (randomly)
        weights = Weights.WeightsConfiguration(weights);
        //Initializin Bias (randomly)
        bias = Bias.BiasConfiguration(inputSize);
    }


    //Method to apply sigmoid function to given input value
    private double sigmoid(double x){
        return 1/ (1 + Math.exp(-x));
    }

    //Method to apply weights to inputs 
    public double activate(double[] inputs){
        double sum = 0.0;
        for(int x = 0; x < inputs.length -1; x++){
            sum += weights[x] * inputs[x];
        }
        //Adding bias
        return sigmoid(sum + bias);
    }
}