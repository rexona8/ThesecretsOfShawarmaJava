package firstPoint;

public class SchemePoints {
    public static void main (String[] args) {
        // int [][]arr = new int[5][5];
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         arr[i][j] = (int) (Math.random() * 100);
        //         if (arr[i][j] < 10){
        //             arr[i][j] = (int) (Math.random() * 100);
        //         }
        //     }
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.printf("%d ", arr[i][j]);
        //     }
        //     System.out.println();
        // }

        int []arr = new int[]{1,2,0,1,1,1,0,2,2,2,2};
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1])
            {
                // Если текущий элемент равен предыдущему, увеличиваем длину последовательности
                count++;
            }
            else {
            // Если последовательность прерывается, обновляем максимальную длину
                if (count > maxCount) {
                    maxCount = count;
                }
            // Сбрасываем текущую длину последовательности
            count = 1;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.printf("Максимальное число подряд идущих чисел будет равно %d", maxCount);
    }
}
