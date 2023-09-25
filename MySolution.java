
/**
 * AP CS A Problem Set 2B
 *
 * @Cindy Weng
 * @Sept. 21, 2023
 */
public class MySolution
{

    public MySolution()
    {
        OrderedPair testPair=new OrderedPair(6.0, 7.0);
        OrderedPair testPairWithP=new OrderedPair(4.0, -5.0);
        OrderedPair testPairWithoutP=new OrderedPair();
        
        //without behaviour methods: print the reference to the object.
        //with behaviour methods: print the x and y of the object.
        System.out.println(testPairWithP); 
        System.out.println(testPairWithoutP); 
        //print the X of the object
        System.out.println(testPair.getX());
    }

}
