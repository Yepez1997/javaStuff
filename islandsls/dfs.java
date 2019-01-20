class dfs {
    public static void main(String[] args) {
        Character grid[][] = {
            {'1','0','1','0'},
            {'1','0','1','0'},
            {'1','1','1','0'},
        };
        int numIslands = islands(grid);
        System.out.println(numIslands);
    }

    // want to mark nodes as we see them 
    // depth first -> goes deeper and deeper 
    // whereas bfs goes 
    public static void dfsSearch(Character grid[][], int r , int c) {
        // want to test conditions here 
        int rowSize = grid.length;
        int colSize =  grid[0].length;
        
        if (r >= rowSize || c >= colSize || r < 0 || c < 0 || grid[r][c] == '0'){
            return;
        }
        grid[r][c] = '0'; 
        dfsSearch(grid, r - 1, c);
        dfsSearch(grid, r + 1, c);
        dfsSearch(grid, r, c - 1);
        dfsSearch(grid, r, c + 1);

    }
    // has to take in an input vector 
    public static int islands(Character grid[][]) {
        int rows =  grid.length;
        int cols = grid[0].length;
        int islands = 0; 
        for (int r = 0; r < rows; ++r) {
            for (int c = 0; c < cols; ++c) {
                if (grid[r][c] == '1') {
                    dfsSearch(grid, r,c);  
                    islands++;
                }
            }
        }
        return islands;
    }
}