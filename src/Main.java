import animalspractice.*;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import passport.Passport;
import passport.PassportBase;
import product.Product;
import product.ProductList;
import product.Recipe;
import product.RecipeBook;
import transport.*;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Тренировка
        System.out.println("Тренировка");
        Cat.Breed brShBreed = new Cat.Breed(
                "Британская короткошерстная",
                "ВБ",
                Cat.Breed.HairType.SHORT
        );
        Cat murzik = new Cat("Мурзик");
        //*Cat.FavToy murzikFavToy = murzik.new FavToy("Рыбка", "заводная");
        //murzik.setToy(murzikFavToy);
        //System.out.println(murzikFavToy.getCatName());
        //murzik.age = 3;
        //murzik.meow();
        //System.out.println(murzik.getName());
        Cat begemot = new Cat("Бегемот", 5);
        //begemot.age = -5;
        //begemot.setName(null);
        //begemot.meow();
        //System.out.println("У кота " + murzik.name + " " + murzik.getFriends().length + " друзей");
        //System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
        //murzik.friends[0].meow();
        //System.out.println(Cat.getCount());
        //System.out.println();

        //murzik.talk();
        //murzik.eat();

        Dog sharik = new Dog("Шарик", 2005);
        //sharik.setAddress("random address");
        //Dog sharik2 = new Dog("Шарик",2005);
        //sharik2.setAddress("random address");
//
        //if (sharik.equals(sharik2)) {
        //    sharik2 = sharik;
        //}

        //sharik.talk();
        //sharik.eat();

        Parrot kesha = new Parrot("Кеша");
        //kesha.talk();

//        murzik.getFriends().add(begemot);
//        murzik.getFriends().add(sharik);
//        murzik.getFriends().add(kesha);

        /*for (Pet friend : murzik.getFriends()) {
            if (friend instanceof Cat) {
                Cat cat = (Cat) friend;
                cat.meow();
            } else if (friend.getClass() == Parrot.class) {
                try {
                    ((Parrot) friend).talk();
                } catch (CantTalkException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println(friend);
            }
        }

        for (int i = 0; i < murzik.getFriends().size(); i++) {
            murzik.getFriends().get(i);
        }*/

        //murzik.getFriends().remove(sharik);

        //System.out.println(murzik.getFriends().size());

        //Trained trained = new Trained();

        Tiger tiger = new Tiger();

        /*sharik.train("Апорт");
        sharik.train("Голос");
        sharik.train(TrainedCommand.CMD_SIT.name());
        sharik.train(TrainedCommand.CMD_LIE_DOWN.name());

        checkTrained(sharik);

        System.out.println();

        sharik.doCommand("Апорт");
        sharik.doCommand("Голос");
        sharik.doCommand("Сидеть");
        sharik.doCommand("Лежать");*/

        //sharik.train("апорт");
        //sharik.doCommand("апорт");

        /*Trainer<Dog> alex = new Trainer<>("Alex");
        alex.train(sharik);

        Trainer<Cat> mike = new Trainer<>("Mike");
        mike.train(murzik);

        Trainer bob = new Trainer<>("Bob");
        bob.train(tiger);
        bob.train(sharik);
        bob.train(murzik);*/

        Fish nemo = new Fish("Nemo");
        //nemo.talk();

        //talk(murzik, nemo, begemot, sharik);

