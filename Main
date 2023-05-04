public class RealmQuest {
  private Map map;
  private Player player;
  private List<Character> characters;
  
  public RealmQuest() {
    map = new Map();
    player = new Player(map.getStartX(), map.getStartY());
    characters = new ArrayList<>();
    characters.add(new Character(map.getCharacterX(), map.getCharacterY()));
  }
  
  public void play() {
    System.out.println("Welcome to Realm Quest!");
    map.display(player.getX(), player.getY());
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Enter a direction (n/s/e/w): ");
      String direction = scanner.nextLine().toLowerCase();
      if (direction.equals("n")) {
        player.moveNorth();
      } else if (direction.equals("s")) {
        player.moveSouth();
      } else if (direction.equals("e")) {
        player.moveEast();
      } else if (direction.equals("w")) {
        player.moveWest();
      } else {
        System.out.println("Invalid direction.");
        continue;
      }
      map.display(player.getX(), player.getY());
      for (Character character : characters) {
        character.moveRandom();
      }
      for (Character character : characters) {
        if (player.getX() == character.getX() && player.getY() == character.getY()) {
          character.interact(player);
        }
      }
    }
  }
  
  public static void main(String[] args) {
    RealmQuest game = new RealmQuest();
    game.play();
  }
}
