class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] sayi=new int[2];

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
            if(nums[i]+nums[j]== target){//eğer i ve i'den önceki indis toplamı targete eşitse i ve i-1'i döndür.
                sayi[0]=i;
                sayi[1]=j;
                break;
            }
        }
        }
        return sayi;

    }
}
