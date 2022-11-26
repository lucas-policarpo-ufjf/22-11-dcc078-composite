public abstract class MenuContent {
  private String label;

  public MenuContent(String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public abstract String getItemContent();
}
