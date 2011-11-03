import java.util.List;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;


public class MongoTest {
	public MongoTest() throws Exception {
		
	
		Mongo mongo = new Mongo("127.0.0.1");
		Morphia morphia = new Morphia();
		Datastore ds = morphia.createDatastore(mongo, "podb");

		//at application start
		ds.ensureIndexes(); //creates indexes from @Index annotations in your entities
		ds.ensureCaps(); //creates capped collections from @Entity
		morphia.map(PO.class);
		
		long now = System.currentTimeMillis();
		for (int i=0; i<10; i++) {
			ds.save(new PO());
		}
		
		System.out.println("#POs: "+ ds.getCount(PO.class));
		now = System.currentTimeMillis();
		
		List<PO> pos = ds.createQuery(PO.class).filter("qty1 <",1).limit(2).asList();
		System.out.println("# POs: "+ pos.size() + "  POS: "+ pos);
		System.out.println("Query Millis: "+(System.currentTimeMillis() - now));

	}
	
	public static void main(String[] args) throws Exception {
		new MongoTest();
	}
}
