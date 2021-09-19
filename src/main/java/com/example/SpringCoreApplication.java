package com.example;

import com.example.bean.PrivateConstructorBean;
import com.example.bean.annotation.AnnotationBean;
import com.example.bean.multiple.impl.Exporter;
import com.example.bean.promatic.BeanDefinitionBean;
import com.example.bean.promatic.SingletonBean;
import com.example.bean.xml.XMLBean;
import com.example.bean.xml.service.ClientService;
import com.example.bean.xml.service.CustomerService;
import com.opencsv.CSVWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.FileWriter;

@SpringBootApplication
@ImportResource("classpath:service.xml") // import bean from xml
@EnableTransactionManagement
public class SpringCoreApplication implements CommandLineRunner {
    @Autowired
    private ApplicationContext context;

    @Autowired
    @Qualifier(value = "excelExporter")
    private Exporter excelExporter;

    @Autowired
    @Qualifier(value = "htmlExporter")
    private Exporter htmlExporter;

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        excelExporter.export();
        htmlExporter.export();
//        testCreateBeanByBeanDefinition(context);
//        testCreateSingletonBeanProgrammatically(context);

//        testCreateBeanByXML(context);
//        testCreateFactoryBean(context);
//        testCreateFactoryMethodBean(context);
//        testCreateFactoryMethodBean(context);


    }

    private static void testCreateBeanWithPrivateConstructorBean(ApplicationContext context) {
        PrivateConstructorBean bean = context.getBean(PrivateConstructorBean.class);
        System.err.println(bean);

    }

    private static void testCreateBeanByAnnotationBean(ApplicationContext context) {
        AnnotationBean componentBean = context.getBean(AnnotationBean.class);
        System.err.println(componentBean);
    }

    private static void testCreateBeanByXML(ApplicationContext xmlContext) {
        XMLBean xmlBean = (XMLBean) xmlContext.getBean("xmlBean");
        System.err.println("XML bean :" + xmlBean);
    }

    private static void testCreateBeanByBeanDefinition(ApplicationContext context) {
        BeanDefinitionBuilder beanBuilder = BeanDefinitionBuilder
                .genericBeanDefinition(BeanDefinitionBean.class)
                .setLazyInit(false)
                .setInitMethodName("postConstruct")
                .addConstructorArgValue("Injected dependency value");
        DefaultListableBeanFactory factory = (DefaultListableBeanFactory) context.getAutowireCapableBeanFactory();
        factory.registerBeanDefinition("ProgrammaticallyBean", beanBuilder.getBeanDefinition());
        BeanDefinitionBean bean = (BeanDefinitionBean) context.getBean("ProgrammaticallyBean");
        System.err.println("Programmatically bean definition :" + bean.getValue());
    }

    private static void testCreateSingletonBeanProgrammatically(ApplicationContext context) {
        DefaultListableBeanFactory factory = (DefaultListableBeanFactory) context.getAutowireCapableBeanFactory();
        SingletonBean rangeBean = new SingletonBean();
        rangeBean.setMax(100);
        rangeBean.setMin(1);
        factory.registerSingleton("rangeBean", rangeBean);
        SingletonBean bean = context.getBean(SingletonBean.class);
        System.err.println("Programmatically singleton bean : " + bean.getMin() + " - " + bean.getMax());
    }


    private static void testCreateFactoryBean(ApplicationContext xmlContext) {
        ClientService bean = xmlContext.getBean(ClientService.class);
        System.err.println("Factory bean :" + bean);
    }

    private static void testCreateFactoryMethodBean(ApplicationContext xmlContext) {
        CustomerService bean = xmlContext.getBean("customerService", CustomerService.class);
        System.err.println("Factory method bean : " + bean.getHash());
    }

}
