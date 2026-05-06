class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        int[] s1Freq = new int[26];
        int[] winFreq = new int[26];
        for(int i =0;i<s1.length();i++)
        {
            s1Freq[s1.charAt(i)-'a']++;
            winFreq[s2.charAt(i)-'a']++;
        }
        
        int matched = 0;
        for(int i =0;i<26;i++)
        {
            if(s1Freq[i]==winFreq[i])matched++;
        }

        int l =0;
        for(int r = s1.length();r<s2.length();r++)
        {
            if(matched==26)return true;
            
            int idx = s2.charAt(r) - 'a';
            winFreq[idx]++;
            if(winFreq[idx]==s1Freq[idx])matched++; // if new char matches 
            else if(winFreq[idx]==s1Freq[idx]+1)matched--; // prev matched but not anymore (extra char)

            idx = s2.charAt(l) - 'a';
            winFreq[idx]--;
            if(winFreq[idx]==s1Freq[idx])matched++; // if new char matches 
            else if(winFreq[idx]==s1Freq[idx]-1)matched--; // prev matched but not anymore (extra char)

            l++;
        }
        return matched == 26;
    }
}
