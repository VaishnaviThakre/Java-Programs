public class OperatorPresedence {
  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    int c = 15;
    int d = 20;
    int e = 25;
    int f = 30;
    int g = 35;
    int h = 40;
    int i = 45;
    int j = 50;

    int result1 = a + b * c / d % e;
    int result2 = (a + b) * (c - d) % e;
    int result3 = ++f - --g * h++ / ++i % --j;

    System.out.println("The result of " + a + " + " + b + " * " + c + " / " + d + " % " + e + " is " + result1);
    System.out.println("The result of (" + a + " + " + b + ") * (" + c + " - " + d + ") % " + e + " is " + result2);
    System.out.println("The result of ++" + f + " - --" + g + " * " + h + "++ / ++" + i + " % --" + j + " is " + result3);
  }
}

