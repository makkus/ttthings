package hub.actions;

import com.google.common.collect.ImmutableSet;
import hub.types.persistent.Person;
import hub.types.persistent.Role;
import hub.types.persistent.Username;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import rx.Observable;
import things.thing.Thing;
import things.thing.ThingAction;

import java.util.Map;
import java.util.Set;

/**
 * @author: Markus Binsteiner
 */
public class ClearMongoDatabase implements ThingAction {

    private MongoTemplate mo;

    public ClearMongoDatabase() {
    }

    @Override
    public Observable<? extends Thing<?>> execute(String command, Observable<? extends Thing<?>> things, Map<String, String> parameters) {
        mo.dropCollection(Person.class);
        mo.dropCollection(Thing.class);
        mo.dropCollection(Username.class);
        mo.dropCollection(Role.class);

        return Observable.empty();
    }

    @Override
    public Set<String> getSupportedActionNames() {
        return ImmutableSet.<String>of("clear_mongo");
    }

    @Autowired
    public void setMongoTemplate(MongoTemplate mo) {
        this.mo = mo;
    }
}
