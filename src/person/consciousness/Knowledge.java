package person.consciousness;

public class Knowledge {
    private int id;
    private int level;

    public Knowledge(int level) {
        this.level=level;
        //TODO: Implementation is needed
    }

    public Knowledge(Knowledge knowledge) {
    }

    public int getLevel(){
        return level;
    }
}
