public class binarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int binarySearch(int[] list, int key){
        int start =0,stop = list.length-1;
        while (stop>=start){
            int pin = (stop+start)/2;
            if(list[pin]==key){
                return pin;
            }
            else if(list[pin]<key){
                start = pin+1;
            }
            else {
                stop = pin-1;
            }
        }
        return -1;
    }
}
