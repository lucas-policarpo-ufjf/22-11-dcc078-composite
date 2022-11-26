import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class MenuTest {

  @Test
  void shouldReturnMenuContentCorrectly() {
    Title title = new Title("Menu");
    Link linkDiscord = new Link("Discord", "www.discord.app");

    Section section = new Section("Seção");
    Link linkFb = new Link("Facebook", "www.facebook.com");
    Link linkYt = new Link("Youtube", "www.youtube.com");
    section.addItem(linkFb);
    section.addItem(linkYt);

    List<MenuContent> menuContent = new ArrayList<MenuContent>();
    menuContent.add(title);
    menuContent.add(linkDiscord);
    menuContent.add(section);

    Menu menu = new Menu();
    menu.setItems(menuContent);
    assertEquals(
        "<ul><li><h1>MENU</h1></li><li><a href=www.discord.app>Discord</a></li><li><section><h2>Seção</h2><ul><li><a href=www.facebook.com>Facebook</a></li><li><a href=www.youtube.com>Youtube</a></li></ul></section></li></ul>",
        menu.getContent());
  }

  @Test
  void shouldThrowsExceptionWithEmptyMenu() {
    try {
      Menu menu = new Menu();
      menu.getContent();
      fail();
    } catch (Exception e) {
      assertEquals("Menu vázio!", e.getMessage());
    }
  }

}
