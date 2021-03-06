//package com.test.test;
// 
//import java.io.IOException;
//import java.text.ParseException;
// 
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
// 
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
// 
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import org.testng.log4testng.Logger;
// 
//public class TestCRUD {
//    private String responseBody;
//    public String responseBodyPOST;
//    final static Logger logger = Logger.getLogger(TestCRUD.class);
//    //RESTTemplate Object
//    private RestTemplate restTemplate;
//     
//    //Employee ID 
//    private String employeeId;
//    // Create Response Entity - Stores HTTPStatus Code, Response Body, etc
//    private ResponseEntity<String> response;
//    @BeforeTest
//    public void beforeTest() throws IOException, ParseException {
//        logger.info("Setting up prerequisite for test execution");
//        logger.info("Creating RestTemplate object before tests");
//        this.restTemplate = new RestTemplate(); 
//    }
//
//    @Test
//    public void addEmployee() throws IOException, ParseException {
//        String addURI = "http://dummy.restapiexample.com/api/v1/create";
//        HttpHeaders headers = new HttpHeaders();        
//        headers.add("Accept", "application/json");
//        headers.add("Content-Type", "application/json");
//          
//        logger.info("Add URL :"+addURI);
//        String jsonBody = "{\"name\":\"zozo100\",\"salary\":\"123\",\"age\":\"23\"}";
//        System.out.println("\n\n" + jsonBody);
//        HttpEntity<String> entity = new HttpEntity<String>(jsonBody, headers);
//         
//        //POST Method to Add New Employee
//        response = this.restTemplate.postForEntity(addURI, entity, String.class);
//        responseBodyPOST = response.getBody();
//        // Write response to file
//        responseBody = response.getBody().toString();
//        System.out.println("responseBody --->" + responseBody);
//        // Get ID from the Response object
//        employeeId = getEmpIdFromResponse(responseBody);
//        System.out.println("empId is :" + employeeId);
//        // Check if the added Employee is present in the response body.
//        Assert.assertTrue(responseBody.contains(employeeId));
//        // System.out.println(propertyFile.get("EmployeeAddResBody"));
//        // Check if the status code is 201
//        Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
//        logger.info("Employee is Added successfully employeeId:"+employeeId);
//    }
//
//    public static String getEmpIdFromResponse(String json) {
//        JSONParser parser = new JSONParser();
//        JSONObject jsonResponseObject = new JSONObject();
//        Object obj = new Object();
//        try {
//            obj = parser.parse(json);
//        } catch (org.json.simple.parser.ParseException e) {
//            e.printStackTrace();
//        }
//        jsonResponseObject = (JSONObject) obj;
//        String id = jsonResponseObject.get("id").toString();
//        return id;
//    }
//
//      @Test(dependsOnMethods = "addEmployee", enabled = true) 
//      public void  updateEmployee() throws IOException, ParseException { 
//          String updateURI = "http://dummy.restapiexample.com/api/v1/update/"+employeeId;
//          logger.info("Update URL :"+updateURI);
//             
//          String jsonBody = responseBodyPOST;
//           
//          jsonBody = jsonBody.replace("zozo100", "update_zozo100");
//           
//          HttpHeaders headers = new HttpHeaders();      
//          headers.add("Accept", "application/json");
//          headers.add("Content-Type", "application/json");
//           
//          HttpEntity<String> entity = new HttpEntity<String>(jsonBody, headers);
//           
//          //PUT Method to Update the existing Employee
//          //NOTE that I have Not used restTemplate.put as it's void and we need response for verification
//          response = restTemplate.exchange(updateURI, HttpMethod.PUT, entity, String.class);
//          responseBody = response.getBody().toString();
//          System.out.println("Update Response Body :"+responseBody);          
//       
//          // Check if the updated Employee is present in the response body.
//          Assert.assertTrue(responseBody.contains("update_zozo100"));
//           
//          // Check if the status code is 200
//          Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
//           
//          logger.info("Employee Name is Updated successfully employeeId:"+employeeId);
//       
//      }
//       
//      @Test(dependsOnMethods = "updateEmployee", enabled = true) 
//      void getEmployee() throws IOException, ParseException {     
//          String getURI = "http://dummy.restapiexample.com/api/v1/employee/"+this.employeeId;
//          logger.info("Get URL :"+getURI);
//           
//          HttpHeaders headers = new HttpHeaders();
//          HttpEntity<String> entity = new HttpEntity<String>(headers); 
//           
//          //GET Method to Get existing Employee
//          response = restTemplate.getForEntity(getURI,String.class);
//           
//          // Write response to file
//          responseBody = response.getBody().toString();
//           
//          //Suppressing for log diffs
//          System.out.println("GET Response Body :"+responseBody);
//           
//           
//          // Check if the added Employee ID is present in the response body.
//          Assert.assertTrue(responseBody.contains("update_zozo100"));
//           
//          // Check if the status code is 200
//          Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
//           
//          logger.info("Employee is retrieved successfully employeeId:"+employeeId);
//       
//      }   
//       
//        @Test(dependsOnMethods = "getEmployee", enabled = true)
//        public void deleteEmployee() throws IOException, ParseException {
//            String delURI = "http://dummy.restapiexample.com/api/v1/delete/"+this.employeeId;
//            HttpHeaders headers = new HttpHeaders();
//            HttpEntity<String> entity = new HttpEntity<String>(headers); 
//             
//            //DELETE Method to Delete existing Employee
//            response = restTemplate.exchange(delURI, HttpMethod.DELETE, entity, String.class);  
//     
//            // Check if the status code is 204
//            Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);           
//             
//            responseBody = response.getBody();
//             
//            Assert.assertEquals(getMessageFromResponse(responseBody), "successfully! deleted Records");
//             
//            logger.info("Employee is Deleted successfully employeeId:"+employeeId);
//        }
//
//        public static String getMessageFromResponse(String json) {
//            String successMessageText = null;
//            try {
//                JSONParser parser = new JSONParser();
//                JSONObject jsonResponseObject = new JSONObject();
//                jsonResponseObject = (JSONObject) (parser.parse(json));
//                String successMessage = jsonResponseObject.get("success").toString();
//                 
//                jsonResponseObject = (JSONObject) (parser.parse(successMessage));
//                successMessageText = jsonResponseObject.get("text").toString();
//            } catch (org.json.simple.parser.ParseException e) {
//                e.printStackTrace();
//            }
//            return successMessageText;
//        }
//         
//    @AfterTest
//    public void afterTest() {
//        logger.info("Clean up after test execution");
//        logger.info("Creating RestTemplate object as Null");
//        this.restTemplate = new RestTemplate(); 
//    }
//}