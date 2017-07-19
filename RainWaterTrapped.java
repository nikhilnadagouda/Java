//Given n non-negative integers representing an elevation map where the width of each bar is 1
// compute how much water it is able to trap after raining.

//Approach: the water trapped on any given tower/elevation is
// min(left tallest tower, right tallest tower) - height of the given tower

//Time Complexity: O(N) : N is length of array
//Space Complexity: O(1)

// Credits & Source: http://www.geeksforgeeks.org/trapping-rain-water/
public class RainWaterTrapped {

    public int getWater(int[] towers){
        int result =0;
        int low =0;
        int high = towers.length-1;
        int leftMax = towers[low];
        int rightMax = towers[high];

        while(low<high){
            if(towers[low]<towers[high]){
                if(leftMax<towers[low]){
                    leftMax = towers[low];
                }else {
                    result+= (leftMax-towers[low]);
                }
                low++;
            }else{
                if (rightMax<towers[high]){
                    rightMax = towers[high];
                }else {
                    result+= (rightMax-towers[high]);
                }
                high--;
            }
        }

        return result;
    }

    public static void main(String[] args){
        RainWaterTrapped rainWaterTrapped = new RainWaterTrapped();
        int[] towers = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(rainWaterTrapped.getWater(towers));
    }
}
