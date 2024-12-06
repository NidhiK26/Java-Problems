public class ShortestPath {
      public static float Shortest(String path){
        int x=0, y=0;
        for(int i=0;i<path.length();i++){
            char dir= path.charAt(i);
            if(dir=='E'){
                x++;
            }
            else if(dir=='W'){
                x--;
            }
           else if(dir=='N'){
                y++;
            }
            else{
                y--;
            }
        }
        int Xsqr= x*x;
            int Ysqr= y*y;
            return (float)Math.sqrt(Xsqr+Ysqr); 
       
      }
    public static void main(String[] args) {
        String path="NSE";
        System.out.println(Shortest(path));
    }
    
}
