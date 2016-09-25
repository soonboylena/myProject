package Sn.converter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sunb on 2016/9/25.
 */
public class BaiduDemoTest {

    private BaiduTranslateUtils demo  = new BaiduTranslateUtils();
    @Test
    public void translate() throws Exception {

        String tsd = demo.translate("你好","zh","en");
        assertEquals("hello",tsd.toLowerCase());
        System.out.println(tsd);
    }
}