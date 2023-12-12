class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int n = image[i].length;
            
            // Reverse the row
            for (int j = 0; j < n / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][n - 1 - j];
                image[i][n - 1 - j] = temp;
            }

            // Invert the elements in the reversed row
            for (int j = 0; j < n; j++) {
                image[i][j] = 1 - image[i][j];
            }
        }

        return image;
    }
}
