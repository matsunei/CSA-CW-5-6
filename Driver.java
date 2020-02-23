  
public class Driver
{
    public static void main (String args[])
    {
        //1. Create a Song, or more
        Dog dog1 = new Dog("Fang  ", 5, "Husky", 80);
        Dog dog2 = new Dog("Nutmeg", 12, "Australian Sheepdog", 45);
        Dog dog3 = new Dog("Anime", 100, "Cool Type", 23.4);
        System.out.println("Fang's Breed: " + dog1.getBreed());
        System.out.println("Fang's Age: " + dog1.getAge());
        System.out.println("Nutmeg's Weight: "+dog2.getWeight());
        System.out.println(dog3.getName() + "'s stats: " + dog3);

        int compare1 = dog1.compareTo(dog2);
        if(compare1 == 1)
        {
            System.out.println("Dog 1 is older than Dog 2.");
        }
        else if(compare1 == 0)
        {
            System.out.println("Dog 1 is the same age as Dog 2.");
        }
        else if (compare1 == -1)
        {
            System.out.println("Dog 1 is younger than Dog 2.");
        }

        int compare2 = dog2.compareTo(dog3);
        if(compare2 == 1)
        {
            System.out.println("Dog 2 is older than Dog 3.");
        }
        else if(compare2 == 0)
        {
            System.out.println("Dog 2 is the same age as Dog 3.");
        }
        else if(compare2==-1)
        {
            System.out.println("Dog 2 is younger than Dog 3.");
        }

    }//end main method

    //@Override

}//end class SongDriver.  This is where all the fun stuff happens.
