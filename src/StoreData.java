import javax.swing.text.JTextComponent;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class is used for storing results
 * @author MrKors
 */
public class StoreData {
    private int countOperations = 0;
    Map<String, String> storeOperationsMap = new TreeMap<>();

    public int getCountOperations() {
        return countOperations;
    }

    public void setCountOperations() {
        this.countOperations++;
    }

    public void printMap(JTextComponent textComponent, Map<String, String> map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> values : map.entrySet()) {
            stringBuilder.append(values.getValue() + "\n");
        }
        textComponent.setText(stringBuilder.toString());
    }
}
