package legend.game;

public class stateCheck {
  public static void screenState() {
    try {
      final MenuScreen<?> screen = SItem.menuStack.getTop():

      if(screen instanceof ItemListScreen itemList) {
        itemList.getState() == state.
      }
    } catch(Exception e) {
      throw new RuntimeException(e);
    }
  }
}
