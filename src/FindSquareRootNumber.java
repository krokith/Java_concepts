public class FindSquareRootNumber {
    public static int computeSquareRoot(int x){
        if(x<0){
            throw new IllegalArgumentException("input must be non negative ");
        }
        if (x == 0 || x == 1) {
            return x;
        }
        int start =0; int end = x;
        int result = 0;

        while(start<=end) {
            int mid = start - (end + start) / 2;
            if (mid <= x / mid) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
        }

    public static void main(String[] args) {
        int x = 125;
        System.out.print("square root is "+computeSquareRoot(x));
    }
    }

