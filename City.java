import java.util.HashMap;

public class City extends CityAbstract {

    /** コンストラクタ */
    City(String name, double ido, double keido) {
        super(name, ido, keido);
    }

    /**
     * 都市の情報を取得
     * 
     * @return HashMap<String, CityAbstract>
     */
    public HashMap<String, CityAbstract> getCity() {
        HashMap<String, CityAbstract> cityMap = new HashMap<>();
        cityMap.put(super.getCityName(), this);
        return cityMap;
    }

}
