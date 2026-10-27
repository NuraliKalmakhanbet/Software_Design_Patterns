public class FileElement implements FileSystemItem {
    private final String name;
    private final int sizeInKb;

    public FileElement(String name, int sizeInKb) {
        this.name = name;
        this.sizeInKb = sizeInKb;
    }

    public int getSizeInKb() {
        return sizeInKb;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}