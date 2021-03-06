import java.io.IOException;

public abstract class Square { // Square objects on the board

    private String name;
    private int index;

    public Square(String name, int index) {

        this.name=name;
        this.index=index;
    }


    public String getName() {

        return name;
    }

    public int getIndex() {

        return index;
    }

    public abstract void Operation(Player player, Board board) throws IOException;
}