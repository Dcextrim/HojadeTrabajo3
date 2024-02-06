import java.io.FileWriter;
import java.io.IOException;

public class GnomeSort {
    public static void gnomeSort(int[] nums) {
        int index = 0;
        int n = nums.length;

        while (index < n) {
            if (index == 0) {
                index++;
            }
            if (nums[index] >= nums[index - 1]) {
                index++;
            } else {
                int temp = nums[index];
                nums[index] = nums[index - 1];
                nums[index - 1] = temp;
                index--;
            }
        }

        // Escribir los números ordenados en el archivo CSV
        try {
            FileWriter writer = new FileWriter("numerosprueba.csv");
            for (int i = 0; i < nums.length; i++) {
                writer.append(String.valueOf(nums[i]));
                if (i < nums.length - 1) {
                    writer.append(",");
                }
            }
            writer.close();
            System.out.println("Los números ordenados se han guardado en el archivo 'numerosprueba.csv'.");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}
