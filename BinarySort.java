public class BinarySort {

    /**
     * @param x the key to search for
     * @return if found: index of the key in a, otherwise -1
     */
    public static int binarySearch(Integer[] a, Integer x) {
        
        int low = 0;
        int high = a.length -1;
        int mid; 
        
        while (low<=high) {
            mid = (low+high) / 2;
            System.out.println("mid pointer "+ mid+" pointing to  "+a[mid]);
            if (a[mid] < x) { // x is in second half
                low = mid + 1;
            } else if (a[mid] > x) { // x is in first half
                high = mid -1;
            } else {
                return mid;
            } 
        }
        return -1;
    }

    
    public static void main(String[] args) {
        Integer[] test = {0,5,10,13,15,23,42,217,1024,4929};
        int index = binarySearch(test, 217);
        System.out.println("index is "+index );
    }

	

}
