package cc.dt.utils;

/**
 * @author: dujian
 * @date: 2020-02-09
 * @description:
 * @version: 1.0
 */
public class ColumnNameUtil {
    static final String UNDER_LINE = "_";

    /***
     * 下划线命名转为驼峰命名
     *
     * @param para
     *        下划线命名的字符串
     */

    public static String underlineToHump(String para) {
        StringBuilder result = new StringBuilder();
        String[] a = para.split(UNDER_LINE);
        for (String s : a) {
            if (!para.contains(UNDER_LINE)) {
                result.append(s);
                continue;
            }
            if (result.length() == 0) {
                result.append(s.toLowerCase());
            } else {
                result.append(s.substring(0, 1).toUpperCase());
                result.append(s.substring(1).toLowerCase());
            }
        }
        return result.toString();
    }


    /***
     * 驼峰命名转为下划线命名
     *
     * @param para
     *        驼峰命名的字符串
     */

    public static String humpToUnderline(String para) {
        StringBuilder sb = new StringBuilder(para);
        int temp = 0;
        //定位

        if (!para.contains(UNDER_LINE)) {
            for (int i = 0; i < para.length(); i++) {
                if (Character.isUpperCase(para.charAt(i))) {
                    sb.insert(i + temp, UNDER_LINE);
                    temp += 1;
                }
            }
        }
        return sb.toString().toUpperCase();
    }
}