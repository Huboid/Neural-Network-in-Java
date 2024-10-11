public class Layer {
    //Object Attributes
    Neuron[] neurons;

    //Layer Constructor
    public Layer(int NumNeurons, int inputSize){
        //Initializing Neuron[] length
        neurons = new Neuron[NumNeurons];
        //Function to fill positions in neurons[]
        neurons = BuildNeuronsInLayer.Build(neurons, inputSize);
    }

    //Method to forward inputs through neurons into outputs[]
    public double[] forward(double[] inputs){
        double[] outputs = new double[neurons.length];
        outputs = NeuronPotential.Activate(outputs, neurons, inputs);
        return outputs;
    }
}
