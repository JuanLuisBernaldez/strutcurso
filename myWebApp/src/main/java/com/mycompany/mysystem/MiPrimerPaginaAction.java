
package com.mycompany.mysystem;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.Conversion;


@Conversion()
public class MiPrimerPaginaAction extends ActionSupport {

    public String execute() throws Exception {
        return SUCCESS;
    }
}
