public class NeuronPotential {
    //Function to structure the math going on
    public static double[] Activate(double[] outputs, Neuron[] neurons, double[] inputs){
        //for position in outputs[]
        for(int x = 0; x < outputs.length; x++){
            //activate respective neuron and pass inputs
            outputs[x] = neurons[x].activate(inputs);
        }
        //return output[]
        return outputs; 
    }
}
