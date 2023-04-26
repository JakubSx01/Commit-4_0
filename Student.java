public class Student {

  private String Name;
  private String Nazwisko;
  private int Age;
  private String Ulica;
  private String Dataurodzenia;
  
  public Student(String name, String nazwisko, int age, String ulica, String dataurodzenia) {
    Name = name;
    Nazwisko = nazwisko;
    Age = age;
    Ulica = ulica;
    Dataurodzenia = dataurodzenia;
  }

  public String GetName() {return Name;}
  public String GetSurname() {return Nazwisko;}
  public int GetAge() {return Age;}
  public String GetUlica() {return Ulica;}
  public String GetDataurodzenia() {return Dataurodzenia;}

  public String ToString() {
    return Name + " " + Nazwisko + " " +  Integer.toString(Age)+ " " + Ulica + " " + Dataurodzenia;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 5) 
      return new Student("Parse Error", "Nazwisko error", -1, "Ulica error", "Dataurodzenia error");
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4]);
  }
}