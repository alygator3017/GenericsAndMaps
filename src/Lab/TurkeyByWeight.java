package Lab;

import java.util.Comparator;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author Alyson
 */
public class TurkeyByWeight implements Comparator<Turkey> {

    @Override
    public int compare(Turkey t, Turkey t1) {
        Turkey a = t;
        Turkey b = t1;

        return new CompareToBuilder()
                .append(a.getWeight(), b.getWeight())
                .toComparison();
    }
    
}
