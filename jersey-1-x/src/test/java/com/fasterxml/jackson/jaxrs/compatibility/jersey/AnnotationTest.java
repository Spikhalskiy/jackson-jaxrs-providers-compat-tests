package com.fasterxml.jackson.jaxrs.compatibility.jersey;

import com.fasterxml.jackson.jaxrs.compatibility.dw.AnnotationTestBase;
import com.sun.jersey.spi.container.servlet.ServletContainer;

import javax.servlet.Servlet;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * This class is a copy-paste from jackson-jaxrs-providers tests code
 */
public class AnnotationTest extends AnnotationTestBase
{
    static {
        Logger log = Logger.getLogger("com.sun.jersey.server.impl.application.DeferredResourceConfig");
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new SimpleFormatter());
        log.addHandler(handler);
    }

    @Override
    protected Class<? extends Servlet> servletContainerClass() { return ServletContainer.class; }
}
