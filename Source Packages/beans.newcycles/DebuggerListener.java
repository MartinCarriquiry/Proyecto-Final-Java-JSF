package beans.helper;

import beans.model.Colonia;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;


package beans.lifecycle;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class DebuggerListener implements javax.faces.event.PhaseListener{
    
    Logger log = LogManager.getRootLogger();
   
    @Override
    public void beforePhase(PhaseEvent pe) {
        if(log.isInfoEnabled())
            log.info("Antes de la fase:" + pe.getPhaseId().toString());
        
    }
    
    @Override
    public void afterPhase(PhaseEvent pe) {
        if(log.isInfoEnabled())
            log.info("Despues de la fase" + pe.getPhaseId().toString());
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
}
