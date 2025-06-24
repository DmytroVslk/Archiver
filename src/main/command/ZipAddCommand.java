package main.command;

import main.ConsoleHelper;
import main.ZipFileManager;
import main.exception.PathIsNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipAddCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Додавання нового файлу до архіву.");

            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Введіть повне ім'я файлу для додавання:");
            Path sourcePath = Paths.get(ConsoleHelper.readString());

            zipFileManager.addFile(sourcePath);

            ConsoleHelper.writeMessage("Додавання до архіву завершено.");

        } catch (PathIsNotFoundException e) {
            ConsoleHelper.writeMessage("Файл не було знайдено.");
        }
    }
}
