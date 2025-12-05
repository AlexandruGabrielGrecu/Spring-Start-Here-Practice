package org.endava.chapter3.EightCircularDependencies;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.endava.chapter3.EightCircularDependencies")
public class ProjectConfig {
}
