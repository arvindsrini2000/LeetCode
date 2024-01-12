//Not a great problem.
//Not much skill required - more of hard coded thing.

class Solution {
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<values.length;i++) {
            while(num >= values[i]) {
                num -= values[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }
}

//Even better hard-coding

public static String intToRoman(int num) {
    String M[] = {"", "M", "MM", "MMM"};  //num length limit given is 3999 max
    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}; //100-900
    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}; //10-90
    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}; //1-9
    return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
}
