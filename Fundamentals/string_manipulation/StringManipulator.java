public class StringManipulator {
    public String trimAndConcat(String str1, String str2){
        str1 = str1.trim();
        str2 = str2.trim();
        return str1.concat(str2);
    }

    public Integer getIndexOrNull(String str, char ch){
        int index = str.indexOf(ch);
        if (index == -1){
            return null;
        }
        return index;
    }

    public Integer getIndexOrNull(String str, String sub){
        int index = str.indexOf(sub);
        if (index == -1){
            return null;
        }
        return index;
    }

    public String concatSubstring(String str1, int start, int end, String str2){
        String sub = str1.substring(start, end);
        return sub.concat(str2);
    }
}