package core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by sunb-c on 2016/9/8.
 */
public class SnClass {

    private String classKey;

    /**
     * Logger for this class
     */
    private static final Logger logger = LogManager.getLogger(SnClass.class.getName());


    private Map<String, PropertyMeta> fieldMeths;

    public SnClass() {
        fieldMeths = new LinkedHashMap<String, PropertyMeta>();
    }

    public SnClass(String classKey,PropertyMeta... propertyMetas) {
        this.classKey = classKey;
        fieldMeths = new LinkedHashMap<String, PropertyMeta>();
        for (PropertyMeta meta : propertyMetas) {
            fieldMeths.put(meta.getPropertyName(), meta);
        }
    }

    public SnObject createObject(String keyword,String name,String...property) {
        SnObject object = new SnObject(fieldMeths.size(),keyword, name);
        if (fieldMeths != null) {
            int i = 0;
            for (Map.Entry<String, PropertyMeta> entry : fieldMeths.entrySet()) {
                object.put(entry.getKey(), resolveValue(entry.getValue(),property,i));
            }
        }
        object.setSnClass(this);
        return object;
    }

    private Object resolveValue(PropertyMeta entryValue, Object[] property, int i) {
        if(property == null || property.length <= i){
            return  entryValue.getInitValue();
        } else {
            return property[i];
        }

    }

    public String getClassKey() {
        return classKey;
    }

    //public String getKeyWord() {
    //    return keyWord;
    //}
    //
    //public String getName() {
    //    return name;
    //}
    //
    //public void setName(String name) {
    //    this.name = name;
    //}
    //
    //public String getDescription() {
    //    return description;
    //}
    //
    //public void setDescription(String description) {
    //    this.description = description;
    //}
}
