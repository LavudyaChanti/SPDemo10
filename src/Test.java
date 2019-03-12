import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

public class Test {

	public static void main(String[] args) 
	{
		Resource res=new ClassPathResource("myconfig.xml");
		BeanFactory fac=new XmlBeanFactory(res);
		
		MyBean ob=(MyBean)fac.getBean("mb1");
		ob.saySomeThing();
	}

}	