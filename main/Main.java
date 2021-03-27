package main;

// 第2版 第1章 文字列の操作

// chap01
// Stringクラスに備わる文字列調査メソッド
// list01 文字列調査メソッドを利用した例
//public class Main {
//    public static void main(String[] args) {
//        String s1 = "スッキリJava";
//        String s2 = "Java";
//        String s3 = "java";
//        String s4 = "";
//        // public boolean i.equals(Object o)
//        if ( s2.equals(s3) ) {
//            System.out.println("s2とs3は等しい");
//        }
//
//        // public boolean i.equalsIgnoreCase(String s)
//        if ( s2.equalsIgnoreCase(s3) ) {
//            System.out.println("s2とs3はケースを区別しなければ等しい");
//        }
//
//        // public int i.length()
//        System.out.println("s1の長さは"+ s1.length() + "です");
//
//        // public boolean i.isEmpty
//        if ( s4.isEmpty() ) {
//           System.out.println("s1は空文字です");
//        }
//    }
//}


// Stringクラスに備わる文字列検索のメソッド
// list01-02 文字列検索メソッドを利用した例

//public class Main {
//    public static void main(String[] args) {
//
//        String s1 = "Java and JavaScript";
//        // "Java and JavaScript"は、文字の前に縦線を引いてn文字目と数える(半角スペースも数える)
//        // |J|a|v|a| |a|n|d| |J|a|v|a|S|c|r|i|p|t
//        // 0 1 2 3 4 5 6 7 8 9 10..."
//
//        // public boolean i.contains(String s)
//        if ( s1.contains("Java") ) {
//            System.out.println("文字列s1は、Javaを含んでいます");
//        }
//
//        // public boolean i.startsWith(String s)
//        if ( s1.startsWith("Java") ) {
//            System.out.println("文字列s1は、Javaが先頭にあります");
//        }
//
//        // public boolean i.endsWith(String s)
//        if ( s1.endsWith("Java") ) {
//            System.out.println("文字列s1は、Javaが末尾にあります");
//        }
//
//        // public int i.indexOf(int ch)
//        // public int i.indexOf(String s)
//        System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java") + "です");
//
//        // public int i.lastIndexOf(int ch)
//        // public int i.lastIndexOf(String s)
//        System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java") + "です");
//
//    }
//}

import java.util.Locale;

// Stringクラスに備わる文字列切り出しのメソッド
// Stringクラスに備わる文字列変換のメソッド(1.2.4)
// list01-03 文字列切り出しメソッドを利用した例
//public class Main {
//    public static void main(String[] args) {
//
//        String s1 = "Java Programming";
//        // "Java Programming"は、文字の前に縦線を引いてn文字目と数える(半角スペースも数える)
//        //  1 2 3 4 5 6 7 8 9 10...(実際の何文字目か)
//        // |J|a|v|a| |P|r|o|g|r|a|m|m|i|n|g
//        // 0 1 2 3 4 5 6 7 8 9 10...(指定する時のindex)
//
//        // public char c.charAt(int index)
//        System.out.println("文字列s1の4文字目の文字は、" + s1.charAt(3) + " です");
//
//        // public String s.substring(int index)
//        System.out.println("文字列s1の4文字目以降は、" + s1.substring(3) + " です");
//
//        // public String s.substring(int index, int endIndex)
//        System.out.println("文字列s1の4文字目〜7文字目は、" + s1.substring(3, 8) + " です");
//
//        // public String s.toLoweCase()
//        System.out.println(s1.toLowerCase());
//
//        // public Sring s.toUpperCase()
//        System.out.println(s1.toUpperCase());
//
//        // public Sring s.trim()
//        System.out.println(s1.trim());
//
//        // public Sring s.replace("String before", "String after")
//        System.out.println(s1.replace("J", "P"));
//    }
//}

// code01-04 StringBuilderを利用して文字列を1万回連結する
//public class Main {
//    public static void main(String[] args) {
//
//        // StringBuilderインスタンスを生成、内部に連結した文字列を蓄えるバッファを持つ
//        // public StringBuilder append(String s)
//        StringBuilder sb = new StringBuilder();
//
//        // append("文字列")で文字列をStringBuilderインスタンスのバッファに格納していく
////        for (int i = 0; i < 10000; i++) {
////            sb.append("Java\n");
////        }
//
//        // append("文字列")で文字列をStringBuilderインスタンスのバッファに格納していく
//        // メソッドチェーン(自身への参照を返すメソッドを連続して呼び出す手法)
//        // sb.append("黄金の中盤").append("中田").append("中村").append("小野").append("稲本");
//
//        // toString()メソッドでStringBuilderインスタンスのバッファに格納・連結した文字列を取り出す
//        String s = sb.toString();
//        System.out.println(s); // 表示する
//
//        // String、char配列、byte配列の相互変換
//        // Stringインスタンスをchar配列、byte配列に変換
//        String str = "こんにちはJava";
//        char[] data1 = str.toCharArray();
////        byte[] data3 = str.getBytes("utf-8"); // エラー
//        // エラーメッセージ
//        // java: 例外java.io.UnsupportedEncodingExceptionは報告されません。
//        // スローするには、捕捉または宣言する必要があります
//        byte[] data2 = str.getBytes(); // デフォルト文字コードを使用
//        System.out.println(data1); // 表示結果: こんにちはJava
////        System.out.println(data3);
//        System.out.println(data2); // 表示結果: [B@c818063
//
//        // char配列、byte配列をStringインスタンスに変換するには、
//        // new String(data)のようにしてコンストラクタの引数に渡す
//    }
//}
// スレッドを利用する場合は不具合の可能性を念頭に置いて、StringBuffer クラスを使う

