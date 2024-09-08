package com.mrvolty.eventaya.utils;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerUtils {

    private static Logger logger;

    public static void initialize(Plugin plugin) {
        logger = plugin.getLogger();
    }

    public static void logInfo(String message) {
        if (logger != null) {
            logger.log(Level.INFO, message);
        } else {
            Bukkit.getLogger().log(Level.INFO, message);
        }
    }

    public static void logWarning(String message) {
        if (logger != null) {
            logger.log(Level.WARNING, message);
        } else {
            Bukkit.getLogger().log(Level.WARNING, message);
        }
    }

    public static void logSevere(String message) {
        if (logger != null) {
            logger.log(Level.SEVERE, message);
        } else {
            Bukkit.getLogger().log(Level.SEVERE, message);
        }
    }

    public static void logException(String message, Throwable exception) {
        if (logger != null) {
            logger.log(Level.SEVERE, message, exception);
        } else {
            Bukkit.getLogger().log(Level.SEVERE, message, exception);
        }
    }

}
