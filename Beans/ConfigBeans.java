package Beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import com.concentrix.spring_transaction_demo.config.BeanConfig;
//import com.concentrix.spring_transaction_demo.model.Employee;
//import com.concentrix.spring_transaction_demo.service.EmpService;

public class ConfigBeans 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
        		new AnnotationConfigApplicationContext(BeanConfig.class);
    	context.registerShutdownHook();
        
        EmpService service = context.getBean(EmpService.class);
        
        Employee emp = new Employee(121,"Shankar",35, "FS Developer",44231);
        //Employee em = new Employee(108,"Aaksah",32,"manager",645342);
        //Employee emp1 = new Employee(111,"atiq",23,"tester",34321);
        service.save(emp);
        service.upd();
        service.del(108);
//        try {
//        service.save(emp);
//        }catch(Exception ex) {
//        	System.out.println("Rollback Happend becuase : " + ex.getMessage());
//        }
        context.close();
        
    }
}