import java.util.*;

class Pair{
    int x,y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public static Pair[] dir = {
        new Pair(0,1),
        new Pair(0,-1),
        new Pair(1,0),
        new Pair(-1,0),
    };
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[][] visited = new int [n][m];
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,0));
        visited[0][0] = 1;
        
        while(!q.isEmpty()){
            Pair now = q.poll();
            
            for (int i=0; i<4; i++){
                int nextX = now.x + dir[i].x;
                int nextY = now.y + dir[i].y;
                if (0<=nextX && nextX<n && 0<=nextY && nextY<m){
                    if (visited[nextX][nextY]==0 && maps[nextX][nextY] == 1){
                        visited[nextX][nextY] = visited[now.x][now.y] + 1;
                        q.add(new Pair(nextX, nextY));
                    
                    }
                }
            }
            
            
        }
        
        
        return visited[n-1][m-1] == 0 ? -1 : visited[n-1][m-1];
    }
}