
public class cubestate {//graph node representing state of a cube
    public cubestate(){//constructor for first node / solved state not to be typically used
        state = "";//REPLACE WITH WHATEVER ENDS UP BEING THE NOTATION FOR SOLVED STATE
    }
    public cubestate(String s, cubestate graph_node){//constructor takes state after move and originating cubestate where move was made
        //insert logic to traverse graph using provided node and check if node requested for creation already exists( possibly does not need to be done here in that case link up the edges accordingly for existing node)
        state = s;
    }
    private String state;//state representation for this node
    cubestate[] moved_states;//all moves possible from the first state ( 6 only (fixed) )

    void setstate(String s){//set state of this node
        state = s;
    }

    String getstate(){//get state of this node
        return state;
    }

    void run(int movement_index){//run/generate graph progression for first move from this node
        //System.out.println("First move from this node");
        cubestate generated_node = new cubestate(this.state, this);// NEEDS LOGIC FOR MOVE APPLICATION SUCH THAT NEW NODE IS DIFFERENT FROM ORIGINAL NODE (MIGHT USE EXISTING LIBRARIES IF INDEPENDENT LOGIC HANDLING TURNS OUT TO BE TOO HARD)
        this.moved_states[movement_index] = generated_node;
        generated_node.moved_states[6-movement_index] = this;// fix logic for reverse move ACTUAL COUNT MAY VARY AND REVERSIBILITY MIGHT NOT BE AS EASILY REVERSIBLE

    }
}