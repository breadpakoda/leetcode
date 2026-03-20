/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class P1095 {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        return findPeak(mountainArr, target);
    }

    static int findPeak(MountainArray mountainArr, int target) {
        int beg = 0;
        int end = mountainArr.length() - 1;

        // find peak
        while (beg < end) {
            int mid = beg + (end - beg) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                beg = mid + 1;
            } else {
                end = mid;
            }
        }

        // search in ascending part
        int result = find(mountainArr, target, 0, beg, true);

        if (result == -1) {
            // search in descending part
            return find(mountainArr, target, beg + 1, mountainArr.length() - 1, false);
        }

        return result;
    }

    static int find(MountainArray arr, int target, int beg, int end, boolean A_or_D) {

        if (A_or_D) { // ascending
            while (beg <= end) {
                int mid = beg + (end - beg) / 2;

                if (target > arr.get(mid)) {
                    beg = mid + 1;
                } else if (target < arr.get(mid)) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        } else { // descending
            while (beg <= end) {
                int mid = beg + (end - beg) / 2;

                if (target < arr.get(mid)) {
                    beg = mid + 1;
                } else if (target > arr.get(mid)) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }

        return -1;
    }
}