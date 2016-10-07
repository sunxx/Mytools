/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
         
        while(low<=high){
            int mid = low+( high - low)/2;
            int ret = guess(mid);
            if(ret == 0)
                return mid;
            if(ret == 1)
                low = mid + 1;
            if(ret == -1)
                high = mid - 1;
        }
        return -1;
    }
}