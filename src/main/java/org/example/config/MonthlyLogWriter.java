package org.example.config;




import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

    public class MonthlyLogWriter {
        private static final String LOG_DIR = "logs/http";
        private static final String LOG_PREFIX = "http-";
        private static final String LOG_SUFFIX = ".log";

        private Path currentLogFile;
        private String currentMonth;

        public MonthlyLogWriter() {
            createLogDirectory();
            updateCurrentLogFile();
        }

        public synchronized void log(String message) {
            checkForMonthChange();

            try {
                Files.write(currentLogFile,
                        (java.time.LocalDateTime.now() + " - " + message + "\n").getBytes(),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.err.println("Failed to write to log file: " + e.getMessage());
            }
        }

        private void checkForMonthChange() {
            String thisMonth = YearMonth.now().toString();
            if (!thisMonth.equals(currentMonth)) {
                updateCurrentLogFile();
            }
        }

        private void updateCurrentLogFile() {
            currentMonth = YearMonth.now().toString();
            currentLogFile = Paths.get(LOG_DIR, LOG_PREFIX + currentMonth + LOG_SUFFIX);
        }

        private void createLogDirectory() {
            try {
                Files.createDirectories(Paths.get(LOG_DIR));
            } catch (IOException e) {
                System.err.println("Failed to create log directory: " + e.getMessage());
            }
        }
    }

