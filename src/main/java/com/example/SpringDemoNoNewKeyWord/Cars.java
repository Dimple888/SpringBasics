package com.example.SpringDemoNoNewKeyWord;

public class Cars {

	Engine engine; //we will encounter a exception Bean property 'engine' is not writable or has an invalid setter method. Does the parameter type of the setter match the return type of the getter?
	//at org.springframework.beans.BeanWrapperImpl.createNotWritablePropertyException(BeanWrapperImpl.java:208) - becoz no setters and getters so create setters and getters for setter injection
	
	//Error creating bean with name 'cars' defined in class path resource [ApplicationContext.xml]: Could not resolve matching constructor on bean class [com.example.SpringDemoNoNewKeyWord.Cars] (hint: specify index/type/name arguments for simple parameters to avoid type ambiguities. You should also check the consistency of arguments when mixing indexed and named arguments, especially in case of bean definition inheritance)
	//at org.springframework.beans.factory.support.ConstructorResolver.autowireConstructor(ConstructorResolver.java:288) - for constructor injection if no constructor so create new constructor
	
	
	public Cars(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;

	}

	public String getEngineData() {
		return engine.name;
	}
	

}
