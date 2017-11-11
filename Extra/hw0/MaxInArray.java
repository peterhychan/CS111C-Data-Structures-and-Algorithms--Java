public class MaxInArray {
   public static int max(int[] m) {
      int curr_number = m[0];
      for(int i = 1 ;  i<=m.length-1;i++){
         if (m[i] > curr_number){
            curr_number = m[i];
         }
      }
       return curr_number;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 77, 689};
      System.out.println(max(numbers));
   }
}
