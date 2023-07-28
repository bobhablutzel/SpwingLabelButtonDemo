package com.hablutzel.spwingDemo;


import com.hablutzel.spwing.model.ControllerFor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


/**
 * The controller class has the responsibility of
 * reacting to view events. Controllers are mostly
 * used to handle button clicks and the like; they
 * are not needed for reflecting changes to bound
 * values in the model.<br>
 * For this demo, the button reacts by changing
 * the text of the model.
 */
@Service
@Scope("document")
public class SpwingLabelButtonDemoController implements ControllerFor<SpwingLabelButtonDemoModel> {

    /**
     * Handle the button click. Note that no wiring
     * is required for this method; the name of the
     * method defines the purpose through convention
     * and the arguments are automatically provided
     * by the framework.<br>
     * Specifically, this method is the handler for
     * an AWT event. The event is "Clicked", which is
     * an alias for the native "actionPerformed" event.
     * The method is identified as an event handler
     * because the name of the method begins with "on".
     * It is identified as being a handler for a specific
     * view component because the name of the component
     * (from the SVWF file) comes before the name of the
     * event, separated by an underscore. The rest of
     * the name "Clicked" defines the event to listen for.
     * (In order to keep more natural camelCase syntax, the
     * name could be "onButton_Clicked" or "onButton_clicked").<br>
     * The model parameter is the currently active model.
     * The Spwing framework will associate this automatically
     * with the active model by class matching - the model has the
     * class {@link SpwingLabelButtonDemoModel}. The parameter
     * is optional, but is needed in this case. The parameter list
     * is very flexible for event methods; see the Spwing
     * documentation for more details.<br>
     * Since the compiler doesn't see that the method is
     * called (it is called via reflection), we suppress the
     * unused warnings.<br>     *
     * @param model The active model.
     */
    @SuppressWarnings("unused")
    public void onButton_Clicked( final SpwingLabelButtonDemoModel model) {

        // Change the text for the model
        model.setTextField("Button was clicked");
    }
}
