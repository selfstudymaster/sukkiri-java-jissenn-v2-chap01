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
public class Main {
    public static void main(String[] args) {

        // StringBuilderインスタンスを生成、内部に連結した文字列を蓄えるバッファを持つ
        // public StringBuilder append(String s)
        StringBuilder sb = new StringBuilder();

        // append("文字列")で文字列をStringBuilderインスタンスのバッファに格納していく
//        for (int i = 0; i < 10000; i++) {
//            sb.append("Java\n");
//        }

        // append("文字列")で文字列をStringBuilderインスタンスのバッファに格納していく
        // メソッドチェーン(自身への参照を返すメソッドを連続して呼び出す手法)
        // sb.append("黄金の中盤").append("中田").append("中村").append("小野").append("稲本");

        // toString()メソッドでStringBuilderインスタンスのバッファに格納・連結した文字列を取り出す
        String s = sb.toString();
        System.out.println(s); // 表示する

        // String、char配列、byte配列の相互変換
        // Stringインスタンスをchar配列、byte配列に変換
        String str = "こんにちはJava";
        char[] data1 = str.toCharArray();
//        byte[] data3 = str.getBytes("utf-8"); // エラー
        // エラーメッセージ
        // java: 例外java.io.UnsupportedEncodingExceptionは報告されません。
        // スローするには、捕捉または宣言する必要があります
        byte[] data2 = str.getBytes(); // デフォルト文字コードを使用
        System.out.println(data1); // 表示結果: こんにちはJava
//        System.out.println(data3);
        System.out.println(data2); // 表示結果: [B@c818063

        // char配列、byte配列をStringインスタンスに変換するには、
        // new String(data)のようにしてコンストラクタの引数に渡す
    }
}
// スレッドを利用する場合は不具合の可能性を念頭に置いて、StringBuffer クラスを使う