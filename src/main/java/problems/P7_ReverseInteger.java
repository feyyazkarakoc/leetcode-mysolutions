package problems;

public class P7_ReverseInteger {

    public static void main(String[] args) {

        System.out.println(reverse(1534236469));

    }

    public static int reverse(int x){
        String str = String.valueOf(x).replace("-","");
        String reverseStr= "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverseStr += str.charAt(i);

        }

        for (int i = 0; i < reverseStr.length() ; i++) {

            if(!(reverseStr.charAt(i) == '0')){
                reverseStr = reverseStr.substring(i);
              break;
            }
        }


       long reverseX = Long.valueOf(reverseStr);

        if((x < 0 && (-reverseX > Integer.MIN_VALUE))) {
            return (int) -reverseX;
        } else if ((x > 0 && (reverseX < Integer.MAX_VALUE))) {
            return (int) reverseX;
        }

        return 0;
    }

}


