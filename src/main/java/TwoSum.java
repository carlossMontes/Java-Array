public class TwoSum {
    // Metodo que recorre el arreglo buscando la suma
    public static int[] twoSum(int[] nums, int target) {
        // Recorre el arreglo con el primer numero a sumar
        for (int i = 0; i < nums.length; i++) {
            // Recorre el arreglo con el segundo numero a sumar
            for (int j = i + 1; j < nums.length; j++) {
                // Si la suma de ambos numero es el target, regresa ambos numeros
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        // Lanza una excepción si no encuentra dos números que sumen al target
        throw new IllegalArgumentException("No se encontraron dos números que sumen a " + target);
    }

    public static void main(String[] args) {
        // Programa que busca si la suma de dos numeros dentro del arreglo es igual al
        // target
        // Arreglo de numeros y target
        int[] nums = { 2, 7, 11, 15 };
        int target = 22;

        // Ejecucion del metodo e impresion del resultado
        try {
            int[] result = twoSum(nums, target);
            System.out.println("Índices encontrados: " + result[0] + ", " + result[1]);
            // Lanza excepción si no hay numeros para sumar
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
