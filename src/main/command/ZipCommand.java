package main.command;

import main.ConsoleHelper;
import main.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class ZipCommand implements Command {

    // Prompts user for archive path and returns a ZipFileManager instance
    public ZipFileManager getZipFileManager() throws Exception {
        ConsoleHelper.writeMessage("Enter the full path of the archive file:");
        Path zipPath = Paths.get(ConsoleHelper.readString());
        return new ZipFileManager(zipPath);
    }
}