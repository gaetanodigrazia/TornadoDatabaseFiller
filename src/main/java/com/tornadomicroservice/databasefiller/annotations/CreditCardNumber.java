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

@Retention(RetentionPolicy.RUNTIME)
@Target( {ElementType.PARAMETER, ElementType.FIELD})
/**
 * @author gaeta
 *
 */
public @interface CreditCardNumber {

}