//        Veterinarian<Cat> ivanIvanovich = new Veterinarian<>("Иван Иванович", "Старший ветеринар");
//        ivanIvanovich.addPatient(murzik);
//        ivanIvanovich.addPatient(begemot);
//
//        ivanIvanovich.treat();

        ArrayList<String> list = new ArrayList<>();
        list.add("Шарик");
        list.add("Тузик");
        list.add("Шарик");
        list.add("Пончик");
        list.add("Тузик");

        list.get(0);

        System.out.println(Arrays.toString(list.toArray()));

        Set<String> set = new HashSet<>();
        set.add("Шарик");
        set.add("Тузик");
        set.add("Шарик");
        set.add("Пончик");
        set.add("Тузик");
        set.add("Квардратик");
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("6");
        set.add("7");
        set.add("8");
        set.add("9");
        set.add("10");
        set.add("11");
        set.add("12");

        System.out.println(Arrays.toString(set.toArray()));

        murzik.getFriends().add(new Dog("Sharik"));
        murzik.getFriends().add(new Dog("Sharik"));
        murzik.getFriends().add(new Dog("Sharik"));
        murzik.getFriends().add(new Dog("Sharik"));

        System.out.println();

        for (Pet friend : murzik.getFriends()) {
            System.out.println(friend.getName());
        }
        System.out.println();

        // Задание 1-1
        System.out.println("Задание 1-1");

        Product banana = new Product("Банан");
        banana.setPrice(5.75);
        banana.setWeight(2.5);
        Product orange = new Product("Апельсин");
        orange.setPrice(6.44);
        orange.setWeight(1.02);
        Product kivi = new Product("КИВИ");
        kivi.setPrice(7.65);
        kivi.setWeight(1.85);
        Product grape = new Product("Грейпфрут");

        ProductList productsList = new ProductList();
        productsList.addProduct(banana);
        productsList.addProduct(orange);
        productsList.addProduct(kivi);

        System.out.println(productsList.getProductsList());

        productsList.checkProduct("Мандарин");
        productsList.checkProduct("Апельсин");

        productsList.removeProduct(kivi);

        System.out.println(productsList.getProductsList());

        productsList.removeProduct(grape);

        System.out.println();

        // Задание 2-1
        System.out.println("Задание 2-1");
        Recipe fruitSalad = new Recipe("Фруктовый салат");
        fruitSalad.addProductToRecipe(banana);
        fruitSalad.addProductToRecipe(orange);
        fruitSalad.addProductToRecipe(kivi);

        Product cucumber = new Product("Огурец");
        cucumber.setPrice(4.65);
        cucumber.setWeight(0.68);
        Product tomato = new Product("Помидор");
        tomato.setPrice(3.75);
        tomato.setWeight(0.85);
        Product lettuce = new Product("Лист салата");
        lettuce.setPrice(2.12);
        lettuce.setWeight(0.95);
        Recipe greenSalad = new Recipe(null);
        greenSalad.addProductToRecipe(cucumber);
        greenSalad.addProductToRecipe(tomato);
        greenSalad.addProductToRecipe(lettuce);
        Recipe mixSalad = new Recipe("");
        mixSalad.addProductToRecipe(cucumber);
        mixSalad.addProductToRecipe(tomato);
        mixSalad.addProductToRecipe(lettuce);

        System.out.println(fruitSalad);
        System.out.println(greenSalad);
        System.out.println(mixSalad);
        System.out.println();

        RecipeBook recipeBook = new RecipeBook();

        recipeBook.addRecipeToBook(fruitSalad);
        recipeBook.addRecipeToBook(greenSalad);
        recipeBook.addRecipeToBook(mixSalad);

        System.out.println(recipeBook);
        //recipeBook.addRecipeToBook(fruitSalad);

        // Задание 2-2
        System.out.println("Задание 2-2");
        // Сделал сам
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < 20) {
            numbers.add((int) (Math.random() * 1001));
        }
        System.out.println(numbers);

        Set<Integer> numberRemove = new HashSet<>();
        for (Integer integer : numbers) {
            if ((integer % 2) != 0) {
                numberRemove.add(integer);
            }
        }
        for (Integer integer : numberRemove) {
            numbers.remove(integer);
        }
        System.out.println(numbers);
        System.out.println();
        // Показали на разборе, повторил для тренировки
        Random random = new Random();
        Set<Integer> numbers1 = new HashSet<>();
        while (numbers1.size() < 20) {
            numbers1.add(random.nextInt(1000));
        }
        System.out.println(numbers1);
        Iterator<Integer> iterator = numbers1.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if ((number % 2) != 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers1);
        System.out.println();

        //Задание 3-1
        System.out.println("Задание 3-1");
        Car car1 = new Car(
                "Hyundai",
                "Solaris",
                2
        );
        car1.setBodyTypeName(BodyType.WAGON.name());
        Car car2 = new Car(
                "Kia",
                "",
                2.4
        );
        car2.setBodyTypeName("Кроссовер");
        Car car3 = new Car(
                "BMW",
                "Z8",
                3
        );

        Truck truck1 = new Truck(
                "Камаз",
                "54654",
                5.5
        );
        truck1.setLoadCapacity(LoadCapacity.N1);
        Truck truck2 = new Truck(
                "Hyundai",
                "A353",
                4.5
        );
        truck2.setLoadCapacity(LoadCapacity.N2);
        Truck truck3 = new Truck(
                "ВАЗ",
                "2152",
                3.5
        );
        Truck truck33 = new Truck(
                "ВАЗ",
                "2152",
                3.5
        );
        Bus bus1 = new Bus(
                "Scania",
                "A80 4x2",
                6
        );
        bus1.setCapacity(Capacity.ESPECIALLY_SMALL);
        Bus bus2 = new Bus(
                "Газ",
                "5292",
                5.0
        );
        bus2.setCapacity(Capacity.LARGE);
        Bus bus22 = new Bus(
                "Газ",
                "5292",
                5.0
        );
        bus2.setCapacity(Capacity.LARGE);
        Bus bus3 = new Bus(
                "МАЗ",
                "3432",
                4.5
        );

        DriverB dmitriev = new DriverB(
                "Дмитриев Дмитрий Дмитриевич",
                true,
                5,
                "B"
        );

        DriverC alexeev = new DriverC(
                "Алексеев Алексей Алексеевич",
                true,
                4,
                "C"
        );
        DriverD alexandrov = new DriverD(
                "Александров Александр Александрович",
                true,
                3,
                "D"
        );

        Sponsor redBull = new Sponsor(
                "Red Bull",
                200000
        );
        Sponsor shell = new Sponsor(
                "Shell",
                300000
        );
        Sponsor pirelli = new Sponsor(
                "Pirelli",
                -5
        );
        Sponsor pirelli1 = new Sponsor(
                "Pirelli",
                -5
        );

        Mechanic<Car> ivanov = new Mechanic<>(
                "Иванов",
                "Компания 1",
                Mechanic.Skills.CAR
        );
        Mechanic<Bus> petrov = new Mechanic<>(
                "Петров",
                "Компания 2",
                Mechanic.Skills.BUS
        );
        Mechanic<Transport> sidorov = new Mechanic<>(
                "Сидоров",
                "Компания 3",
                Mechanic.Skills.ANY
        );
        Mechanic<Transport> sidorov1 = new Mechanic<>(
                "Сидоров",
                "Компания 3",
                Mechanic.Skills.ANY
        );

        Set<Transport> transports = new HashSet<>();
        transports.add(car1);
        transports.add(bus2);
        transports.add(truck3);
        transports.add(bus22);
        transports.add(truck33);

        System.out.println(transports);
        System.out.println();

        car1.setDriverB(dmitriev);
        bus2.setDriverD(alexandrov);
        truck3.setDriverC(alexeev);

        car1.addSponsor(redBull);
        bus2.addSponsor(shell, redBull);
        truck3.addSponsor(pirelli);
        truck3.addSponsor(pirelli1);

        car1.addMechanic(ivanov, sidorov);
        bus2.addMechanic(petrov, sidorov);
        truck3.addMechanic(sidorov, sidorov);
        car1.addMechanic(sidorov1);

        for (Transport transport : transports) {
            printInfo(transport);
        }
        System.out.println();

        // Задание 1 - из обучения
