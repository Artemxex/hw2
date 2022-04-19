public class Main {
    public static void main(String[] args) {
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Ещё можно положить "  + capacityLeft +  " кг вещей");

        var appleWeight = 2;
        var orangeWeight = 3;
        var fruitWeight = appleWeight + orangeWeight;
        System.out.println("Общий вес фруктов " + fruitWeight);
        var meatWeigt = 4;
        var waterWeigt = 5;
        var tomatoWeigt = 2;
        var cucumberWeigt = 2;
        var pepperWeigt = 2;
        var zucciniWeigt = 2;
        var vegetableWeigt = tomatoWeigt + cucumberWeigt + zucciniWeigt + pepperWeigt;
        var productsWeigt = vegetableWeigt + fruitWeight + meatWeigt + waterWeigt;
        System.out.println("Общий вес продуктов " + productsWeigt + " кг");

        var leftWeigt = liftingCapacity - stuffWeight - productsWeigt;
        System.out.println("Осталось места " + leftWeigt + " кг!");

        productsWeigt = productsWeigt * 2;
        System.out.println("Теперь вес продуктов " + productsWeigt);

        leftWeigt = liftingCapacity - stuffWeight - productsWeigt;
        System.out.println("Теперь места осталось " + leftWeigt + " кг!");

        var overload = (stuffWeight + productsWeigt) % liftingCapacity;
        System.out.println("Перегруз на " + overload + " кг!");

        var productsInOneCar = productsWeigt / 2;
        System.out.println("Продуктов в одной машине теперь " + productsInOneCar + " кг");

        short bananas = 200;
        System.out.println("Бананов " + bananas + " кг");

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("Одна порция весит " + onePortion + " кг");

        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println(d);

        float g = a +1f;
        System.out.println(g);

    }
}