import java.util.ArrayList;

public class Main {
    public static ArrayList<cubestate> universalCubeStates;
    public static cubestate existingCubeState(Cubot cube) {
        for (cubestate cubeIt: universalCubeStates) {
            if (cubeIt.compareTo(cube)) {
                return cubeIt;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        universalCubeStates = new ArrayList<cubestate>();
        cubestate cube = new cubestate();
        System.out.println(cube);
    }
}