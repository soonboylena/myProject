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

    private LinkedHashMap<String, Object> fields;

    private String keyWord;

    private String name;


    public SnObject(int size, String keyword, String name) {
        this.fields = new LinkedHashMap<String, Object>(size + 10);
        this.keyWord = keyword;
        this.name = name;
    }

    public SnClass getSnClass() {
        return snClass;
    }

    public void setSnClass(SnClass snClass) {
        this.snClass = snClass;
    }

    public LinkedHashMap<String, Object> getFields() {
        return fields;
    }

    public void setFields(LinkedHashMap<String, Object> fields) {
        this.fields = fields;
    }

    public void put(String key, Object initValue) {
        this.fields.put(key,initValue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyWord() {
        return keyWord;
    }
}
