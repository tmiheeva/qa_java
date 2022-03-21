import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionFelineTest {

    @Mock
    Feline feline;

    @Test
    public void lionGetKittensCorrect(){
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittens = lion.getKittens();
        int expectedKittens = 1;
        assertEquals("Некорректное количество котят", expectedKittens, actualKittens);
    }

    @Test
    public void lionGetFoodCorrect() throws Exception {
        Lion lion = new Lion(feline);
        List<String> list = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(list);
        List<String> actualLionFood = lion.getFood();
        List<String> expectedLionFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Некорректный список еды для льва", expectedLionFood, actualLionFood);

    }
}
