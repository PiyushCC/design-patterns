package net.media.training.designpattern.composite;

public interface FileObject {
    public int getSize();
    public FileObject getParent();
    public void setParent(Directory directory);
    public void delete();
    public boolean inFile(String name);
    public boolean inDirectory(String name);
}
