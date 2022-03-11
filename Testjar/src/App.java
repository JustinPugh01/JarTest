import co.uk.barclays.DB;
import co.uk.barclays.Item;
import co.uk.barclays.Menu;
import co.uk.barclays.Restaurant;

public class App {
    public static void main(String[] args) throws Exception {
        new DB("jdbc:sqlite:./testjar.sql.db");
        Restaurant restaurant = new Restaurant("Pine tree farm", "http://pinetreefarm.jpg");
        Menu menu = new Menu(1, "Pub Classics");
        Item item = new Item(1, "Ham , Eggs and chips", 8.99);
        restaurant.init();
        menu.init();
        item.init();
    }
}
