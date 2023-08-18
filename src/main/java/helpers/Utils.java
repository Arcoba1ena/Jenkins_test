package helpers;
import com.google.gson.Gson;

public class Utils {
    /**
     * Преобразование response в объект класса.
     *
     * @param json       - строка в формате json;
     * @param modelClass - модель класса;
     * @return - возвращается модель указанного класса с данными из response;
     */
    public static <T> T deserialize(String json, Class<T> modelClass) {
        Gson gson = new Gson();
        return gson.fromJson(json, modelClass);
    }

    /**
     * Преобразование объекта в формат JSON.
     *
     * @param modelClass - модель класса;
     * @return - возвращается модель указанного класса в формате json;
     */
    public static String serialize(Object modelClass) {
        Gson gson = new Gson();
        return gson.toJson(modelClass);
    }
}