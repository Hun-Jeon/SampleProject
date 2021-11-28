package hj.app.com.util;

public class StrUtil
{
    public static boolean isNotEmpty(String str)
    {
        return str != null && str.length() > 0;
    }

    public static boolean isNullOrEmpty(String str)
    {
        return str == null || str.length() == 0;
    }





}
