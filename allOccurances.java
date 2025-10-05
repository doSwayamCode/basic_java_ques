//the function accepts a string 'str' as its argument. The function needs to return the transformed string by replacing all occurances of the character 'a' with the character 'a' with 'b' and all occurances of the character 'b' with the character 'b' with 'a'. 

//Using char array for loop to solve the problem.

//input : abaabbcc
//output : babbaacc
class allOccurances {
    public String transformString(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                chars[i] = 'b';
            } else if (chars[i] == 'b') {
                chars[i] = 'a';
            }
        }
        return new String(chars);
    }
}
