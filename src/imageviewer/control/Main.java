package imageviewer.control;

import java.io.File;
import imageviewer.model.Image;
import imageviewer.persistence.FileImageLoader;
public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\Descargas\\Nigger");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
    }
}
