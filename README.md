# springboot-thymeleaf-pet-clinic

##### Application XML
spring.application.name=springboot-thymeleaf-pet-clinic

server.port=8088

##### Run project as 
http://localhost:8088/


* Design the Pojo Classes
* Code the service Layer
* Create a CrudService Interface comprising common methods like findById, save, delete and remove duplicated code
* Create Map based Services. Create Abstract class with all the crud methods as above. Issue#9
* Added a image banner via application.xml spring.banner.image.location -- Issue#9
* Create Index Page and Controller Issue#11
```java
@Controller
public class IndexController {
    @RequestMapping({"","/","index","index.html"})
    public String index(){
        return "index";
    }
}
```
* Create Index Page for Vets and Controller 
* Create Index Page for Owner and Controller
* Create Index Page for Pets and Controller






