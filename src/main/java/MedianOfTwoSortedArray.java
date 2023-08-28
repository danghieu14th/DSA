public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length ==0 && nums2.length ==0){
            return 0;
        }

        if(nums1.length ==0 ){
            int n = nums2.length;
            return nums2[(n - 1) / 2] * 0.5 + nums2[n / 2] * 0.5;
        }

        if(nums2.length ==0){
            int n = nums1.length;
            return nums1[(n - 1) / 2] * 0.5 + nums1[n / 2] * 0.5;
        }
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int halfSize = (nums1.length + nums2.length) / 2;
        int l = 0;
        int r = nums1.length - 1;
        while (true) {
            int mid = (l + r) / 2;
            int j = halfSize - mid - 2;
            int num1Left = mid >= 0 ? nums1[mid] : Integer.MIN_VALUE;
            int num1Right = mid + 1 < nums1.length ? nums1[mid + 1] : Integer.MAX_VALUE;
            int num2Left = j >= 0 ? nums2[j] : Integer.MIN_VALUE;
            int num2Right = j + 1 < nums2.length ? nums2[j + 1] : Integer.MAX_VALUE;

            if (num1Left <= num2Right && num2Left <= num1Right) {
                if ((nums1.length + nums2.length) % 2 == 0) {
                    return (Math.max(num1Left, num2Left) + Math.min(num1Right, num2Right)) / 2.0;
                } else {
                    return Math.min(num1Right, num2Right);
                }
            } else if (num1Left > num2Right) {
                r = r - 1;
            } else {
                l = l + 1;
            }
        }
    }
}
