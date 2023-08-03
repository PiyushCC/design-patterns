package solid.live.dip;

public class DatabaseWriter implements Writer{
    MyDatabase database;

    public DatabaseWriter(MyDatabase database) {
        this.database = database;
    }

    @Override
    public void write(String str) {

        database.write(str);
    }
}
