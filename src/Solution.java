import java.util.ArrayList;
import java.util.List;

class Solution {
    public String convert(String s, int numRows) {
        List<StringBuilder> rows = new ArrayList<>();
        int i =0;
        int flag = -1;
        StringBuilder res=new StringBuilder();
        if(numRows == 1) return s;
        for(int t = 0;t<numRows;t++) rows.add(new StringBuilder());
        for(char c: s.toCharArray()){
            rows.get(i).append(c);
            if(i == 0 || i == (numRows-1)){
                flag = -flag;
            }
            i += flag;
        }
        for(StringBuilder row: rows){
            res.append(row);
        }
        return res.toString();
    }
}
