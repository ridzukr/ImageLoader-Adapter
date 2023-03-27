package app.ver2.service;

public class ViewXnImage implements AdvancedImageViewer {

    ImageType imageType;

    @Override
        public void viewXnImage(String fileName) {
        int lengthFileName = fileName.length();
        String typeFile = fileName.substring(lengthFileName - 3, lengthFileName);
        try {
            imageType = ImageType.valueOf(typeFile.toUpperCase());
            System.out.println("Viewing '" + typeFile + "' file: \"" + fileName + "\"");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid \"" + fileName +"\". '" + typeFile + "' format not supported");
        }
    }

}
