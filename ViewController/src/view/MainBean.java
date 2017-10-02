package view;

import java.util.Map;

import oracle.adf.view.rich.context.AdfFacesContext;

public class MainBean {
    public MainBean() {
        super();
    }
    
    public void putValue(String input){
        Map pfs = AdfFacesContext.getCurrentInstance().getPageFlowScope();
        pfs.put("inOperationType", input);
    }
    
}
