package app.ver2;


import app.ver2.viewer.JpgView;

public class Main {

    public static void main(String[] args) {

        JpgView jpgViewer = new JpgView();

        jpgViewer.view("jpg", "London.jpg");
        jpgViewer.view("jpg", "Kiev.jpg");
        jpgViewer.view("png", "My foto.png");
        jpgViewer.view("gif", "Flying bird.gif");
        jpgViewer.view("bmp", "Pets.bmp");
        jpgViewer.view("txt", "Cats.txt");
    }

}
