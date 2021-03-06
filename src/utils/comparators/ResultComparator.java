package utils.comparators;

import domain.dto_models.Result;
import java.util.Collections;
import java.util.Comparator;

public class ResultComparator implements Comparator<Result> {
    @Override
    public int compare(Result o1, Result o2) {
        return Double.compare(o1.getDoubleValue(), o2.getDoubleValue());
    }

    @Override
    public Comparator<Result> reversed() {
        return Collections.reverseOrder(this);
    }
}
