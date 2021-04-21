package ie.tudublin;


public class Main
{
    public void helloProcessing1()
    {
        String[] a = {"MAIN"};
        Processing.core.PApplet.runSketch( a, new ScoreDisplay());
    }

    public static void main(String[] args)
    {
        Main main = new Main();
        main.helloProcessing1();

    }

}
