
/*//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/                                                                                                                      /
/             Darrian Sampson                                                                                          /
/             CSC 285                                                                                                  /
/                                                                                                                      /
/                                                                                                                      /
/             In this Program we take a swing at recursion and how it can be used to loop or for iteration.            /
/              There are two recursive methods, a sort and a search. They will take in an array of ints and call on     /
/              themselves until they meet their stopping condition.                                                    /
/                                                                                                                      /
/              The stopping condition for the selectionSort is if count reaches zero.                                  /
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 */

public class main {
    public static void main(String args[]){

        int count = 0;
        int[] numbers = {5, 25, -78, 14, 23, 103, 33, 54, 48, 92, -18, -21, 111, 15, -94, 31, 68, 79, 83, 52};

        for(int i=0;i<numbers.length;i++){
            System.out.println("List of numbers before sort");
            print(numbers);

            selectionSort(numbers, count);
            System.out.println();

            System.out.println("List of numbers after sort");
            print(numbers);

            System.out.println();
            System.out.println("Binary search for specific number in list");
            binarySearch(92, numbers);
        }


    }

    // Selection Sort
    public static void selectionSort(int numbers[], int count) {
        int currentMax = numbers[0];
        int maxIndex = 0;

        if (count > 0) {
            for (int i = 1; i < count - 1; i++) {
                if (numbers[i] > currentMax) {
                    currentMax = numbers[i];
                    maxIndex = i;
                }
            }

            if (numbers[maxIndex] < numbers[count - 1]) {
                numbers[maxIndex] = numbers[count - 2];
                numbers[count - 2] = currentMax;
            } else {
                numbers[maxIndex] = numbers[count - 1];

                numbers[count - 1] = currentMax;
            }

            selectionSort(numbers, count - 1);
        } else {
            System.out.println("Selection Sort Finished");
            return;
        }
    }

    // Print Function
    public static void print(int[] list){
        for(int i=0; i<=list.length;i++){
            System.out.println();
        }
        System.out.println();
    }


    public static int binarySearch(int x, int[] A){
        return binarySearch2(x,A,0,A.length -1);
    }


    public static int binarySearch2(int x, int[] A, int low, int high){
        if(low > high){
            System.out.println("Number " + x + " is not in the list");
            return -1;
        }

        int mid = (low = high) / 2;
        if (x == A[mid]){
            System.out.println("The number " + x + " was found in position " + mid +  "  of the list");
            return mid;
        } else if (A[mid] < x)
            return mid;
          else
              return binarySearch2(x,A,low, mid -1);
    }




}
