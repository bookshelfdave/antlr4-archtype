package org.metadave.app;
import org.junit.Test;

public class AppTest {

    @Test
    public void someTest() throws Throwable {
      System.out.println("Test!");
    }

    public static String loadResource(String name) throws Exception {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource(name);
        File f = new File(url.getPath());
        return org.apache.commons.io.FileUtils.readFileToString(f, "UTF-8");
    }

}

