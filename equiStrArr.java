//check if two string arrays are equivalant
//using string builder

class equiStrArr {
    public boolean areEquivalent(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < arr1.length; i++) {
            sb1.append(arr1[i]);
            sb2.append(arr2[i]);
        }

        return sb1.toString().equals(sb2.toString());
    }
}
