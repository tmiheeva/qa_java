import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getCatSoundCorrect(){
        Cat cat =new Cat(feline);
        String actualCatSound = cat.getSound();
        String expectedCatSound = "Мяу";
        assertEquals("Некорректный звук для котика", expectedCatSound, actualCatSound);
    }

    @Test
    public void getCatGetFoodCorrect() throws Exception {
        Cat cat =new Cat(feline);
        List<String> list = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(list);
        List<String> actualCatFood = cat.getFood();
        List<String> expectedCatFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Некорректный список еды для котика", expectedCatFood, actualCatFood);
    }
}
