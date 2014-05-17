package things.view.rest;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import rx.Observable;
import things.exceptions.ActionException;
import things.exceptions.NoSuchThingException;
import things.exceptions.ThingException;
import things.thing.Thing;
import things.thing.ThingControl;
import things.thing.ThingUtils;

import javax.inject.Inject;
import java.util.Map;

/**
 * @author: Markus Binsteiner
 */
@RestController
@RequestMapping(value = "/")

public class ExecuteRestController {

    private ThingControl thingControl;
    private ThingUtils thingUtils;

    @Inject
    public ExecuteRestController(ThingControl tc, ThingUtils tu) {
        this.thingControl = tc;
        this.thingUtils = tu;
    }

    @Transactional(readOnly = false)
    @RequestMapping(value = "/{actionName}/everything", method = RequestMethod.POST)
    public String executeAllThings(@PathVariable("actionName") String action, @RequestParam Map<String, String> actionParams) throws ActionException {

        Observable<? extends Thing<?>> things = thingControl.observeAllThings(false);

        String handle = thingControl.executeAction(action, things, actionParams);
        return handle;
    }

    @Transactional(readOnly = false)
    @RequestMapping(value = "/{actionName}/every/{type}", method = RequestMethod.POST)
    public String executeAllThingsOfType(@PathVariable("actionName") String action, @PathVariable("type") String type, @RequestParam Map<String, String> actionParams) throws ActionException {

        Observable<? extends Thing<?>> things = thingControl.observeThingsForType(type, false);

        String handle = thingControl.executeAction(action, things, actionParams);
        return handle;
    }

    @Transactional(readOnly = false)
    @RequestMapping(value = "/{actionName}", method = RequestMethod.POST)
    public String executeGetAction(@PathVariable("actionName") String actionName, @RequestParam Map<String, String> allRequestParams) throws ActionException {

        String handle = thingControl.executeAction(actionName, Observable.empty(), allRequestParams);
        return handle;
    }

    @Transactional(readOnly = false)
    @RequestMapping(value = "/{actionName}/{type}/{key}")
    public String getUniqueThingForTypeAndKey(@PathVariable("actionName") String action, @PathVariable("type") String type, @PathVariable("key") String key, @RequestParam Map<String, String> actionParam) throws ThingException, NoSuchThingException, ActionException {

        Observable<? extends Thing<?>> thing = thingControl.observeUniqueThingMatchingTypeAndKey(type, key, false);

        return thingControl.executeAction(action, thing, actionParam);

    }

}
