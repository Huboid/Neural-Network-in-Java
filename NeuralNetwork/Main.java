public class Main {
    //Function to print double values in double[]
    public static void PrintArray(double[] result){
        for(double x : result){
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        double[] array = {1.5,2.5, 3.5,4.5};
        //Building Neural Network Object
        NeuralNetwork neuralnetwork = new NeuralNetwork(8, 4, 3);
        //Method to utlize neural network for prediction
        double[] result = neuralnetwork.predict(array);
        //Print Function
        PrintArray(result);
    }
}