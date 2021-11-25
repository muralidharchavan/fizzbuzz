package it;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import application.training.FizzBuzz;

public class TestFizzBuzz {

    private String port = System.getProperty("http.port");
    private String url = "http://localhost:" + port;

//    @Test
//    public void testEndpoint() throws Exception {
//        System.out.println("Testing endpoint " + url);
//        Client client = ClientBuilder.newClient();
//        Invocation.Builder invoBuild = client.target(url)
//            .request()
//            .accept(MediaType.TEXT_HTML);
//        Response response = invoBuild.get();
//        int responseCode = response.getStatus();
//        String content = response.readEntity(String.class);
//        response.close();
//        assertTrue(responseCode == 200, "Incorrect response code: " + responseCode);
//        assertTrue(content.contains("IBM Cloud Starter"), "Incorrect contents, expected to see 'IBM Cloud Starter', found: " + content);
//    }
    
    @Test
    public void testFizzBuzz(){
    	assertEquals("1", FizzBuzz.printFizzBuzz(1));
    	assertEquals("2", FizzBuzz.printFizzBuzz(2));
    	assertEquals("Fizz", FizzBuzz.printFizzBuzz(3));
    	assertEquals("4", FizzBuzz.printFizzBuzz(4));
    	assertEquals("Buzz", FizzBuzz.printFizzBuzz(5));
    	assertEquals("Fizz", FizzBuzz.printFizzBuzz(6));
    	assertEquals("Buzz", FizzBuzz.printFizzBuzz(10));
    	assertEquals("FizzBuzz", FizzBuzz.printFizzBuzz(15));
    	assertEquals("FizzBuzz", FizzBuzz.printFizzBuzz(0));
    	assertEquals("52", FizzBuzz.printFizzBuzz(52));
    }
}
