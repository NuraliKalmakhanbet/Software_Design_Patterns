public class SizeCalculatorVisitor implements FileSystemVisitor {
    private int totalSize = 0;

    @Override
    public void visit(FileElement file) {
        totalSize += file.getSizeInKb();
    }

    @Override
    public void visit(DirectoryElement directory) {
    }

    public int getTotalSize() {
        return totalSize;
    }
}