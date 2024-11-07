import java.util.Scanner;

int strawberryPrice = 80;
int chocolatePrice = 41;
int vanillaPrice = 21;

Scanner scanner = new Scanner(System.in);

System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
String flavour = scanner.nextLine().trim();

int scoopPrice;

if (flavour.equals("v")) {
    scoopPrice = vanillaPrice;
} else if (flavour.equals("c")) {
    scoopPrice = chocolatePrice;
} else if (flavour.equals("s")) {
    scoopPrice = strawberryPrice;
} else {
    System.out.println("We don't have that flavour.");
    return;
}

System.out.println("How many scoops would you like?");
int scoops = scanner.nextInt();
scanner.nextLine();

if (scoops >= 1 && scoops <= 3) {
    int totalPrice = 100 + scoopPrice * scoops;
    System.out.printf("That will be %.2f please.%n", totalPrice / 100.0);
} else if (scoops > 3) {
    System.out.println("That's too many scoops to fit in a cone.");
} else {
    System.out.println("We don't sell just a cone.");
}

scanner.close();
