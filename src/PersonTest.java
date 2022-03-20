import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    public void PersonTest() {

        boolean result = true;
        int checkint = 0;
        int i = 0; //индексный элемент
        int iMax = 100; //количество попыток

        while(i<iMax)
        {
            //тест корректных значений от 13 до 19 лет
            checkint = getRandomNumber(13,19);
            result = Person.isTeenager(checkint);
            System.out.println("Пробуемое значение: "+checkint);
            assertEquals("Ожидаемое значение: ", true, result);
            i++;
        }

        System.out.println("==== Следующий тест значений меньше верного диапазона ====");
        i=0;
        while(i<iMax)
        {
            //тест значений меньше верного диапазона
            checkint = getRandomNumber(1,13);
            result = Person.isTeenager(checkint);
            System.out.println("Пробуемое значение: "+checkint);
            assertEquals("Ожидаемое значение: ", false, result);
            i++;
        }

        System.out.println("==== Следующий тест значений больше верного диапазона ====");
        i=0;
        while(i<iMax)
        {
            //тест значений больше верного диапазона
            checkint = getRandomNumber(20,100);
            result = Person.isTeenager(checkint);
            System.out.println("Пробуемое значение: "+checkint);
            assertEquals("Ожидаемое значение: ", false, result);
            i++;
        }

            /*тест значений некорректных значений
            checkint = 0; //-1, 120,-100 и т.п.
            result = Person.isTeenager(checkint);
            System.out.println("Пробуемое значение: "+checkint);
            assertEquals("Ожидаемое значение: ", true, result);*/

    }
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max+1 - min)) + min);
    }

    public static void main(String[] args) {
        PersonTest TestObj = new PersonTest();
        TestObj.PersonTest();
    }
}
