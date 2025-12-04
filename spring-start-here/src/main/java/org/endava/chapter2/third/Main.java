package org.endava.chapter2.third;

import org.endava.chapter2.third.config.ProjectConfig;
import org.endava.chapter2.third.parrot.Parrot;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot x = new Parrot();
        x.setName("kikithird");

        Supplier<Parrot> supplierSupplier = () -> x;

        context.registerBean(
                "parrot1",
                Parrot.class,
                supplierSupplier,
                bc -> bc.setPrimary(true)
        );

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());


        context.registerBean(
                "parrotLazyPrimary",
                Parrot.class,
                () -> {
                    Parrot parrot = new Parrot();
                    parrot.setName("lazy-primary");
                    return parrot;
                },
                bd -> {
                    bd.setLazyInit(true);                // creează instanța la prima utilizare
                    bd.setPrimary(true);                 // preferat când există mai multe beans de același tip
                    bd.setScope(BeanDefinition.SCOPE_SINGLETON); // implicit e singleton; pentru prototip:
                    // bd.setScope(BeanDefinition.SCOPE_PROTOTYPE);
                }
        );


        /**
         * <T> void registerBean(
         *   String beanName,
         *   Class<T> beanClass,
         *   Supplier<T> supplier,
         *   BeanDefinitionCustomizer... customizers);
         *
         *   Pe scurt:
         * registerBean(...) este o metodă din AnnotationConfigApplicationContext (Spring) care
         * îți permite să înregistrezi programatic un bean în context, fără să folosești adnotări
         * (@Bean, @Component) sau fișiere XML. Poți să îi dai un nume, tipul clasei, un Supplier
         * care creează/returnează instanța, plus opțional niște customizări ale definiției de bean.
         */

    }
}
