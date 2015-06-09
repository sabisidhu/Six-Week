package algorithm;


public class Duplicate {
    public static void main(String[] args) {
        int elementData[] = new int[] { 1,8, 2, 3, 3,8,4, 4,8, 5,3, 6, 8, 8 };
        int count = 1;
        int element1;
        int element2;

        for (int i = 0; i < elementData.length - 1; i++) {
            element1 = elementData[i];
            element2 = elementData[count];
            count++;
            if (element1 == element2) {
                System.out.println(element2);
            }
        }
    }
}

