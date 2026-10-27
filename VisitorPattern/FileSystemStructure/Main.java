public class Main {
    public static void main(String[] args) {
        DirectoryElement root = new DirectoryElement("root");

        DirectoryElement documents = new DirectoryElement("Documents");
        documents.add(new FileElement("resume.pdf", 512));
        documents.add(new FileElement("budget.xlsx", 1024));

        DirectoryElement music = new DirectoryElement("Music");
        music.add(new FileElement("song.mp3", 4096));

        root.add(documents);
        root.add(music);
        root.add(new FileElement("notes.txt", 128));

        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total size: " + sizeVisitor.getTotalSize() + " KB");

        SearchVisitor searchVisitor = new SearchVisitor(".mp3");
        root.accept(searchVisitor);
        System.out.println("Search results:");
        for (FileSystemItem match : searchVisitor.getMatchingFiles()) {
            System.out.println("Found: " + match.getName());
        }
    }
}