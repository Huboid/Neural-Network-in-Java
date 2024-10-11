public class LayerNet {
    //Function to build Layer[]'s within a Layer[]
    public static Layer[] Build(Layer[] layers,int NumNeurons, int inputSize){
        //For position in layers[]
        for(int x = 0; x < layers.length; x++){
            //New Layer with NumNeurons, inputSize configuration
            layers[x] = new Layer(NumNeurons, inputSize);
        }
        return layers;
    }
}
