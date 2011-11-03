import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Indexed;


@Entity
public class PO {
	private static final Random rnd = new Random();
	
	@Id
	private ObjectId id;
	private String itemId = RandomStringUtils.randomAlphanumeric(2250);
	private String itemId1 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId2 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId3 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId4 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId5 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId6 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId7 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId8 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId9 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId10 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId11 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId12 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId13 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId14 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId15 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId16 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId17 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId18 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId19 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId20 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId21 = RandomStringUtils.randomAlphanumeric(250);
	private String itemId22 = RandomStringUtils.randomAlphanumeric(250);
	
	private int qty = rnd.nextInt(10);
	//@Indexed
	private int qty1 = rnd.nextInt(10);
	private int qty2 = rnd.nextInt(10);
	private int qty3 = rnd.nextInt(10);
	private int qty4 = rnd.nextInt(10);
	private int qty5 = rnd.nextInt(10); 
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
