public class Main {
    public static void main(String[] args) {
        // Array de exemplo
        int[] nums = {1, 2, 3, 4};
        
        // Criando uma instância da classe Solution
        Solution solution = new Solution();
        
        // Chamando o método runningSum e imprimindo o resultado
        int[] resultado = solution.runningSum(nums);
        System.out.println("Resultado:");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}

class Solution {
    public int[] runningSum(int[] nums) {
        int[] resultado = new int[nums.length];
        int soma = 0;
        for (int i=0; i < nums.length; i++){
            soma += nums[i];
            resultado[i] = soma;
        }
        return resultado;
    }
}

