package Sn.beans;

import Sn.core.SnClass;
import Sn.core.SnClassHolder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by sunb-c on 2016/9/11.
 */
public class PojoBean {

    /**
     * Logger for this class
     */
    private static final Logger logger = LogManager.getLogger(PojoBean.class.getName());

    public final static String classKey = PojoBean.class.getName();

    public static SnClass buildClass(){
        SnClass snClass = SnClassHolder.getInstance().registerClass(PojoBean.classKey);
        return snClass;
    }
}
