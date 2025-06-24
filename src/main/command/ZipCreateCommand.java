package main.command;

import main.ConsoleHelper;
import main.ZipFileManager;
import main.exception.PathIsNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

// Command to create a new archive from a specified file or directory
public class ZipCreateCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try{
            ConsoleHelper.writeMessage("Creating an archive.");

            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Enter the full name of the file or directory to archive:");
            Path sourcePath = Paths.get(ConsoleHelper.readString());
            zipFileManager.createZip(sourcePath);

            ConsoleHelper.writeMessage("Archive created.");
        } catch(PathIsNotFoundException e){
            ConsoleHelper.writeMessage("You have specified an incorrect file or directory name.");
        }
    }
}
