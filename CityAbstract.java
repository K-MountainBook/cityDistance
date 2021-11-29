/**
 * 都市情報を格納するクラスの抽象クラス
 */
abstract class CityAbstract {

    /** 緯度 */
    private double lat;

    /** 経度 */
    private double lon;

    /** 都市名 */
    private String cityName;

    CityAbstract(String name, double ido, double keido) {
        cityName = name;
        lat = ido;
        lon = keido;
    }

    /** 緯度取得 */
    public double getLat() {
        return lat;
    }

    /** 経度取得 */
    public double getLon() {
        return lon;
    }

    /** 名称取得 */
    public String getCityName() {
        return cityName;
    }

}
