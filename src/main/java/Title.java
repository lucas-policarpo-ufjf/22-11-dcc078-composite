
public class Title extends MenuContent {

  public Title(String label) {
    super(label);
  }

  public String getItemContent() {
    return "<h1>" + this.getLabel().toUpperCase() + "</h1>";
  }

}
