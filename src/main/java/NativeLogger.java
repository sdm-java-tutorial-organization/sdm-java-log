package main.java;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NativeLogger {

    private final static Logger LOG = Logger.getGlobal();

    public static void main(String[] args) {
        LOG.setLevel(Level.INFO);
        LOG.severe("severe Log");
        LOG.warning("warning Log");
        LOG.info("info Log");
    }

}
