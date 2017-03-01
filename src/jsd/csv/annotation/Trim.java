package jsd.csv.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

/**
 * 
 * 指定されたフィールドをTrimするか設定します.
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Trim {
	/** トリム制御フラグ */
	public boolean trim() default false;
}