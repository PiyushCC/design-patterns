package net.media.training.designpattern.command;

public class MoveCommand implements Command{
    String fileName, newPath;

    public MoveCommand(String fileName, String newPath) {
        this.fileName = fileName;
        this.newPath = newPath;
    }


    @Override
    public void execute() {
        MyActions.move(fileName, newPath);
    }


    @Override
    public void undo() {
        MyActions.move(newPath, fileName);
    }
}
