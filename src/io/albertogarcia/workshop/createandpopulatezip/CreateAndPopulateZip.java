package io.albertogarcia.workshop.createandpopulatezip;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.*;

public class CreateAndPopulateZip {
    private String filePath;

    public CreateAndPopulateZip(String path) {
        if ( path != null) {
            filePath = path;
        }
    }

    public FileSystem openZip () throws IOException, URISyntaxException {

    }

    public void copyToZip (FileSystem zipFs) throws IOException {

    }

    public void writeToFileinZip1 (FileSystem zipFs, String[] data) throws IOException {

    }

    public void writeToFileinZip2 (FileSystem zipFs, String[] data) throws IOException {

    }
}
