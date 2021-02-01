import java.util.Comparator;
public class pricesort implements Comparator<details> {
    @Override
    public int compare(details o1, details o2) {
        return o1.getretail() - o2.getretail();
    }
}
