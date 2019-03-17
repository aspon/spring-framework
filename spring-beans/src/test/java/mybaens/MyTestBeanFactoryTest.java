package mybaens;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class MyTestBeanFactoryTest {

	@Test
	public void testSimpleLoad(){
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("MyTestBean.xml"));
		MyTestBean myTestBean = beanFactory.getBean(MyTestBean.class);
		Assert.assertEquals("testStr", myTestBean.getTestStr());
	}
}
