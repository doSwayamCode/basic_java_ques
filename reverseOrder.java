//the function accepts a string str as its argument. The function needs to reverse the order of the words in  the string.

//input : "the sky is blue"
//output : "blue is sky the"

class reverseOrder {
    public String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
