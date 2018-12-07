//package com.concretepage.client;
//
//import java.net.URI;
//
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//
//import com.concretepage.entity.Paciente;
//
//public class RestClientUtil {
//    public void getPacienteByIdDemo() {
//    	HttpHeaders headers = new HttpHeaders();
//    	headers.setContentType(MediaType.APPLICATION_JSON);
//        RestTemplate restTemplate = new RestTemplate();
//	    String url = "http://localhost:8080/user/Paciente/{id}";
//        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
//        ResponseEntity<Paciente> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Paciente.class, 1);
//        Paciente Paciente = responseEntity.getBody();
//        System.out.println("Id:"+Paciente.getPacienteId()+", Title:"+Paciente.getTitle()
//                 +", Category:"+Paciente.getCategory());      
//    }
//    
//	public void getAllPacientesDemo() {
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//        RestTemplate restTemplate = new RestTemplate();
//	    String url = "http://localhost:8080/user/Pacientes";
//        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
//        ResponseEntity<Paciente[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Paciente[].class);
//        Paciente[] Pacientes = responseEntity.getBody();
//        for(Paciente Paciente : Pacientes) {
//              System.out.println("Id:"+Paciente.getPacienteId()+", Title:"+Paciente.getTitle()
//                      +", Category: "+Paciente.getCategory());
//        }
//    }
//	
//    public void addPacienteDemo() {
//    	HttpHeaders headers = new HttpHeaders();
//    	headers.setContentType(MediaType.APPLICATION_JSON);
//        RestTemplate restTemplate = new RestTemplate();
//	    String url = "http://localhost:8080/user/Paciente";
//	    Paciente objPaciente = new Paciente();
//	    objPaciente.setTitle("DAvis");
//	    objPaciente.setCategory("JA");
//        HttpEntity<Paciente> requestEntity = new HttpEntity<Paciente>(objPaciente, headers);
//        URI uri = restTemplate.postForLocation(url, requestEntity);
//        System.out.println(uri.getPath());    	
//    }
//    
//    public void updatePacienteDemo() {
//    	HttpHeaders headers = new HttpHeaders();
//    	headers.setContentType(MediaType.APPLICATION_JSON);
//        RestTemplate restTemplate = new RestTemplate();
//	    String url = "http://localhost:8080/user/Paciente";
//	    Paciente objPaciente = new Paciente();
//	    objPaciente.setPacienteId(4);
//	    objPaciente.setTitle("DAvod");
//	    objPaciente.setCategory("asa");
//        HttpEntity<Paciente> requestEntity = new HttpEntity<Paciente>(objPaciente, headers);
//        restTemplate.put(url, requestEntity);
//    }
//    
//    public void deletePacienteDemo() {
//    	HttpHeaders headers = new HttpHeaders();
//    	headers.setContentType(MediaType.APPLICATION_JSON);
//        RestTemplate restTemplate = new RestTemplate();
//	    String url = "http://localhost:8080/user/Paciente/{id}";
//        HttpEntity<Paciente> requestEntity = new HttpEntity<Paciente>(headers);
//        restTemplate.exchange(url, HttpMethod.DELETE, requestEntity, Void.class, 4);        
//    }
//    
//    public static void main(String args[]) {
//    	RestClientUtil util = new RestClientUtil();
//        //util.getPacienteByIdDemo();
//    	//util.addPacienteDemo();
//    	//util.updatePacienteDemo();
//    	//util.deletePacienteDemo();
//    	//util.getAllPacientesDemo();    	
//    }
//    
//}
