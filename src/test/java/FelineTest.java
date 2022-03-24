import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    @Test
    public void getFelineEatMeetCorrect() throws Exception {
        Feline feline = new Feline();
        List<String> actualFood = feline.eatMeat();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Некорректный список еды для хищника", expectedFood, actualFood);

    }

    @Test
    public void getFelineFamilyCorrectValue(){
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        String expectedFamily = "Кошачьи";
        assertEquals("Некорректное семейство", expectedFamily, actualFamily);
    }
    @Test
    public void getFelineKittensCorrectValue(){
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens(2);
        int expectedKittensCount = 2;
        assertEquals("Некорректное количество котят", expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getFelineKittensCorrect(){
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens();
        int expectedKittensCount = 1;
        assertEquals("Некорректное количество котят", expectedKittensCount, actualKittensCount);
    }

}
