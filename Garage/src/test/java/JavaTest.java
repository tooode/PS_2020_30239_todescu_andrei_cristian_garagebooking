import architecture.*;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;

public class JavaTest {
    @Mock
    AdminOP adminOP;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    private Facade facade;

    @Test
    public void testAllCars(){
        facade.getAllCars();
        verify(adminOP).getAllCars();
    }
}
