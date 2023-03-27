package app.ver2.adapter;

import app.ver2.service.AdvancedImageViewer;
import app.ver2.viewer.ImageViewer;
import app.ver2.service.ViewXnImage;

public class ImageAdapter implements ImageViewer {

    AdvancedImageViewer advancedImageViewer;

    public ImageAdapter() {
        advancedImageViewer = new ViewXnImage();
    }

    @Override
    public void view(String imageType, String fileName) {
        advancedImageViewer.viewXnImage(fileName);
    }
}
