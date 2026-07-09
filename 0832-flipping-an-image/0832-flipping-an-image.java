class Solution {
    public int[][] flipAndInvertImage(int[][] image) { // this function wont change the order of the row but
                                                              // change the elements of row
        for (int i = 0; i < image.length; i++) {
            reverse(image[i]);
            invert(image[i]);
        }
        return image;
    }
    public  void swap(int[] row, int index1, int index2) { // we use sap function to reverse the row elements
        int temp = row[index1];
        row[index1] = row[index2];
        row[index2] = temp;
    }

    public  void reverse(int[] row) { // reverse function
        int start = 0;
        int end = row.length - 1;
        while (start < end) {
            swap(row, start, end);
            start++;
            end--;
        }
    }

    public  void invert(int[] row) { // bit flipping
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 0) {
                row[i] = 1;
            } else {
                row[i] = 0;
            }
        }
    }   
}