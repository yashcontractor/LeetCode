// import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        //sorts in alphabetical order
        Arrays.sort(sArr);
        Arrays.sort(tArr);


        //now if both arrays contain equal number of letters and the same letters, it will return true.
        return Arrays.equals(sArr, tArr);
    }
}