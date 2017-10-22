import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;

public class typeChangeDemo {
    public static void main(String[] args) throws Exception {

        //      数字转字符串
        int x =1;
        String str = x+"";
        System.out.println(str);

        //字符串转数字
        String str1 = "30";
        int x1 = Integer.valueOf(str1);
        System.out.println(x1);

//        字符数组转String
        String[] str2 =new String[5];
        str2[0] = 1+"";
        str2[1] = 5+"";
        String str3= Arrays.toString(str2);
        System.out.println(str3);

//  读取文件中的数字时需要注意的细节,去除空格很重要
        String path = "F:\\springTypeChange\\src\\1.properties";
        InputStream in = new FileInputStream(new File(path));
        Properties prop = new Properties();
        prop.load(in);
        String str4 = prop.getProperty("sum");
        String str5 = str4.trim();
        System.out.println(str5);
        int x5 = Integer.parseInt(str5);
        System.out.println(x5);



    }
}
