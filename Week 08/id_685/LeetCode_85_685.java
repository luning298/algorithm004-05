/*
 * @lc app=leetcode.cn id=85 lang=java
 *
 * [85] 最大矩形
 */

// @lc code=start

class Solution {
    public int maximalRectangle(char[][] matrix) {
        int max=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    int k=j;
                    for(;k<matrix[0].length;k++){
                        if(matrix[i][k]=='1'){
                            max=Math.max(max,getMaxRec(i,j,k,matrix));
                        }else{
                            break;
                        }
                    }
                }
            }
        }
        return max;
    }

    public int getMaxRec(int i,int j,int k,char[][] matrix){
        int s=k-j+1;
        int r=s;
        for(int i1=i+1;i1<matrix.length;i1++){
            for(int j1=j;j1<=k;j1++){
                if(matrix[i1][j1]=='0'){
                    return r;
                }
            }
            r+=s;
        }
        return r;
    }
}
// @lc code=end

