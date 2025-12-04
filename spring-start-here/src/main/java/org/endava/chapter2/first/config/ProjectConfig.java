package org.endava.chapter2.first.config;

import org.endava.chapter2.first.coco.Coco;
import org.endava.chapter2.first.coco.Ruster;
import org.endava.chapter2.first.parrot.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot () {
        Parrot parrot = new Parrot ();
        parrot.setName("koko");
        return parrot;
    }

    @Bean
    public Coco coco () {
        Coco coco = new Coco ();
        coco.setName("cochito");
        return coco;
    }

    @Bean
    @Primary // poti adnota sa spui pe care il vrei default
    public Coco coco2 () {
        Coco coco = new Coco ();
        coco.setName("cochilac");
        return coco;
    }

//    @Bean(name = "myRuster")
//    @Bean(value = "myRuster")
//    @Bean("myRuster")
    @Bean
    public Ruster ruster () {
        Ruster ruster = new Ruster ();
        ruster.setName("cocos");
        return ruster;
    }

    @Bean
    public Integer age(){
        return 18;
    }

    @Bean
    public String name(){
        return "mimi";
    }
}
