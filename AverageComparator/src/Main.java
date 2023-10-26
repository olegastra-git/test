import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static class AverageComparator {
        public static String compareAverages(List<Integer> values1, List<Integer> values2) {
            if (values1.isEmpty() || values2.isEmpty()) {
                return "error - vvedite chislo";
            }

            double average1 = calculateAverage(values1);
            double average2 = calculateAverage(values2);

            if (average1 > average2) {
                return "1 spisok imeet bolshee srednee znachenie";
            } else if (average1 < average2) {
                return "2 spisok imeet bolshee srednee znachenie";
            } else {
                return "srednie znacheniya ravni";
            }
        }

        private static double calculateAverage(List<Integer> list) {
            if (list.isEmpty()) {
                return 0;
            }

            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            return (double) sum / list.size();
        }
    }

    public static class AverageComparatorTest {
        @Test
        public void testCompareAverages_FirstListGreater() {
            List<Integer> list1 = Arrays.asList(1, 2, 3);
            List<Integer> list2 = Arrays.asList(1, 2);
            String result = AverageComparator.compareAverages(list1, list2);
            Assertions.assertEquals("1 spisok imeet bolshee srednee znachenie", result);
        }

        @Test
        public void testCompareAverages_SecondListGreater() {
            List<Integer> list1 = Arrays.asList(1, 2);
            List<Integer> list2 = Arrays.asList(1, 2, 3);
            String result = AverageComparator.compareAverages(list1, list2);
            Assertions.assertEquals("2 spisok imeet bolshee srednee znachenie", result);
        }

        @Test
        public void testCompareAverages_AveragesEqual() {
            List<Integer> list1 = Arrays.asList(1, 2, 3);
            List<Integer> list2 = Arrays.asList(3, 2, 1);
            String result = AverageComparator.compareAverages(list1, list2);
            Assertions.assertEquals("srednie znacheniya ravni", result);
        }
    }

}
