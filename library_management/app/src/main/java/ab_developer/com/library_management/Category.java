package ab_developer.com.library_management;

public class Category {
    String cat_id;

    public String getCat_id() {
        return cat_id;
    }

    public void setCat_id(String cat_id) {
        this.cat_id = cat_id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    String cat_name;
    @Override
    public String toString() {
        return getCat_name();
    }
}
