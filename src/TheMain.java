import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * The main begins by reading in
 * all of the puzzles described in a file named jams.txt.
 * It then proceeds to run a brute force solution., In each case, it prints out the solution
 * path that was computed.
 */

public class TheMain {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // read all the puzzles in file.  Only the first few are solvable without additional strategies
        Puzzle[] puzzles = Puzzle.readPuzzlesFromFile("jamsAll.txt");
        //int num_puzzles = puzzles.length;
        int num_puzzles = 40; // Turn to 40 at the end

        boolean doPrint = true;
        boolean doNotPrint = false;
        System.out.println("\n---------------Solutions for first six puzzles using solve method------------- ");
        for (int i = 0; i < 6; i++) {
            puzzles[i].solve(doPrint);
//            puzzles[i].printInitialNode();
        }

        System.out.println("\n---------------Solutions for first six puzzles using aStarSolve method------------- ");
        for (int i = 0; i < 6; i++) {
            puzzles[i].aStarSolve(doPrint);
        }

        System.out.println("\n---------------Example where aStarSolve was more efficient than solve------------- ");
        puzzles[5].aStarSolve(doNotPrint);
        puzzles[5].solve(doNotPrint);


        for (int i = 0; i < num_puzzles; i++){
            puzzles[i].aStarSolve(doNotPrint);
        }
    }
    }


