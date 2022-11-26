
public class Link extends MenuContent {
  private String url;

  public Link(String label, String url) {
    super(label);
    this.url = url;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getItemContent() {
    return "<a href=" + this.getUrl() + ">" + this.getLabel() + "</a>";
  }

}
