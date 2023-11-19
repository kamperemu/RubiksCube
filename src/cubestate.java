import java.util.Objects;

public class cubestate extends Cubot{
    private cubestate edgeR;
    private cubestate edgeL;
    private cubestate edgeF;
    private cubestate edgeB;
    private cubestate edgeU;
    private cubestate edgeD;
    private cubestate edgeRI;
    private cubestate edgeLI;
    private cubestate edgeFI;
    private cubestate edgeBI;
    private cubestate edgeUI;
    private cubestate edgeDI;

    public cubestate(){
        super(false);
        Main.universalCubeStates.add(this);
        tweleveMoveStates();
    }

    public cubestate(String[] arr) {
        super(arr);
        Main.universalCubeStates.add(this);
        tweleveMoveStates();
    }

    public cubestate(Cubot cube) {
        super(cube.cubeToArr());
        Main.universalCubeStates.add(this);
        tweleveMoveStates();
    }

    public void tweleveMoveStates() {
        newState("R");
        newState("L");
        newState("F");
        newState("B");
        newState("U");
        newState("D");
        newState("R'");
        newState("L'");
        newState("F'");
        newState("B'");
        newState("U'");
        newState("D'");
    }

    public void newState(String move) {
        Cubot newCubeState = new Cubot(this.cubeToArr());
        newCubeState.stringAlg(move);
        cubestate existingState = Main.existingCubeState(newCubeState);
        if (existingState == null) {
            existingState = new cubestate(newCubeState.cubeToArr());
        }
        if (move.equals("R")) {
            edgeR = existingState;
        }
        if (move.equals("L")) {
            edgeL = existingState;
        }
        if (move.equals("F")) {
            edgeF = existingState;
        }
        if (move.equals("B")) {
            edgeB = existingState;
        }
        if (move.equals("U")) {
            edgeU = existingState;
        }
        if (move.equals("D")) {
            edgeD = existingState;
        }
        if (move.equals("R'")) {
            edgeRI = existingState;
        }
        if (move.equals("L'")) {
            edgeLI = existingState;
        }
        if (move.equals("F'")) {
            edgeFI = existingState;
        }
        if (move.equals("B'")) {
            edgeBI = existingState;
        }
        if (move.equals("U'")) {
            edgeUI = existingState;
        }
        if (move.equals("D'")) {
            edgeDI = existingState;
        }

    }
}