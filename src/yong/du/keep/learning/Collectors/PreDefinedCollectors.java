package yong.du.keep.learning.Collectors;

import yong.du.keep.learning.Dish;

import java.util.*;

import static java.util.stream.Collectors.*;
import static yong.du.keep.learning.Dish.menu;

public class PreDefinedCollectors {
    public static void main(String ... args) {
        // using collector
        long howManyDishes = menu.stream().collect(counting());

        // using count
        long howManyDishesByCount = menu.stream().count();
        System.out.println("number of dishes in menu is " + howManyDishes + " ( by collector)");
        System.out.println("number of dishes in menu is " + howManyDishesByCount +  " ( by count())");

        // get Max and Min in stream
        Comparator<Dish>  dishCaloriesComparator = Comparator.comparing(Dish::getCalories);
        Optional<Dish> mostCalrorieDish = menu.stream().collect(maxBy(dishCaloriesComparator));
        Optional<Dish> leastCalorieDish = menu.stream().collect(minBy(dishCaloriesComparator));
        System.out.println("the most calories dish in menu is " + mostCalrorieDish.get());
        System.out.println("the least calories dish in menu is " + leastCalorieDish.get());


        // summing
        int totalCalories = menu.stream().collect(summingInt(Dish::getCalories));
        double totalCaloriesTypeDouble = menu.stream().collect(summingDouble(Dish::getCalories));
        long totalCaloriesTypeLong = menu.stream().collect(summingLong(Dish::getCalories));
        System.out.println("total calories in menu is  " + totalCalories + "(return value type is int)");
        System.out.println("total calories in menu is  " + totalCaloriesTypeDouble + "(return value type is double)");
        System.out.println("total calories in menu is  " + totalCaloriesTypeLong + "(return value type is long)");

        // averaging
        double avgCalories = menu.stream().collect(averagingDouble(Dish::getCalories));
        System.out.println("average calories in menu is  " + avgCalories + "(return value type is double)");

        // summarizing
        IntSummaryStatistics menuStatistics = menu.stream().collect(summarizingInt(Dish::getCalories));
        System.out.println("the menu statistics are  " + menuStatistics);

        // joining
        String shortMenu = menu.stream().map(Dish::getName).collect(joining(", "));
        System.out.println("the short menu is  " + shortMenu);

        // grouping
        Map<Dish.Type, List<Dish>> dishesByType = menu.stream().collect(groupingBy(Dish::getType));
        System.out.println("type of dish is  " + dishesByType);

        // partioning
        Map<Boolean ,Map<Dish.Type, List<Dish>>> vegetarianDishesByType =
                menu.stream().collect(
                        partitioningBy(Dish::isVegetarian,
                                groupingBy(Dish::getType))
                );
        System.out.println("partitioned by isVegentarian " + vegetarianDishesByType);

        Map<Boolean, Dish> mostCaloricPartitionedByVegetarian =
                menu.stream().collect(
                  partitioningBy(Dish::isVegetarian,
                          collectingAndThen(
                                  maxBy(Comparator.comparingInt(
                                  Dish::getCalories)),Optional::get
                          )
                  )
                );
        System.out.println("most caloric dish that partitioned by isVegentarian " + mostCaloricPartitionedByVegetarian);


        // toList and toListCollector()
        List<Dish> dishesByBuiltInCollector = menu.stream().collect(toList());
        List<Dish> dishesBySelfDesfinedCollector = menu.stream().collect(new ToListCollector<>());
        System.out.println("Dishes by build in collector" + dishesByBuiltInCollector);
        System.out.println("Dishes by self defined collector" + dishesBySelfDesfinedCollector);
    }
}
