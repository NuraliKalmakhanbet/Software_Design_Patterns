import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result, String format) {
        String baseName = result.getName().substring(0, result.getName().lastIndexOf("."));
        String newFileName = baseName + "." + format;
        return new File(newFileName);
    }
}