public class mouse{
    static int n=4;
    public static boolean issafe(int row,int col,int[][]maze){
        return(row>=0 && row<n && col>=0 && col<n && maze[row][col]==1);
    }
    public static boolean solvemazeuntil(int[][]maze,int row,int col,int[][]sol){
        if(row==n-1 && col==n-1){
            sol[row][col]=1;
            return true;
        }
        if(issafe(row, col, maze)){
            sol[row][col]=1;
            //x direction
            if(solvemazeuntil(maze, row, col+1, sol)){
                return true;
            }
            //y direction
            if(solvemazeuntil(maze, row+1, col, sol)){
                return true;
            }
            sol[row][col]=0;
            return false;
        }
        return false;
    }
    public static boolean solvemaze(int[][]maze){
        int sol[][]={{0,0,0,0},
        {0,0,0,0},
        {0,0,0,0},
        {0,0,0,0}
        };
        if(solvemazeuntil(maze,0,0,sol)==false){
            return true;
        }
        printmaze(sol);
        return true;
    }
    public static void printmaze(int[][] sol){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(sol[i][j]+"   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][]maze= {{ 1, 0, 0, 0 },
        { 1, 1, 0, 1 },
        { 0, 1, 0, 0 },
        { 1, 1, 1, 1 }};
        solvemaze(maze);
    }
}