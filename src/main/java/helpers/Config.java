package helpers;

import lombok.SneakyThrows;
import java.util.Properties;
import java.io.FileInputStream;

public class Config {
    //env
    public final static String env = System.getProperty("env", "dev");
    public final static String propertyPath = "src/main/resources/env/%s.properties";
    public final static String propertyPathData = String.format(getProperties("property.path.data"), env);

    //auth
//    private static final String userLogin = getProperties("user.login");
//    private static final String userPassword = getProperties("user.password");

//    public final static String login = System.getProperty("login", userLogin);
//    public final static String password = System.getProperty("password", userPassword);

    //end_point
    public final static String baseUrl = getProperties("base.url");

    //properties_reader
    @SneakyThrows
    public static String getProperties(String propsName) {
        Properties properties = new Properties();
        FileInputStream input = new FileInputStream(String.format(propertyPath, env));
        properties.load(input);
        return properties.getProperty(propsName);
    }
}