public class Movie {
    String mName;
    String hero;
    float budget;
    float gst = 0.18f;

    public void getData(String mName, String hero, float budget){
        this.budget = budget;
        this.mName = mName;
        this.hero = hero;
    }

    public float GST(){
        return (gst * budget);
    }
}
