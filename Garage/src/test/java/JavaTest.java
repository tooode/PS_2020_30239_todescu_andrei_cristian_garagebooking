import architecture.*;
import model.Mechanic;
import model.User;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

public class JavaTest {
    @Mock
    AdminOP adminOP;
    ClientOp clientOP;

    @Before
    public void init(){

        facade = new Facade(adminOP, clientOP);
    }

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    private Facade facade;

    @Test
    public void testAllCars(){
        facade.getAllCars();
        verify(adminOP).getAllCars();
    }

    @Test
    public void testAllClients(){
        facade.getAllClients();
        verify(adminOP).getAllClients();
    }

    @Test
    public void testObservable(){
        GarageObserver obs = new GarageObserver();
        Mechanic mec = new Mechanic();
        obs.addObserver(mec);
        obs.setMsg("A intart o masina in service!");

        assertEquals(mec.getMessage(), "A intart o masina in service!");
    }

    @Test
    public void testFactoryAdmin(){
        Factory fct = new Factory();
        User user = fct.createAccount(999,"Admin",true,0,"07ADMIN","Admin");
        assertEquals("Admin", user.getType());
    }

    @Test
    public void testFactoryClient(){
        Factory fct = new Factory();
        User user = fct.createAccount(100,"Client",true,0,"07CLIENT","Client");
        assertEquals("Client", user.getType());
    }
}
