package Sn.converter;

import java.util.Map;

/**
 * Created by sunb on 2016/9/25.
 */
public interface Translatable{


    public String translateToEn(String word_zh);

    public Map<String,String> translate(String... word_zhs);


}
