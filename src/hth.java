public class hth {
    public static void main(String[] args) {
        public boolean commonEnd(int[] a, int[] b) {
            int aLength = a.length;
            int bLength = b.length;
            return (aLength >= 1 && bLength >= 1) && (a[0] == b[0] || a[aLength-1] == b[bLength-1]);
        }

    }
}
