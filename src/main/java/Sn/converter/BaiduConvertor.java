package Sn.converter;


import org.apache.commons.lang3.StringUtils;

import java.util.Map;


/**
 * Created by sunb on 2016/9/25.
 */
public class BaiduConvertor implements Translatable{

    private BaiduTranslateUtils utils = new BaiduTranslateUtils();

    public String translateToEn(String word_zh) {

        try {
            return utils.translate(word_zh,"zh","en");
        } catch (Exception e) {
            return "";
        }
    }

    public Map<String, String> translate(String... word_zhs) {


        String p = StringUtils.join(word_zhs);

//        Map<String,String> result = utils.translate(p,"zh","en");

        return null;

    }



}
