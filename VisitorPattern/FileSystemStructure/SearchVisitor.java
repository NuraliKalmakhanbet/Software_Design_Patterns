import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private final String query;
    private final List<FileSystemItem> matchingFiles = new ArrayList<>();

    public SearchVisitor(String query) {
        this.query = query;
    }

    @Override
    public void visit(FileElement file) {
        if (file.getName().contains(query)) {
            matchingFiles.add(file);
        }
    }

    @Override
    public void visit(DirectoryElement directory) {
        if (directory.getName().contains(query)) {
            matchingFiles.add(directory);
        }
    }

    public List<FileSystemItem> getMatchingFiles() {
        return matchingFiles;
    }
}