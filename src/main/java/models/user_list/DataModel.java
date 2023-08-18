package models.user_list;

import lombok.Data;

@Data
public class DataModel {
    public int id;
    public String email;
    public String first_name;
    public String last_name;
    public String avatar;
}