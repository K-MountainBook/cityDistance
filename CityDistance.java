import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * CityDistance
 */
public class CityDistance {

    /** 日本国内の主要都市の直線距離を求める */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try {

            CityList citylist = new CityList();
            City[] cityArray = citylist.getCityArray();
            // 都市名と対応する数字を表示する。
            for (int i = 0; i < cityArray.length; i++) {
                System.out.print(i + ")" + cityArray[i].getCityName() + " ");
            }
            // 改行を入れるために空出力
            System.out.println("");
            System.out.print("一つ目の都市を選択してください：");
            int firstCity = scn.nextInt();
            System.out.print("二つ目の都市を選択してください：");
            int secondCity = scn.nextInt();

            // 計算するメソッドを呼び出して戻り値をそのまま標準出力に表示
            System.out.println(cityArray[firstCity].getCityName() + "と" + cityArray[secondCity].getCityName()
                    + "の直線距離はおおよそ"
                    + CalcDistance.calculateDistance(
                            new double[] { cityArray[firstCity].getLat(), cityArray[firstCity].getLon(),
                                    cityArray[secondCity].getLat(), cityArray[secondCity].getLon() })
                    + "kmです。");

        } catch (InputMismatchException e) {
            // 数字以外が入力されたら警告を出して終了。
            e.printStackTrace();
            System.out.println("都市は数字で選択してください。");
            System.exit(1);

        } finally {
            // 最後に標準入力をクローズする
            scn.close();
        }
    }
}