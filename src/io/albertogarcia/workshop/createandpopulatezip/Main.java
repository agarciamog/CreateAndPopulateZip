package io.albertogarcia.workshop.createandpopulatezip;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;

public class Main {

    public static void main(String[] args) {
        CreateAndPopulateZip obj = new CreateAndPopulateZip("myData.zip");
        try {
            FileSystem zipFs = obj.openZip();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
