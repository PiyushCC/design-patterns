package net.media.training.designpattern.composite;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class Directory implements FileObject{
    private final String name;
    //private final List<File> files;
    //private final List<Directory> directories;
    private final List<FileObject> subFileObjects;
    private Directory parent;

    public String getName() {
        return name;
    }

    public Directory(String name, List<FileObject> subFileObjects) {
        this.name = name;
        this.subFileObjects = subFileObjects;

        for (FileObject fileObject : subFileObjects) {
            fileObject.setParent(this);
        }
    }

    public int getSize(Directory directory) {
        int sum = 0;

        for(FileObject fileObject: directory.getSubFileObjects()) {
            sum += fileObject.getSize();
        }

        return sum;
    }

    public int getSize() {
        return getSize(this);
    }

    public void setParent(Directory directory) {
        this.parent = directory;
    }

    public void delete(Directory directoryToDelete) {
        for (FileObject fileObject : directoryToDelete.getSubFileObjects()) {
            fileObject.delete();
        }

        directoryToDelete.getParent().removeEntry(directoryToDelete);
    }

    public void delete() {
        delete(this);
    }

    public void removeEntry(FileObject fileObject) {
        subFileObjects.remove(fileObject);
    }

    public void add(FileObject fileObject) {
        subFileObjects.add(fileObject);
    }
    

    private boolean fileExists(String name, Directory directoryToSearch) {
        for (FileObject fileObject : directoryToSearch.getSubFileObjects()) {
            if(fileObject.inFile(name))
                return true;
        }
        return false;
    }

    public boolean fileExists(String name) {
        return fileExists(name, this);
    }

    public boolean directoryExists(String name) {
        return directoryExists(name, this);
    }

    private boolean directoryExists(String name, Directory directoryToSearch) {
        for (FileObject fileObject : directoryToSearch.getSubFileObjects()) {
            if(fileObject.inDirectory(name))
                return true;
        }
        return false;
    }

    public List<FileObject> getSubFileObjects() {
        return subFileObjects;
    }

    public Directory getParent() {
        return parent;
    }

    @Override
    public boolean inFile(String name) {
        return fileExists(name, this);
    }

    @Override
    public boolean inDirectory(String name) {
        return this.getName()==name ? true : directoryExists(name, this);
    }

}
