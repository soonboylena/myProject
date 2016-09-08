package core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by sunb-c on 2016/9/8.
 */
public class SnClass {

    private final UUID classKey = UUID.fromString("SnClass");

    /**
     * Logger for this class
     */
    private static final Logger logger = LogManager.getLogger(SnClass.class.getName());

    private Map<String, PropertyMeta> fieldMeths;

    public SnClass() {
        fieldMeths = new LinkedHashMap<String, PropertyMeta>();
    }

    public SnClass(PropertyMeta... propertyMetas) {
        fieldMeths = new LinkedHashMap<String, PropertyMeta>();
        for (PropertyMeta meta : propertyMetas) {
            fieldMeths.put(meta.getPropertyName(), meta);
        }
    }

    public SnObject createObject() {
        SnObject object = new SnObject(fieldMeths.size());
        if (fieldMeths != null) {
            for (Map.Entry<String, PropertyMeta> entry : fieldMeths.entrySet()) {
                object.put(entry.getKey(), entry.getValue().getInitValue());
            }
        }
        object.setSnClass(this);
        return object;
    }

    public String getClassKey() {
        return classKey.toString();
    }
}
