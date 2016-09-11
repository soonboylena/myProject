package core

/**
 * Created by sunb on 2016/9/10.
 */
class SnClassHolderTest {

    void testRegiestClass() {
        PropertyMeta<Boolean> pm = new PropertyMeta(EnumType.booelan, false, "required");
        PropertyMeta<String> pm2 = new PropertyMeta(EnumType.string, null, "format");
        PropertyMeta<Integer> pm3 = new PropertyMeta(EnumType.number, 0, "selectOne");
        SnClassHolder.instance.regiestClass(pm);
    }
}
