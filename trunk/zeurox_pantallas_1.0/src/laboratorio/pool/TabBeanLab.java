package laboratorio.pool;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.TabChangeEvent;

@ManagedBean(name="tabBeanLab")
public class TabBeanLab {
    public void onTabChange(TabChangeEvent event) {
        FacesMessage msg = new FacesMessage("Ventana", "" + event.getTab().getId());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
