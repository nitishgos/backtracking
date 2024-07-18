public class gridway {
    public static int countgrid(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==n){
            return 0;
        }
        //down 
        int w1=countgrid(i+1,j,n,m);
        //right
        int w2=countgrid(i,j+1,n,m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(countgrid(0, 0, n, m));
    }
}
