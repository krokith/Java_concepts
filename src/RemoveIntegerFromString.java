public class RemoveIntegerFromString {

        public static void main(String[] args) {
            String input = "data45collection321";
            for(int i=0;i<input.length();i++)
            {
                char c = input.charAt(i);
                if(!(c >='a' &&  c <='z'))
                {
                    System.out.print(c);
                }
            }
        }

}
