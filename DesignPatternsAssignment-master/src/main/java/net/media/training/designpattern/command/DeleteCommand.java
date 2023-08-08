package net.media.training.designpattern.command;

public class DeleteCommand implements Command{
    String fileName;
    
    public DeleteCommand(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        MyActions.delete(fileName);
    }

    @Override
    public void undo() {
        
    }
    
}
