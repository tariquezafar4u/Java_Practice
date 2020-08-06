public class Array_Demo {

        public static void main(String args[]) {
            int arr[] = {10,9,8,7,6,5,3,4,0,2,1,3};

            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1 ; j < arr.length; j++) {
                    if (arr[i] + arr[j] != 3) {
                        { continue;}
                    }
                        System.out.println("Value which totals 3 are: " + arr[i]   + " and " + arr[j] );


                }
            }

        }}
