/** 都市情報を格納するクラス */
public class CityList {
    private City[] cityArray = { 
        new City("札幌", 43.06417, 141.34694), new City("青森", 40.82444, 140.74),
        new City("東京", 35.689556, 139.691722), new City("横浜", 35.44778, 139.6425),
        new City("京都", 35.02139, 135.75556), };

    public City[] getCityArray() {
        return cityArray;
    }

}
