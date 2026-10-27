public interface FileSystemItem {
    void accept(FileSystemVisitor visitor);
    String getName();
}