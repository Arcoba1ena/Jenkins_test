package models.user_list;

import lombok.Data;
import java.util.ArrayList;

@Data
public class RootModel {
    public int page;
    public int per_page;
    public int total;
    public int total_pages;
    public ArrayList<DataModel> data;
    public SupportModel support;
}
