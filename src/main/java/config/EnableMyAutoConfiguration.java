package config;

import config.autoconfig.DispatcherSevletConfig;
import config.autoconfig.TomcatWebServerConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({DispatcherSevletConfig.class, TomcatWebServerConfig.class})
public @interface EnableMyAutoConfiguration {
}
