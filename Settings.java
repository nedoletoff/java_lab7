import java.util.HashMap;
import java.util.Iterator;

public class Settings {
    private HashMap<String, Integer> settings;

    public Settings() {
        this.settings = new HashMap<String, Integer>();
    }

    public Settings(Settings other) {
        this.settings = new HashMap<String, Integer>(other.settings);
    }

    public void put(String settingName, int value)
    {
        settings.put(settingName, value);
    }

    public int get(String settingName) {
        try {
            return settings.get(settingName);
        }
        catch (NullPointerException exception) {
            throw new RuntimeException("Setting with this name doesn't exist");
        }
    }

    public void delete(String settingName) {
        settings.remove(settingName);
    }

 /*
    public void loadFromBinaryFile(String filename) {

    }

    public void saveToBinaryFile(String filename) {

    }

    public void loadFromTextFile(String filename) {

    }

    public void saveToTextFile(String filename) {

    }
  */

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (java.util.Map.Entry<String, Integer> stringIntegerEntry : settings.entrySet())
            builder.append(stringIntegerEntry).append("\n");
        return builder.toString();
    }

    public boolean equals(Settings other) {
        return this.settings.equals(other.settings);
    }
}
