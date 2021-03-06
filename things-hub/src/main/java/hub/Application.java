package hub;

import hub.config.jpa.HubConfigJpa;
import hub.types.persistent.Person;
import hub.types.persistent.Role;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import things.exceptions.ThingException;
import things.exceptions.ValueException;
import things.thing.Thing;
import things.thing.ThingControl;

import java.util.List;

/**
 * Project: hub
 * <p>
 * Written by: Markus Binsteiner
 * Date: 12/03/14
 * Time: 10:56 AM
 */
public class Application {


    public static void main(String[] args) throws ValueException, ThingException, InterruptedException {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(HubConfigJpa.class);

        MongoOperations mo = (MongoOperations) context.getBean("mongoTemplate");
        final ThingControl tc = (ThingControl) context.getBean("thingControl");

//        for ( String s : context.getBeanDefinitionNames() ) {
//            System.out.println(s);
//        }

//        Person p = new Person("markus", "binsteiner", "m.binsteiner@auckland.ac.nz");
//        Thing<Person> tp = tc.createThing("markus", p);
//
//        Role r1 = new Role("role1");
//        Thing<Role> tr1 = tc.createThing("group1", r1);
//        Role r2 = new Role("role2");
//        Thing<Role> tr2 = tc.createThing("group1", r2);

        Thing<Person> tp = tc.findUniqueThingMatchingTypeAndKey(Person.class, "markus", true).get();

        List<Thing<Role>> tr = tc.findThingsForTypeAndKey(Role.class, "group1");

        Thing<Role> tr1 = tr.get(0);
        Thing<Role> tr2 = tr.get(1);

        tc.addChildThing(tp, tr1);
        tc.addChildThing(tp, tr2);


        List<Thing<Role>> t = tc.findThingsForType(Role.class);

        t.stream().forEach(System.out::println);


    }


}
