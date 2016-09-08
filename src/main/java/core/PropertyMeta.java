package core;

import com.google.common.base.Preconditions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by sunb-c on 2016/9/8.
 */
public class PropertyMeta {

    /**
     * Logger for this class
     */
    private static final Logger logger = LogManager.getLogger(PropertyMeta.class.getName());

    private EnumType type;
    private String initValue;
    private String propertyName;

    public PropertyMeta() {
    }

    public PropertyMeta(EnumType type, String initValue, String propertyName) {
        Preconditions.checkNotNull(type, "type is null!");
        Preconditions.checkNotNull(propertyName, "propertyName is null!");
        this.type = type;
        this.initValue = initValue;
        this.propertyName = propertyName;
    }

    public EnumType getType() {
        return type;
    }


    public void setType(EnumType type) {
        this.type = type;
    }

    public String getInitValue() {
        return initValue;
    }

    public void setInitValue(String initValue) {
        this.initValue = initValue;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
}
