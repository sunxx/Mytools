class Solution {
public:

    int numTrees(int n){
        vector<int> nums(n+1,0);
        nums[0]=nums[1]=1;
        for(int i=2;i<=n;i++)
            for(int j = 0;j<i;j++){
                nums[i] += nums[j]*nums[i-j-1];
        }
        return nums[n];
    }
};