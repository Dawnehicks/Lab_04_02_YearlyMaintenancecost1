public class yearlyCost {
    public static void main(String[] args) {
        double springCost=21.93;// double is anything wiht currency and this can be changed
        System.out.println("The maintenance cost for spring is $"+springCost+".");//each of these just repeat the totals in the program
        double summmerCost= 35.25;
        System.out.println("The maintenance cost for summer is $"+summmerCost+".");
        double fallCost=22.16;
        System.out.println("The maintenance cost for fall is $"+fallCost+".");
        double winterCost=36.09;
        System.out.println("The maintenance cost for winter is $"+winterCost+".");
        double totalCost= springCost+springCost+fallCost+winterCost;// total added all together
        System.out.println("Total cost of the maintenance fee for the all four seasons is $"+totalCost+".");//outputwith final total

    }
}