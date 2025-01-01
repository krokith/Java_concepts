public class StringRotationCheck {
    public static boolean isRotation(String original, String rotated) {
        //check rotated string shoulnt be null and should be in the same length of original
        if (rotated == null || original == null || original.length() != rotated.length()) {
            return false;
        }
        // Concatenate the original string with itself
        String concatination = original + original;

        return concatination.contains(rotated);
    }

    public static void main(String[] args) {
        String original = "waterbottle";
        String rotated = "ttlewaterbo";
        if(isRotation(original,rotated)) {
            System.out.println(rotated + " is rotation of " + original);
        }else{
                System.out.print(rotated+"is not rotation of "+original);
        }
    }



}
