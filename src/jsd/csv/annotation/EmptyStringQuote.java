package jsd.csv.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

/**
 * 
 * 指定されたフィールドが空文字の場合、クォート文字で囲むか設定します.
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface EmptyStringQuote {
	/** クォート制御フラグ */
	public boolean quote() default true;
}