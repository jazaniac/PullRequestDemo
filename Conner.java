public class Conner implements Student{
  String name;
  String favoriteFood;
  String catchPhrase;

  public Conner(String n, String f, String c){
    name = n;
    favoriteFood = f;
    catchPhrase = c;
  }
  public String getName(){
    return name;
  }
  public String getFavoriteFood(){
    return favoriteFood;
  }
  public String sayCatchphrase(){
    System.out.println("\""+catchPhrase+"\"");
  }
}
