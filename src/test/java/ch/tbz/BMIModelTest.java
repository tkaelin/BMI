package ch.tbz;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BMIModelTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetIsBMIRecommended() {
		assertTrue("1 zu jung", BMIModel.getIsBMIRecommended(10, 19) == null);
		assertTrue("2", BMIModel.getIsBMIRecommended(19, 18) == false);
		assertTrue("3", BMIModel.getIsBMIRecommended(19, 19) == true);
		assertTrue("4", BMIModel.getIsBMIRecommended(24, 24) == true);
		
		//assertTrue("5 Age 25, lower range", BMIModel.getIsBMIRecommended(25, 19) == false);
		//assertTrue("6 Age 25, upper range", BMIModel.getIsBMIRecommended(25, 26) == false);
	}

	@Test
	void testGetBMIClassification() {
		String result;
		//result = BMIModel.getBMIClassification(true, 18);		
	    //assertTrue("BMI bei Frauen unter 18 nicht berechenbar", result == BMIModel.RATING_UNDEFINED);
		result = BMIModel.getBMIClassification(true, 19);		
	    assertTrue("BMI bei Frauen unter 18 nicht berechenbar", result == BMIModel.RATING_NORMALWEIGHT);
	}

}