//      Трансформируйте список механиков в map, где в качестве ключа будет автомобиль, а в качестве значения — механик,
//      который его обслуживает.
        System.out.println("Задание 1 - из обучения с платформы то что видно");
        Map<Transport, Set<Mechanic<?>>> newMechanic = new HashMap<>();
        newMechanic.put(car1,car1.getMechanics());
        newMechanic.put(bus2,bus2.getMechanics());
        newMechanic.put(truck3,truck3.getMechanics());
        System.out.println("Механики " + car1.getBrand() + " " + newMechanic.get(car1));
        System.out.println("Механики " + bus2.getBrand() + " " + newMechanic.get(bus2));
        System.out.println("Механики " + truck3.getBrand() + " " + newMechanic.get(truck3));
        System.out.println();

        // Задание 3-2
        System.out.println("Задание 3-2");
        Set<MultiplicationTable> tasks = new HashSet<>();
        while (tasks.size() < 15) {
            MultiplicationTable task = new MultiplicationTable((2 + (int) (Math.random() * 8)),(2 + (int) (Math.random() * 8)));
            tasks.add(task);
        }
        for (MultiplicationTable task : tasks) {
            System.out.println(task);
        }
        System.out.println();

        // Задание 3-3
        System.out.println("Задание 3-3");
        Passport ivanov654864 = new Passport(
                654864,
                "Иванов",
                "Иван",
                "Иванович",
                LocalDate.of(2007,01,04)
                );
        Passport alexeev516215 = new Passport(
                516215,
                "Алексеев",
                "Алексей",
                LocalDate.of(2006,10,20)
        );
        Passport andreev516215 = new Passport(
                516215,
                "Андреев",
                "Андрей",
                "Андреевич",
                LocalDate.of(2000,1,28)
        );
        Passport alexandrov651571 = new Passport(
                651571,
                "Александров",
                "Александр",
                "Александрович",
                LocalDate.of(2005,12,30)
        );

        PassportBase passportBase = new PassportBase();
        passportBase.createNewPassport(ivanov654864);
        passportBase.createNewPassport(alexeev516215);

        System.out.println(passportBase.getPassport(654864));;
        System.out.println(passportBase.getPassport(516215));;
        System.out.println(passportBase.getPassport(651571));;

        passportBase.createNewPassport(andreev516215);
        System.out.println(passportBase.getPassport(516215));;
        System.out.println();

        // Задание 3-4
/*        Ответ на задание 3-4 : HashSet
        В случае с List-ами поиск и сравнение идет по объектам сравнивая каждый объект через метод equals c каждым
        объектом списка + итерация происходит по ссылкам на объекты проходя каждый объект каждого списка, то есть
        метод containsAll использует цикл в цикле в случае со списками.
        В случае с HashSet поиск и сравнение идет по хэш-кодам объектов а не самим объектам, что значительно упрощает
        и ускоряет поиск, так как сравнить хэш-коды гораздо быстрее чем сами объекты, которые могут иметь еще много
        полей например, то есть сравнить одно значение гораздо быстрее чем несколько значений + метод containsAll не
        итерируется путем цикла в цикле, а использует способ ускоренного поиска, оптимизируя шаги для поиска, а также в
        случае с HashSet не может быть коллизий */
    }

    public static void printInfo(Transport transport) {
        System.out.println("У транспортного средства " + transport.getBrand() +
                "\n Водитель - " + transport.getDriver() +
                "\n Спонсоры - " + transport.getSponsors() +
                "\n Механики - " + transport.getMechanics());
    }
}