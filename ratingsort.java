import java.util.Comparator;
public class ratingsort implements Comparator<details> {
    @Override
    
    public int compare(details p1, details p2) {
        float dif = p1.getrating() - p2.getrating();
        if (dif > 0) return 1;
        if (dif < 0) return -1;
        return 0; 
    }

}
