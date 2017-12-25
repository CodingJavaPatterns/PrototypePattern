import factory.PrototypeFactory;
import factory.PrototypeFactory.ModelType;

public class TestPrototypePattern {
	
	public static void main(String[] args)
    {
        try
        {
            String moviePrototype  = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
            System.out.println(moviePrototype);
 
            String albumPrototype  = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
            System.out.println(albumPrototype);
 
 
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
	

}