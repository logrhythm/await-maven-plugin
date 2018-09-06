package fr.sle.maven.plugins;

import java.net.URL;

/**
 * Plugin configuration POJO for http service
 *
 * @author slemoine
 */
public class HttpConfig implements MojoConnectionConfig {

    private URL url;

    private int statusCode;

    private int priority;

    public URL getUrl() {
        return url;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public Service generateService() {
        return new HttpService(url, statusCode);
    }

}
