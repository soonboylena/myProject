package template;

import Sn.beans.PojoBean;
import Sn.core.SnObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Created by sunb on 2016/9/11.
 */
public class FreemarkerBuilder {

    private static final Logger logger = LogManager.getLogger(FreemarkerBuilder.class.getName());

    public void build(String type, SnObject snObject){

        boolean b = checkType(type,snObject);

        if(!b){
            logger.debug("type和snobject不符。");
        }

    }

    private boolean checkType(String type, SnObject snObject) {

        if(type.equals("pojo") ){
           return snObject.isClass(PojoBean.classKey);
        }
        return false;
    }

}
