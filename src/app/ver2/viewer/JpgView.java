package app.ver2.viewer;

import app.ver2.adapter.ImageAdapter;

public class JpgView implements ImageViewer {

    ImageAdapter imageAdapter;

    @Override
    public void view(String imageType, String fileName) {

        if (imageType.equalsIgnoreCase("jpg")) {
            System.out.println("Viewing 'jpg' file: \"" + fileName + "\"");
        }
        else {
            imageAdapter = new ImageAdapter();
            imageAdapter.view(imageType, fileName);
        }
    }
}
