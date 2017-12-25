package factory;
import contract.PrototypeCapable;
import model.Album;
import model.Move;

public class PrototypeFactory {

	public static class ModelType
    {
        public static final String MOVIE = "movie";
        public static final String ALBUM = "album";
     
    }

	 private static java.util.Map<String , PrototypeCapable> prototypes = new java.util.HashMap<String , PrototypeCapable>();

	 
	 static
	    {
	        prototypes.put(ModelType.MOVIE, new Move());
	        prototypes.put(ModelType.ALBUM, new Album());
	     
	    }
	 
	 public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException {
	        return ((PrototypeCapable) prototypes.get(s)).clone();
	    }
}
