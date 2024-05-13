ublic class Main {
    public static int[] deleteElement(int[] array, int index) {
  if (index < 0 || index >= array.length) {
    System.out.println("Invalid index.");
    return array;
  }

  int[] newArray = new int[array.length - 1];
  for (int i = 0, j = 0; i < array.length; i++) {
    if (i == index) {
      continue;
    }
    newArray[j++] = array[i];
  }
  return newArray;
}
    public static void main(String[] args) {



int[] arr = {3, 7, 1, 9, 4};
int[] newArr = deleteElement(arr, 2);
System.out.println(Arrays.toString(newArr)); // Output: [3, 7, 9, 4]
    }
}
