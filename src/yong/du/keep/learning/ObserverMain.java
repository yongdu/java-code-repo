package yong.du.keep.learning;

import java.util.ArrayList;
import java.util.List;


public class ObserverMain {

    public static void main(String[] args) {
        // old school way
        Feed f = new Feed();
        f.registerObserver(new DN());
        f.registerObserver(new Guardian());
        f.registerObserver(new LeMonde());
        f.notifyObservers("The queen said her favourite book is Java 8 in Action!");
        f.notifyObservers("The queen said her favourite wine cost a lot money");

        // lambda way
        Feed feedLambda = new Feed();

        feedLambda.registerObserver((String tweet) -> {
            if(tweet != null && tweet.contains("football")){
                System.out.println("Breaking news in WorldCup! " + tweet); }
        });
        feedLambda.registerObserver((String tweet) -> {
            if(tweet != null && tweet.contains("Sweden")){
                System.out.println("Big news in Sweden... " + tweet); }
        });
        feedLambda.registerObserver((String tweet) -> {
            if(tweet != null && tweet.contains("semifinal")){
                System.out.println("Big news in for national team... " + tweet); }
        });

        feedLambda.notifyObservers("Sweden national football team misses the chance to semifinal ");
        feedLambda.notifyObservers("Sweden is .. ");

    }


    interface Observer{
        void inform(String tweet);
    }

    interface Subject{
        void registerObserver(Observer o);
        void notifyObservers(String tweet);
    }

    static private class DN implements Observer{
        @Override
        public void inform(String tweet) {
            if(tweet != null && tweet.contains("money")){
                System.out.println("Breaking news in NY!" + tweet);
            }
        }
    }

    static private class Guardian implements Observer{
        @Override
        public void inform(String tweet) {
            if(tweet != null && tweet.contains("queen")){
                System.out.println("Yet another news in London... " + tweet);
            }
        }
    }

    static private class LeMonde implements Observer{
        @Override
        public void inform(String tweet) {
            if(tweet != null && tweet.contains("wine")){
                System.out.println("Today cheese, wine and news! " + tweet);
            }
        }
    }

    static private class Feed implements Subject{
        private final List<Observer> observers = new ArrayList<>();
        public void registerObserver(Observer o) {
            this.observers.add(o);
        }
        public void notifyObservers(String tweet) {
            observers.forEach(o -> o.inform(tweet));
        }
    }

}
