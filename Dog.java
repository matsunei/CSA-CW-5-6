public class Dog implements Comparable <Dog>
{
    //1) Instance Variables name, age, breed and weight in pounds
    private String name;
    private int age; // can also be composer
    private String breed;
    private double weight; //in seconds
    private static int dogCount;


    //2) Constructors
    //Overloaded constructors (methods) have early binding
    public Dog()
    {
        name = null;
        age = 0;
        breed = null;
        weight = 0.0;
        dogCount = 0;
    }// end zero-arg or default constructor

    public Dog(String name, int age, String breed, double weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        dogCount++;
    }//end three-arg constructor


    //4 Getters
    public String getName()
    {
        return name;
    }//title getter

    public int getAge()
    {
        return age;
    }//artist getter

    public String getBreed()
    {
        return breed;
    }//hasLyrics getter
    public double getWeight()
    {
        double newWeight = 0.0;
        newWeight = weight*0.453592;
        return newWeight;
    }//hasLyrics getter
    public int compareTo(Dog doggie)
    {
        if(this.age < doggie.age)
        {
            return -1;
        }
        else if(this.age == doggie.age)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }



    //3. toString  a must have for every great object class
    public String toString()
    {
        String output = "";
        output += "\nName: " + name;
        output += "\nAge: " + age;
        output += "\nBreed: " + breed;
        output += "\nWeight:  " + getWeight();
        output += "\n" +dogCount;

        return output;
    }// end toString

}//end class Song


