import java.lang.Math;

public class CalcDistance {

    /** 極半径 */
    private final static double PR = 6356752.314245;

    /** 赤道半径 */
    private final static double ER = 6378137.000000;

    /** 緯度経度から距離の計算 */
    public static double calculateDistance(double[] points) {

        // ラジアンに変換して格納
        double ido1 = Math.toRadians(points[0]);
        double keido1 = Math.toRadians(points[1]);
        double ido2 = Math.toRadians(points[2]);
        double keido2 = Math.toRadians(points[3]);

        // Dx
        double idoDiff = ido1 - ido2;
        // Dy
        double keidoDiff = keido1 - keido2;

        // 平均緯度P
        double idoAve = (ido1 + ido2) / 2;
        // 離心率分子
        double rishin_bunshi = Math.pow(ER, 2) - Math.pow(PR, 2);
        // 離心率分母
        double rishin_bunbo = Math.pow(ER, 2);
        // 離心率E
        double rishin_ritsu = Math.sqrt(rishin_bunshi / rishin_bunbo);

        // 子午線・卯酉線曲率半径の分母W
        double sigosen_utorisen = Math.sqrt(1 - Math.pow(rishin_ritsu, 2) * Math.pow(Math.sin(idoAve), 2));

        // 子午線曲率半径M
        double sigosenkyoku = (ER * (1 - Math.pow(rishin_ritsu, 2))) / Math.pow(sigosen_utorisen, 3);

        // 卯酉線曲線半径N
        double utori = ER / sigosen_utorisen;

        double distance = Math
                .sqrt(Math.pow((idoDiff * sigosenkyoku), 2) + Math.pow(keidoDiff * utori * Math.cos(idoAve), 2));

        return Math.floor(distance) / 1000;
    }
}
