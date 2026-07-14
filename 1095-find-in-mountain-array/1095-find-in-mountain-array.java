class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = peakElement(mountainArr);

        int firstTry = binarySearch(mountainArr, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }

        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    public int peakElement(MountainArray mountainArr) {

        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public int binarySearch(MountainArray mountainArr, int target, int start, int end) {

        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == mountainArr.get(mid)) {
                return mid;
            }

            if (isAsc) {

                if (target > mountainArr.get(mid)) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            } else {

                if (target < mountainArr.get(mid)) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}