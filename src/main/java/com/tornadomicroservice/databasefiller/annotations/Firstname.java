/**
 * 
 */
package com.tornadomicroservice.databasefiller.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Autowired;

@Retention(RetentionPolicy.RUNTIME)
@Target( {ElementType.PARAMETER, ElementType.FIELD})
/**
 * @author gaeta
 *
 */
public @interface Firstname {
	public static final String objectName = "name";
	public static final String methodName = "firstName";

}
