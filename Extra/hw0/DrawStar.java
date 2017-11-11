public class DrawStar {
    public static void main(String[] args) {
       drawTri(6);

   }
   
   public static void drawTri(int size){
       int row,column;
       for(row= 1; row<=size; row++){
          for(column =1;column<=row;column++){
             System.out.print("*");
          }
          System.out.println("");
       }      
   }
}
