public class LinearSort {

    /**
     * @param x the key to search for
     * @return if found: index of the key in a, otherwise -1
     */
    public static int linearSearch(Integer[] a, Integer x) {
        for (int i=0; i < a.length; i++) {
            System.out.println(i+" "+a[i]);
            if (a[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Integer[] test = {0,5,10,13,15,23,42,217,1024,4929};
        int index = linearSearch(test, 217);
        System.out.println("index is "+index );
    }

	

}
