public class Task7 {

	private boolean isSafe(int i, int j, int m, int n, boolean visited[][]) {
		return i >= 0 && i < m && j >= 0 && j < n && !visited[i][j];
	}

	private void traverse(boolean visited[][], int[][] grid, int i, int j, int m, int n, int curMaxPath, int steps) {
		if (steps > 16)
			return;

		if (i == m - 1 && j == n - 1 && steps <= 16 && curMaxPath > maxPath) {
			maxPath = curMaxPath;
			return;
		}

		if (isSafe(i + 1, j, m, n, visited)) {
			visited[i + 1][j] = true;
			traverse(visited, grid, i + 1, j, m, n, curMaxPath + grid[i + 1][j], steps + 1);
			visited[i + 1][j] = false;
		}
		if (isSafe(i - 1, j, m, n, visited)) {
			visited[i - 1][j] = true;
			traverse(visited, grid, i - 1, j, m, n, curMaxPath + grid[i - 1][j], steps + 1);
			visited[i - 1][j] = false;
		}
		if (isSafe(i, j + 1, m, n, visited)) {
			visited[i][j + 1] = true;
			traverse(visited, grid, i, j + 1, m, n, curMaxPath + grid[i][j + 1], steps + 1);
			visited[i][j + 1] = false;
		}
		if (isSafe(i, j - 1, m, n, visited)) {
			visited[i][j - 1] = true;
			traverse(visited, grid, i, j - 1, m, n, curMaxPath + grid[i][j - 1], steps + 1);
			visited[i][j - 1] = false;
		}
	}

	private static int maxPath = 0;

	public static void main(String[] args) {
		Task7 robot = new Task7();
		int m = 6, n = 6;
		int[][] grid = { { 0, 0, 0, 7, 3, 0 }, { 0, 6, 0, 0, 0, 10 }, { 3, 0, 3, 0, 4, 0 }, { 0, 2, 0, 4, 0, 1 },
				{ 9, 0, 0, 0, 1, 0 }, { 6, 0, 5, 0, 0, 0 } };
		boolean visited[][] = new boolean[6][6];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				visited[i][j] = false;
		}
		robot.traverse(visited, grid, 0, 0, m, n, 0, 0);
		System.out.println(maxPath);
	}
}
