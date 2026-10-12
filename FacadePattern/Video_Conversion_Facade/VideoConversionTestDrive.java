import java.io.File;

public class VideoConversionTestDrive {
    public static void main(String[] args) {
        System.out.println("Starting video conversion process...");
        
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("funny-cats.ogg", "mp4");
        
        System.out.println("Conversion completed successfully!");
        System.out.println("Converted file name: " + mp4Video.getName());
    }
}