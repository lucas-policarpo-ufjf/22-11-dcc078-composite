
import java.util.ArrayList;
import java.util.List;

public class Section extends MenuContent {
  private List<MenuContent> items;

  public Section(String label) {
    super(label);
    this.items = new ArrayList<MenuContent>();
  }

  public void addItem(MenuContent item) {
    this.items.add(item);
  }

  public String getItemContent() {
    String resultContent = "<section><h2>" + this.getLabel() + "</h2>";
    resultContent += "<ul>";
    for (MenuContent item : items) {
      resultContent += "<li>" + item.getItemContent() + "</li>";
    }
    resultContent += "</ul></section>";
    return resultContent;
  }
}
