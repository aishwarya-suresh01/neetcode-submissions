class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        java.util.HashMap<Character, Integer> freqS = new java.util.HashMap<>();
        java.util.HashMap<Character, Integer> freqT = new java.util.HashMap<>();

        for(int i=0; i<s.length();i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            freqS.put(cs, freqS.getOrDefault(cs,0)+1);
            freqT.put(ct, freqT.getOrDefault(ct,0)+1);
        }
        return freqS.equals(freqT);
    }
}
