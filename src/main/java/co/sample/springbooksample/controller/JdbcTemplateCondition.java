package co.sample.springbooksample.controller;

import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
//If we want to ignore configuration unless certain contitions are met.
public class JdbcTemplateCondition implements Condition {

    //It is very easy to write our own conditions in Spring. All we have to it to create a class that
    //implements Condition interface and to override its matched() method.
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata annotatedTypeMetadata) {
            try{
                context.getClassLoader().loadClass("org.springframework.jdbc.core.JdbcTemplate");
                return true;
            }
            catch (Exception e) {
                return false;

            }}}

