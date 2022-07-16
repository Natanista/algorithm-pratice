import java.util.ArrayList;
import java.util.List;

public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueOfVariableAfterPerformingOperations(String[] operations) {
        int result = 0;

        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                result++;
            } else {
                result--;
            }
        }
        return result;
    }
}
