public class QuickSort{
  
  public static String[] sort(String[] array) {
      // * * * * * * * *
      // Your Code Here
      // * * * * * * * *
    return quickSort(array, 0, array.length - 1);
  }
  public static String[] quickSort(String[] arr, int beginning, int end) {
    if(beginning >= end){
      return arr;
    }
    int s = getIndex(arr, beginning, end);
    quickSort(arr, beginning, s - 1);
    quickSort(arr, s + 1, end);
    return arr;
  }
  public static int getIndex(String[] arr, int beginning, int end){
    int middle = (beginning + end)/2;
    int index = (end);
    int s = beginning;
    if(arr[middle].compareTo(arr[beginning]) < 0) {
      swap(arr, beginning, middle);
    }
    else if(arr[end].compareTo(arr[beginning]) < 0) {
      swap(arr, beginning, end);
    }
    else if (arr[middle].compareTo(arr[end]) < 0) {
      swap(arr, end, middle);
    }
    while(index > s){
      if (arr[s].compareTo(arr[index]) > 0) {
        String t = arr[index];
        arr[index] = arr[s];
        index--;
        arr[s] = arr[index];
        arr[index] = t;
      }
      else{
        s++;
      }
    }
    return index;
    }
    public static void swap(String[] arr, int x, int y){
    String t = arr[x];
    arr[x] = arr[y];
    arr[y] = t;
  }
  }
