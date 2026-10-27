public interface FileSystemVisitor {
    void visit(FileElement file);
    void visit(DirectoryElement directory);
}