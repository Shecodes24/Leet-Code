class Anagram {
    public boolean isAnagram(String s, String t)
    {
        String[] word1 = s.split("");
        String[] word2 = t.split("");
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
}
