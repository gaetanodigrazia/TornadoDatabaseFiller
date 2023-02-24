package com.tornadomicroservice.databasefiller.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.javafaker.Faker;
import com.tornadomicroservice.databasefiller.annotations.*;

public class Database {
	Map<String, Method> mapAnnotation = new HashMap();
	Map<String, Object> mapObject = new HashMap();
	public Database() {
		
	}
	
	public Object[] fillDatabaseForClass(String rootPackage, Class<?> beanClass) throws ClassNotFoundException {
		Faker faker = new Faker();
	    Class<?> clazz = Class.forName(rootPackage+".beans."+beanClass.getSimpleName());
		Constructor<?>[] constructors = clazz.getConstructors();
		List<Class<?>> paramsType = Arrays.asList(constructors[0].getParameterTypes());
		List<Parameter> paramsNames = Arrays.asList(constructors[0].getParameters());
		Object[] params = new Object[paramsType.size()];
		for(int i = 0; i < paramsType.size(); i++) {
// THERE IS A PROBLEM WITH INDEXING get(0) is empty
			
//			List<Annotation> annotation = Arrays.asList(paramsNames.get(i).getAnnotations());
//			System.out.println("PARAM NAMES ANNOTATIONS " + annotation.size());
//			annotation.stream().forEach(x->System.out.println("param ann "+x.annotationType().getSimpleName()));
//			System.out.println("aaa to string: " +  Arrays.asList(paramsNames.get(i).getAnnotations().toString()));
//			System.out.println("Get 1: " +  annotation.get(0).toString());
			switch(paramsType.get(i).getSimpleName()) {
			case "String":
				params[i] = faker.regexify("[a-z1-9]{10}");
				if(paramsNames.get(i).isAnnotationPresent(Firstname.class)) {
					//GENERAL WAY
					Firstname ta = paramsNames.get(i).getAnnotation(Firstname.class);
					Method objectMethod, finalMethod;
					try {
						objectMethod = Faker.class.getMethod(Firstname.objectName, null);
						Object resultObject =  objectMethod.invoke(faker, null);
						finalMethod = resultObject.getClass().getMethod(Firstname.methodName, null);
						params[i] = finalMethod.invoke(resultObject, null);
						mapAnnotation.put("firstname", finalMethod);
						mapObject.put("firstname", resultObject);
						params[i] = mapAnnotation.get("firstname").invoke(mapObject.get("firstname"), null);

					} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				if(paramsNames.get(i).isAnnotationPresent(City.class)) {
					params[i] = faker.address().city();
				}
				if(paramsNames.get(i).isAnnotationPresent(CitySuffix.class)) {
					params[i] = faker.address().citySuffix();
				}
				if(paramsNames.get(i).isAnnotationPresent(Color.class)) {
					params[i] = faker.color().name();
				}
				if(paramsNames.get(i).isAnnotationPresent(ColorHex.class)) {
					params[i] = faker.color().hex();
				}
				if(paramsNames.get(i).isAnnotationPresent(Country.class)) {
					params[i] = faker.address().country();
				}
				if(paramsNames.get(i).isAnnotationPresent(CreditCardNumber.class)) {
					params[i] = faker.business().creditCardNumber();
				}
				if(paramsNames.get(i).isAnnotationPresent(CreditCardNumber.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(Department.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(Dish.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(EducationalAttainment.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(FakeUrl.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(Food.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(Fruit.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(FullAddress.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(FullName.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(Gender.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(Ingredient.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(InternetDomainName.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV4.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}
				if(paramsNames.get(i).isAnnotationPresent(IPAddressV6.class)) {
					params[i] = faker.name().lastName();
				}


				break;
			case "Integer":
			case "int":
			case "Int":
				params[i] = Integer.valueOf(faker.address().buildingNumber());
				break;
			case "Long":
				params[i] = Long.valueOf(faker.address().buildingNumber());
				break;
			case "Float":
			case "float":
				params[i] = Float.valueOf(faker.address().buildingNumber());
				break;
			case "Double":
			case "double":
				params[i] = Double.valueOf(faker.address().buildingNumber());
				break;
			case "Date":
				params[i] = new Date(System.currentTimeMillis());
				break;
			case "LocalDate":
				params[i] = LocalDate.now();
				break;
			case "Boolean":
			case "boolean":
				params[i] = Integer.valueOf(faker.address().buildingNumber()) % 2 == 0 ? true : false;
				break;
			}
		}
		// SHOULD CALL THE SERVICE TO INSERT THE OBJECT
//		Object element = constructors[0].newInstance(params);
		return params;
	}

}
