class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] arr = ransomNote.toCharArray();
        int[] count = new int[26];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - 'a']++;
        }

        for (char c : magazine.toCharArray()) {
            count[c - 'a']--;
        }

        for (int c : count) {
            if (c > 0) {
                return false;
            }
        }

        return true;
        
    }
}