package cn.miaogu.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyUbb {
    /*public static void main(String[] args) {
        String newTxt = "<img src='http://www.zuimc.com/template/zuimc/css/zuimc//userinfo.gif' border=0  align=middle  ><img src='http://www.zuimc.com/static//image/magic/checkonline.small.gif' border=0  align=middle  >";
        String regex = "<img(.*?)src=[\"']?(.*?)[\"']?\\s.*?>";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(newTxt);
        while (matcher.find()) {
            String group0 = matcher.group(0);
            String group1 = matcher.group(2);
            newTxt = replaceAllNo(newTxt,group0, "[img]"+group1+"[/img]");
        }
        System.out.println(newTxt);
    }*/
    public static String htmlToUbb(String txt){
        String newTxt;
        newTxt = replaceAllNo(txt,"<br>", "\n");
        newTxt = replaceAllNo(newTxt,"</br>", "\n");

        newTxt = replaceAllNo(newTxt,"<u>", "[u]");
        newTxt = replaceAllNo(newTxt,"</u>", "[/u]");

        newTxt = replaceAllNo(newTxt,"<i>", "[i]");
        newTxt = replaceAllNo(newTxt,"</i>", "[/i]");

        newTxt = replaceAllNo(newTxt,"<font color=red>", "[red]");
        newTxt = replaceAllNo(newTxt,"</font color=red>", "[/red]");

        newTxt = replaceAllNo(newTxt,"<font color=green>", "[green]");
        newTxt = replaceAllNo(newTxt,"</font color=green>", "[/green]");

        newTxt = replaceAllNo(newTxt,"<font color=blue>", "[blue]");
        newTxt = replaceAllNo(newTxt,"<font color=blue>", "[/blue]");

        newTxt = replaceAllNo(newTxt,"<a>", "[a]");
        newTxt = replaceAllNo(newTxt,"</a>", "[/a]");

        //匹配img
        String regex = "<img(.*?)src=[\"']?(.*?)[\"']?\\s.*?>";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(newTxt);
        while (matcher.find()) {
            String group0 = matcher.group(0);
            String group1 = matcher.group(2);
            newTxt = replaceAllNo(newTxt,group0, "[img]"+group1+"[/img]");
        }

        //居中处理
        String [] a = newTxt.split("\n");
        String nowTxt = "";
        for (int k = 0;k<a.length;k++){
            nowTxt += "[align=center]"+a[k]+"[/align]\n";
        }
        return nowTxt;
    }

    //不区分大小写替换
    public static String replaceAllNo(String source, String oldstring, String newstring){
        Pattern p = Pattern.compile(oldstring, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(source);
        String ret=m.replaceAll(newstring);
        return ret;
    }
}