// code01-05 正当なプレイヤー名であるかどうかを判定するメソッド
// プレイヤー名の条件:必ず8文字、使える文字はA〜Zと0〜9、最初の文字に数字は使えない
//public class Main {
//    public static void main(String[] args) {
//        boolean isValidPlayerName(String name) {
//            // 文字数が8文字であるかの判定
//            if( name.length() != 8 ) {
//                return false;
//            }
//            char first = name.charAt(0);
//            // 文字列の最初の文字がA〜Zかの判定
//            if( !(first >= 'A' && first <= 'Z') ) {
//                return false;
//            }
//            for (int i = 1; i < 8; i++) {
//                char c = name.charAt(i);
//                if( !( c >= 'A' && c <= 'Z' || (c >= '0' && c <= '9') ) ) {
//                    return false;
//                }
//            }
//            return true;
//        }
//    }
//}

// list01-06 文字列パターンを用いたプレイヤー名のチェック
// Stringクラスのmatchesメソッドを用いて01-05を簡潔に書く
//public class Main {
//
//    boolean isValidPlyaerrName(String name) {
//        // matchesメソッドのパターンマッチングを利用
//        return name.matches("[A-Z][A-Z0-9]{7}");
//    }
//}

// 正規表現の基本文法
// 通常の文字:その文字でなければならない
//String s = "Java";
//s.matches("Java"); // => true
//s.matches("JavaJava"); // => false
//s.matches("java"); // => false

// ピリオド:任意の1文字であればよい
//"Java".matches("J.va"); // => true

// アスタリスク:直前の文字の0回以上の繰り返し
//"Jaaaaava".matches("Ja*va"); // => true
//"あいうxx019".matches(".*"); // => true
//s.matches("Ma.*"); // Maで始まる任意の文字 startsWith("Ma")に相当
//s.matches(".*ful"); // fulで終わる任意の文字 endsWith("ful")に相当

// 波カッコ{}:直前の文字の指定回数の繰り返し
// {n}
// {n,}
// {n, m}
// ?
// +

// 角カッコ[]:いすれかの文字

// 角カッコ内のハイフン[-]:指定範囲のいずれかの文字
//"url".matches("[a-z]{3}"); // => true

// 定義済の文字クラス
// ¥d :[0-9]と同じ
// ¥w :[a-zA-Z_0-9]と同じ
// ¥s :空白文字(スペース、タブ文字、改行文字など)

// ハット^とダラー$:先頭と末尾
// ^j.*p& : 先頭文字がjで、迷子の文字がpの任意の長さの文字列

// list01-07 split()メソッドを使った文字列の分割
//public class Main {
//    public static void main(String[] args) {
//        String s = "abc,def:ghi";
//        String[] words = s.split("[,:]");
//        for (String w : words) {
//            System.out.println(w + "->");
//            // 実行結果
//            // abc->
//            // def->
//            // ghi->
//        }
//    }
//}

// code01-08 replaceAll()メソッドを使った文字列の痴漢
//public class Main {
//    public static void main(String[] args) {
//        String s = "abc,def:ghi";
//        String w = s.replaceAll("[beh]", "X");
//        System.out.println(w + "->"); // 実行結果: aXc,dXf:gXi->
//    }
//}
/* 最初の1つだけを置換するreplaceFirst()もある */
//public class Main {
//    public static void main(String[] args) {
//        String s = "abc,def:ghi";
//        String w = s.replaceFirst("g", "X");
//        System.out.println(w + "->"); // 実行結果: abc,def:Xhi->
//    }
//}

// code01-09 キャラクター状態1人分の表示のためのコード
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "ミナト";
        hero.job = "勇者";
        hero.gold = 100000;
        // 組み立てる文字列の雛形を指定する書式指定文字列と、プレースホルダー(%)に第2引数以降で指定した値を流し込む
        // プレースホルダーの書式: % 修飾 桁 型
        // 修飾 ,:3桁事にカンマをいれる 0:空き領域を0埋め -:左寄せ(数字) +:符号を強制表示
        // 桁 表示桁数を指定する n.m形式で指定した場合、全体n桁、小数点以下m桁での表示となる
        // 型 d:整数 s:文字列 f:小数 b:真偽値
        final String FORMAT = "%8s %6s 所持金%,5d";
        String s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
        System.out.println(s);
        // 上記2行を1行のコードで済ませるにはSystem.out.printf() メソッドを用いる
        // System.out.printf(FORMAT, hero.getName(), hero.getJob(), hero.getGold()); // 実行結果:     ミナト     勇者 所持金  100

        System.out.printf("製品番号%s-%02d", "SJV", 3); // 実行結果: 製品番号SJV-03

        // format()やprintf()メソッドは可変長引数で宣言される
        // public static format(String format, Object... args)
        // 引数リストの型の後ろに...を付けるとその型の引数をいくつでも渡せるが、
        // ひとつのメソッドの宣言にあたり...が使えるのは1回だけ
        // 可変長引数として渡された値は配列として取り出せる
    }
}

// practice01-01
//public class Main {
//    public static void main(String[] args) {
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 100; i++) {
//            sb.append(i + 1).append(",");
//        }
//        String s = sb.toString();
//        String[] a = s.split(",");
//        System.out.println(s);
//    }
//}

// practice01-02
//public class Main {
//
//    String concatPath(String folder, String file) {
//        if ( !folder.endsWith("\\") ) {
//            folder += "\\";
//        }
//        return folder + file;
//    }
////    public static void main(String[] args) {
////
////    }
//
//}

// practice01-03
// 1: .*
// 2: A¥d{1,2}
// 3: U[A-Z]{3}