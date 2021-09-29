/**
 * Project name(项目名称)：字符串的替换
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/29
 * Time(创建时间)： 17:17
 * Version(版本): 1.0
 * Description(描述)： replaceFirst() 方法
 * replaceFirst() 方法用于将目标字符串中匹配某正则表达式的第一个子字符串替换成新的字符串，其语法形式如下：
 * 字符串.replaceFirst(String regex, String replacement)
 * 其中，regex 表示正则表达式；replacement 表示用于替换的字符串。
 */

public class test2
{
    public static void main(String[] args)
    {
        String words = "hello java，hello php";
        String newStr = words.replaceFirst("hello","你好 ");
        System.out.println(newStr);    // 输出：你好 java,hello php
    }
}
