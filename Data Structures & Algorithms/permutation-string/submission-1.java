class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //true if s2 contains permutation of s1
        if(s1.length()>s2.length())return false;
        int[] s1Freq = new int[26];

        for(char c:s1.toCharArray())
        {
            s1Freq[c-'a']++;
        }

        int[] windowFreq = new int[26];
        for(int i =0;i<s1.length();i++)
        {
            char c = s2.charAt(i);
            windowFreq[c-'a']++;
        }
            if(matches(windowFreq,s1Freq))return true;

        int l = 0;
        for(int r = s1.length();r<s2.length();r++)
        {
            windowFreq[s2.charAt(r) - 'a']++;
            if(r-l+1>s1.length())
            {
                windowFreq[s2.charAt(l) - 'a']--;
                l++;
            }
            if(matches(windowFreq,s1Freq))return true;
        }
        return false;
    }
    public boolean matches(int[]freq1 , int[]freq2)
    {
        for(int i =0;i<freq1.length;i++)
        { 
            if(freq1[i] != freq2[i])return false;
        }
        return true;

    }
}
