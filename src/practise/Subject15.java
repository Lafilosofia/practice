import java.util.HashMap;

/**
 * 在字符串 s 中找出第一个只出现一次的字符。
 * 如果没有，返回一个单空格。 s 只包含小写字母。
 */

//遍历字符串 s ，使用哈希表统计 各字符数量是否 > 1
//再遍历字符串 s ，在哈希表中找到首个数量为1的字，并返回。
public class Subject15 {
    public char firstUniqChar(String s){
        HashMap<Character,Boolean> dic= new HashMap<>();
        char[] sc = s.toCharArray();    //toCharArray() 方法将字符串转换为字符数组。
        for (char c : sc)   dic.put(c,!dic.containsKey(c)); //containsKey()判断是否包含指定的键名
        for (char c : sc){
            if (dic.get(c));    return c;
        }
        return ' ';
    }
}
