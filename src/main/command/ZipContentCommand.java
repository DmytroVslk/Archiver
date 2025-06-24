package main.command;

import main.ConsoleHelper;
import main.FileProperties;
import main.ZipFileManager;

import java.util.List;

public class ZipContentCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Перегляд вмісту архіву.");

        ZipFileManager zipFileManager = getZipFileManager();

        ConsoleHelper.writeMessage("Вміст архіву:");

        List<FileProperties> files = zipFileManager.getFilesList();
        for (FileProperties file : files) {
            ConsoleHelper.writeMessage(file.toString());
        }

        ConsoleHelper.writeMessage("Вміст архіву прочитано.");
    }
}
