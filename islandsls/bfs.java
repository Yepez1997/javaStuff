import java.util.LinkedList;
import java.util.Queue;

class bfs {
    // BFS uses a queue 
    // DFS uses a stack 
    public static void main(String[] args) {
        Character grid[][] = {
            {'1','0','1','0'},
            {'1','0','1','0'},
            {'1','1','1','0'},
        };

    }

    /* Do BFS ->  */    
    public static int bfsSearch(Character grid[][]) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int rz =  grid.length;
        int cz =  grid.length; 
        int islands = 0; 
        for (int r = 0; r < rz; ++r) {
            for (int c = 0; c < cz; ++c) { 
                if (grid[r][c] == '1') {
                    ++islands; 
                    grid[r][c] = '0';
                    Queue<Integer> neighbors = new LinkedList<>();
                    // add this position r, c 
                    neighbors.add(r * rz  + c);
                    while(!neighbors.isEmpty()) {
                        int id = neighbors.remove();
                        // number we get from the numbers add 
                        // translate back to coordinates 
                        int row = id / cz;
                        int col = id % cz;
                        if (row - 1 >= 0 && grid[row - 1][col] == '1') {
                            neighbors.add((row - 1) * cz + col);
                            grid[row - 1][col] = '0';
                        }
                        if (row + 1 < rz && grid[row + 1][col] == '1') {
                            neighbors.add((row + 1) * cz +  col);
                            grid[row + 1][col] = '0';
                        }
                        if (col - 1 >= 0 && grid[row][col - 1] == '1') {
                            neighbors.add(row * cz + (col - 1));
                            grid[row][col - 1] = '0';
                        }
                        if (col + 1 < cz && grid[row][col + 1] == '1') {
                            neighbors.add(row * cz + (col + 1));
                            grid[row][col + 1] = '0';
                        }
                    }
                }
            }
        }


        return islands;
    }
}


// what is r * rz + c 
                    // r is the index of r we are at times rz(len) if at row 1 - > r * rz = 3 + c
                    // (0,1) -> 0 + 1 -> 1  1 / 3 -> 0 = 0, 1 % 3 =  1  
                    // (0,2) -> 0 + 2 -> 2  2 / 3 -> 0 = 0, 2 % 3 =  2 
                    // (0,3) -> 0 + 3 -> 3  3 / 3 -> 1 = 0, 3 % 3 =  0 
                    // (1,0) -> 1 * 3 + 0 -> 3
                    // (1,1) -> 1 * 3 + 1 -> 4
                    // (1,2) -> 1 * 3 + 2 -> 5
                    // (2,1) -> 2 * 3 + 1 -> 7 
                    // this jsut finds a way to get a unique representation of coordinates 