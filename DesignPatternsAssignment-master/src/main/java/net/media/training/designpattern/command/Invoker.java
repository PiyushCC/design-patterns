package net.media.training.designpattern.command;

import java.util.Stack;

public class Invoker {
    public Command command;
    Stack<Command> commandStack;

    public Invoker(Command command) {
        this.command = command;
    }

    public Invoker() {
    }

    public void invoke() {
        commandStack.push(this.command);
        try {
            this.command.execute();
        }
        catch(Exception e) {
            while(!commandStack.isEmpty()) {
                commandStack.pop().undo();
            }
        }
        
    }
}
