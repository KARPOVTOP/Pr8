package ru.mirea.pr8;

public class Tester {

    public static void main(String[] args) {

        System.out.println("--------------------------- 1 ---------------------------");

        WaitList<Integer> list = new WaitList<>();

        System.out.println("isEmpty?   " + list.isEmpty());

        list.add(5);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(1);
        list.add(23);

        System.out.println("isEmpty?   " + list.isEmpty());

        System.out.println(list);

        list.remove();
        list.remove();
        list.remove();

        System.out.println(list);

        System.out.println("--------------------------- 2 ---------------------------");

        BoundedWaitList<Integer> list2 = new BoundedWaitList<>(5);

        System.out.println("isEmpty?   " + list2.isEmpty());

        list2.add(5);
        list2.add(2);
        list2.add(4);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(9);
        list2.add(1);
        list2.add(23);

        System.out.println("isEmpty?   " + list2.isEmpty());

        System.out.println(list2);

        list2.remove();
        list2.remove();
        list2.remove();

        System.out.println(list2);

        System.out.println("--------------------------- 3 ---------------------------");

        UnfairWaitList<Integer> list3 = new UnfairWaitList<>();

        System.out.println("isEmpty?   " + list3.isEmpty());

        list3.add(5);
        list3.add(2);
        list3.add(4);
        list3.add(4);
        list3.add(5);
        list3.add(6);
        list3.add(9);
        list3.add(1);
        list3.add(23);

        System.out.println("isEmpty?   " + list3.isEmpty());

        System.out.println(list3);

        list3.remove(4);
        list3.remove(5);
        list3.remove(9);

        System.out.println(list3);
    }
}
