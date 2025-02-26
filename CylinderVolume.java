public class CylinderVolume {
    public static void main(String[] args) {
        double volume = calculateCylinderVolume(2, 3);
        System.out.println("Об'єм циліндра: " + volume);
    }
    /* Напишіть метод, який приймає два аргументи типу double - радіус та висоту -
     і повертає об'єм циліндра. Виведіть об'єм циліндра на екран.
     */
    public static double calculateCylinderVolume(double radius, double height) {
        double CylinderVolume = Math.PI * Math.pow(radius, 2) * height;
        return CylinderVolume;
    }
}
