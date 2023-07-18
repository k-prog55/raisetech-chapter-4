import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //リストを作成
        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
        //yを含む要素を取り出す（branchの変更点）
        List<String> result = names.stream().filter(name -> name.contains("y")).toList();
        //iで始まる要素を取り出す
        List<String> result2 = names.stream().filter(name -> name.startsWith("i")).toList();
        //アルファベットの逆順でソートする
        List<String> sortedResult3 = names.stream().sorted(Comparator.reverseOrder()).toList();
        //要素を小文字から大文字へ変換
        List<String> result4 = names.stream().map(name -> name.toUpperCase()).toList();
        //名前大文字のリストを作成
        List<String> upperCaseNames = List.of("GONDA", "IWAMASA", "NAKAZAWA");
        //要素を大文字から小文字へ変換
        List<String> result5 = upperCaseNames.stream().map(name -> name.toLowerCase()).toList();

        //iで始まる要素の個数を調べる
        long count = names.stream().filter(name -> name.startsWith("i")).count();
        //yamadaという要素があるか判定する
        boolean hasYamada = names.stream().anyMatch(name -> name.equals("yamada"));

        System.out.println(result);
        System.out.println(result2);
        System.out.println(sortedResult3);
        System.out.println(result4);
        System.out.println(upperCaseNames);
        System.out.println(result5);
        System.out.println(count);
        System.out.println(hasYamada);

    }
}
