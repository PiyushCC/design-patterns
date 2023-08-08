package net.media.training.designpattern.command;

public class CreateCommand implements Command {
    String fileName;

    public CreateCommand(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        MyActions.create(this.fileName, "hello world");
    }

    @Override
    public void undo() {
        MyActions.delete(fileName);
    }
}
