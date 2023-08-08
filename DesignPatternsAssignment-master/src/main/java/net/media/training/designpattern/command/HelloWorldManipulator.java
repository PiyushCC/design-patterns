package net.media.training.designpattern.command;

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.IOException;
// import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 20, 2011
 * Time: 4:55:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldManipulator {
    CreateCommand createCommand;
    UpdateCommand updateCommand;
    DeleteCommand deleteCommand;
    MoveCommand moveCommand;

    public void fixManipulate(final String fileName, final String newPath) {
        int cnt = 0;
        try {
            //create(fileName, "hello world");
            createCommand = new CreateCommand(fileName);
            createCommand.execute();
            cnt = 1;
            //update(fileName, "new hello world");
            updateCommand = new UpdateCommand(fileName);
            updateCommand.execute();
            cnt = 2;
            //move(fileName, newPath);
            moveCommand = new MoveCommand(fileName, newPath);
            moveCommand.execute();
            cnt = 3;
        } catch (Exception e) {
            switch (cnt) {
                case 3:
                    //move(newPath, fileName);
                    moveCommand = new MoveCommand(newPath, fileName);
                    moveCommand.execute();
                case 2:
                    //update(fileName, "hello world");
                    updateCommand = new UpdateCommand(fileName);
                    updateCommand.execute();
                case 1:
                    //delete(fileName);
                    deleteCommand = new DeleteCommand(fileName);
                    deleteCommand.execute();

            }
        }
    }

    public void brokenManipulate(String fileName, String newPath) {
        int cnt = 0;
        try {
            //create(fileName, "hello world");
            createCommand = new CreateCommand(fileName);
            createCommand.execute();
            cnt = 1;
            //update(fileName, "new hello world");
            updateCommand = new UpdateCommand(fileName);
            updateCommand.execute();
            cnt = 2;
            //move(fileName, newPath);
            moveCommand = new MoveCommand(fileName, newPath);
            moveCommand.execute();
            cnt = 3;
            //create(fileName, "hello world");
            createCommand = new CreateCommand(fileName);
            createCommand.execute();
            cnt = 4;
            //create(fileName, "hello world");
            createCommand = new CreateCommand(fileName);
            createCommand.execute();
            cnt = 5;
        } catch (Exception e) {
            switch (cnt) {
                case 5:
                    //delete(fileName);
                    deleteCommand = new DeleteCommand(fileName);
                    deleteCommand.execute();
                case 4:
                    //delete(fileName);
                    deleteCommand = new DeleteCommand(fileName);
                    deleteCommand.execute();
                case 3:
                    //move(newPath, fileName);
                    moveCommand = new MoveCommand(newPath, fileName);
                    moveCommand.execute();
                case 2:
                    //update(fileName, "hello world");
                    updateCommand = new UpdateCommand(fileName);
                    updateCommand.execute();
                case 1:
                    //delete(fileName);
                    deleteCommand = new DeleteCommand(fileName);
                    deleteCommand.execute();

            }
        }


    }

    // private void delete(String fileName) {
    //     File file = new File(fileName);
    //     file.delete();
    // }

    // private void move(String source, String destination) {
    //     File file = new File(source);
    //     if (!file.exists())
    //         throw new RuntimeException("File does not exist");
    //     if (!file.renameTo(new File(destination)))
    //         throw new RuntimeException("Rename failed");
    // }

    // private void update(String fileName, String content) {
    //     File file = new File(fileName);
    //     if (!file.exists())
    //         throw new RuntimeException("File: " + fileName + " does not exist");
    //     try {

    //         PrintWriter writer = new PrintWriter(file);
    //         writer.write(content);
    //         writer.close();
    //     } catch (FileNotFoundException e) {
    //         throw new RuntimeException(e);
    //     } catch (IOException e) {
    //         throw new RuntimeException(e);
    //     }

    // }

    

    // private void create(String fileName, String content) {
    //     File file = new File(fileName);
    //     if (file.exists())
    //         throw new RuntimeException("File already exist");
    //     try {
    //         file.createNewFile();
    //         PrintWriter writer = new PrintWriter(file);
    //         writer.write(content);
    //         writer.close();
    //     } catch (IOException e) {
    //         throw new RuntimeException(e);
    //     }
    // }
}
