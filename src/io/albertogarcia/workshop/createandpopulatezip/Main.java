package io.albertogarcia.workshop.createandpopulatezip;

import java.nio.file.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main (String[] args) {
        String[] data = { "Line 1",
                          "Line 2 2",
                          "Line 3 3 3",
                          "Line 4 4 4 4"
        };

        try (FileSystem zipFs = openZip(Paths.get("myData.zip"))) {
            System.out.println("Zip created at " + LocalDateTime.now().toString());
            copyToZip(zipFs, "file1.txt");
            System.out.println("File copied to zip at " + LocalDateTime.now().toString());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getClass().getSimpleName() + ", " + e.getMessage());
        }
    }

    private static FileSystem openZip (Path zipPath) throws IOException, URISyntaxException {
        Map<String, String> providerProperties = new HashMap<>();
        providerProperties.put("create", "true");

        URI zipUri = new URI("jar:file", zipPath.toUri().getPath(), null);
        return FileSystems.newFileSystem(zipUri, providerProperties);
    }

    public static void copyToZip (FileSystem zipFs, String file) throws IOException {
        Path sourceFile = Paths.get(file);
        // Alternatively, the previous method of getting a file's path using the default
        // file system was the solution below:
        // Path sourceFile = FileSystems.getDefault().getPath(file);
        Path destFile = zipFs.getPath("/copied_" + file);
        Files.copy(sourceFile, destFile, StandardCopyOption.REPLACE_EXISTING);
    }

    public static void writeToFileInZip1 (FileSystem zipFs, String[] data) throws IOException {

    }

    public static void writeToFileInZip2 (FileSystem zipFs, String[] data) throws IOException {

    }
}
