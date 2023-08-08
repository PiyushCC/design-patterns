package net.media.training.designpattern.command;

public class UpdateCommand implements Command{
    String fileName;

    UpdateCommand(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        MyActions.update(fileName, "new hello world");
    }

	@Override
	public void undo() {
		MyActions.update(fileName, "hello world");
	}


}
