class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rowFreq = new HashSet[9];
        HashSet<Character>[] colFreq = new HashSet[9];
        HashSet<Character>[] subFreq = new HashSet[9];

        for(int i =0;i<9;i++)
        {
            rowFreq[i] = new HashSet<>();
            colFreq[i] = new HashSet<>();
            subFreq[i] = new HashSet<>();
        }
        for(int i =0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                char c = board[i][j];
                if(c=='.')continue;
                int subidx = (i/3)*3 + (j/3);
                if(rowFreq[i].contains(c) ||
                    colFreq[j].contains(c) ||
                    subFreq[subidx].contains(c))return false;
                
                rowFreq[i].add(c);
                colFreq[j].add(c);
                subFreq[subidx].add(c);
            }
        }
        return true;
    }
}
