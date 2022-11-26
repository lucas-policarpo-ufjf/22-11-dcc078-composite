
import java.util.List;

public class Menu {
  private List<MenuContent> items;

  public void setItems(List<MenuContent> items) {
    this.items = items;
  }

  public String getContent() {
    if (this.items == null) {
      throw new NullPointerException("Menu vázio!");
    }

    String menuStr = "<ul>";
    for (MenuContent item : this.items) {
      menuStr += "<li>" + item.getItemContent() + "</li>";
    }
    menuStr += "</ul>";

    return menuStr;
  }
}
