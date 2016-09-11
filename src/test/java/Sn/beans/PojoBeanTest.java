package Sn.beans;

import Sn.core.SnClass;
import Sn.core.SnObject;
import junit.framework.TestCase;


/**
 * Created by sunb-c on 2016/9/11.
 */
public class PojoBeanTest extends TestCase {

    public void testBuildClass() throws Exception {

        SnClass pojoClass = PojoBean.buildClass();
        assertEquals(pojoClass.getClassKey(),PojoBean.classKey);

        SnObject pojo = pojoClass.createObject("test1","测试1");
        System.out.println("pojo = " + pojo);
    }
}