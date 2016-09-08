package core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

/**
 * Created by sunb-c on 2016/9/8.
 */
public class SnClassHolder {

    /**
     * Logger for this class
     */
    private static final Logger logger = LogManager.getLogger(SnClassHolder.class.getName());

    private static SnClassHolder instance = new SnClassHolder();

    private SnClassHolder() { }

    private HashMap<String, SnClass> classMap = new HashMap<String, SnClass>(50);

    public static SnClassHolder getInstance() {
        return instance;
    }

    public SnClass regiestClass(PropertyMeta... propertyMetas) {
        SnClass snClass = new SnClass(propertyMetas);
        classMap.put(snClass.getClassKey(), snClass);
        logger.debug("注册一个类：{}", snClass.getClassKey());
        return snClass;
    }

}
