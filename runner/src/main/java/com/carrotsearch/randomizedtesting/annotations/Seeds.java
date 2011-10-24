package com.carrotsearch.randomizedtesting.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a list of starting seeds for a given test.
 * 
 * <p>Typically, you'll want to override the class's seed to make the test repeat a "fixed"
 * scenario in which the test was known to fail in the past. In addition, you may still permit
 * a randomized seed by adding a non-restricted {@link Seed} as in:
 * <pre>
 * @Seeds({@Seed("deadbeef"), @Seed("cafebabe"), @Seed()})
 * </pre></p>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Inherited
public @interface Seeds {
  /**
   * A non-empty array of {@link Seed}s.
   */
  Seed [] value();
}