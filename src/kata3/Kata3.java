package kata3;

public class Kata3 {

    public static void main(String[] args) {
          Histogram <String> histogram = new Histogram<String>();
          histogram.increment("ulpgc.es");
          histogram.increment("ulpgc.es");
          histogram.increment("dis.ulpgc.es");
          histogram.increment("eii.ulpgc.es");
          histogram.increment("dis.ulpgc.es");
          histogram.increment("gmail.com");
          histogram.increment("eii.ulpgc.es");
          histogram.increment("eii.ulpgc.es");
          histogram.increment("hotmail.com");
          histogram.increment("dis.ulpgc.es");
          histogram.increment("hotmail.com");
          histogram.increment("dis.ulpgc.es");
          
          HistogramDisplay histogramdisplay = new HistogramDisplay(histogram, "Histogram Display");
          histogramdisplay.execute();
    }
    
}
