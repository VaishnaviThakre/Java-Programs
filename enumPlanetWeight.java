import java.util.Scanner;

public class enumPlanetWeight {
    enum Planet {
        MERCURY (3.303e+23, 2.4397e6),
        VENUS   (4.869e+24, 6.0518e6),
        EARTH   (5.976e+24, 6.37814e6),
        MARS    (6.421e+23, 3.3972e6),
        JUPITER (1.9e+27,   7.1492e7),
        SATURN  (5.688e+26, 6.0268e7),
        URANUS  (8.686e+25, 2.5559e7),
        NEPTUNE (1.024e+26, 2.4746e7);

        private final double mass;   // in kilograms
        private final double radius; // in meters
        private final double surfaceGravity; // in m/s^2

        // Universal gravitational constant in m^3/(kg s^2)
        private static final double G = 6.67300E-11;

        // Constructor
        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
            surfaceGravity = G * mass / (radius * radius);
        }

        public double mass() {
            return mass;
        }

        public double radius() {
            return radius;
        }

        public double surfaceGravity() {
            return surfaceGravity;
        }

        public double surfaceWeight(double otherMass) {
            return otherMass * surfaceGravity;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = in.nextDouble();
        System.out.print("Enter the planet you want to fight on: ");
        String planetName = in.next().toUpperCase();
        Planet planet = Planet.valueOf(planetName);
        System.out.printf("Your weight on %s is %f N%n", planetName, planet.surfaceWeight(weight));
    }
}


