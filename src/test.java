/**
 * Project name(项目名称)：字符串的替换
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/29
 * Time(创建时间)： 17:10
 * Version(版本): 1.0
 * Description(描述)： replace() 方法
 * replace() 方法用于将目标字符串中的指定字符（串）替换成新的字符（串），其语法格式如下：
 * 字符串.replace(String oldChar, String newChar)
 * 其中，oldChar 表示被替换的字符串；newChar 表示用于替换的字符串。replace() 方法会将字符串中所有 oldChar 替换成 newChar。
 */

public class test
{
    public static void main(String[] args)
    {
        String s = "123456789";
        String s1;
        s1 = s.replace('2', '3');
        System.out.println(s1);
        String s2 = "你好，世界";
        String s3;
        s3 = s2.replace("你好", "hello");
        System.out.println(s3);
    }
}
