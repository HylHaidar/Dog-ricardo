public class hewanku {
    public String name = "Ricardo";
    public int age = 6;
    public double weight = 3.1;
    public String favoriteplace = "Sofa";
    public String allergy = "Cold";

    public void getName() {
        System.out.println("My dog name is " + name);
    }
    public void getAge() {
        System.out.println("My dog age is " + age + "years old");
    }
    public void getWeight() {
        System.out.println("My dog weight is " + weight + "kg");
    }
    public void getFavoriteplace() {
        System.out.println("My dog favorite plave is " + favoriteplace);
    }
    public void getAllergy() {
        System.out.println("My dog allergy is " + allergy);
    }
    public static void main(String[] args) {
        hewanku dog = new hewanku();
        dog.getName();
        dog.getAge();
        dog.getWeight();
        dog.getFavoriteplace();
        dog.getAllergy();
    }
}