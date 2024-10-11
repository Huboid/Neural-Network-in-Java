public class BuildNeuronsInLayer {
    //Function to build neurons into neurons[]
    public static Neuron[] Build(Neuron neurons[], int inputSize){
        //for build neuron into each position of neurons[]
        for(int x = 0; x < neurons.length; x++){
            //Build neurons using neuron constructor
            neurons[x] = new Neuron(inputSize);
        }
        //Return filled neurons[]
        return neurons;
    }
    
}
