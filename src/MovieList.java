public class MovieList {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        Movie m2 = new Movie();

        m1.getData("RRR","prabas",400);
        m2.getData("Avengers","RDJ",1560);

        System.out.println("Gst for movie " + m1.mName + " is " +m1.GST());
        System.out.println("Gst for movie " + m2.mName + " is " +m2.GST());
    }
}
