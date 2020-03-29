package service;

import architecture.Facade;
import bll.AdminBLL;
import bll.ClientBLL;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    AdminBLL adminBLL;
    ClientBLL clientBLL;
    Facade info;

    public BaseController() {
        this.adminBLL = new AdminBLL();
        this.clientBLL = new ClientBLL();
        this.info = new Facade(adminBLL, clientBLL);
    }
}
