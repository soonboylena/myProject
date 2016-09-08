package core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedHashMap;

/**
 * Created by sunb-c on 2016/9/8.
 */
public class SnObject {

    /**
     * Logger for this class
     */
    private static final Logger logger = LogManager.getLogger(SnObject.class.getName());

    private SnClass snClass = null;

    private LinkedHashMap<String, String> fields;

    public SnObject(int size) {
        this.fields = new LinkedHashMap<String, String>(size + 10);
    }

    public SnClass getSnClass() {
        return snClass;
    }

    public void setSnClass(SnClass snClass) {
        this.snClass = snClass;
    }

    public LinkedHashMap<String, String> getFields() {
        return fields;
    }

    public void setFields(LinkedHashMap<String, String> fields) {
        this.fields = fields;
    }

    public void put(String key, String initValue) {
        this.fields.put(key,initValue);
    }
}
