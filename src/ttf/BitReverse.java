/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ttf;

/**
 *
 * @author skyhawk
 */
public class BitReverse {

    public static int[] bitReverseCopy(int[] a) {
        int n = a.length;
        int[] y = new int[n];
        for (int k = 0; k < n; k++) {
            int kPrime = k;
            int r = 0;
            for (int j = 0; j < Math.log10(n) / Math.log10(2); j++) {
                int b = kPrime & 1;
                r = (r << 1) + b;
                kPrime = kPrime >>> 1;
            }
            y[r] = a[k];
        }
        return y;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = bitReverseCopy(arr);
        for(int num : arr2) {
            System.out.print(num + ",");
        }
        System.out.print("\n");
    }
}
