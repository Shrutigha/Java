public class UnboxingExample {
    public static void main(String[] args) {
        Integer intObj = 20;
        Double doubleObj = 15.75;
        Float floatObj = 8.2f;
        Long longObj = 200000L;
        Short shortObj = 100;
        Byte byteObj = 10;
        Character charObj = 'B';
        Boolean boolObj = false;

        int intValue = intObj;
        double doubleValue = doubleObj;
        float floatValue = floatObj;
        long longValue = longObj;
        short shortValue = shortObj;
        byte byteValue = byteObj;
        char charValue = charObj;
        boolean boolValue = boolObj;

        System.out.println("int Value: " + intValue);
        System.out.println("double Value: " + doubleValue);
        System.out.println("float Value: " + floatValue);
        System.out.println("long Value: " + longValue);
        System.out.println("short Value: " + shortValue);
        System.out.println("byte Value: " + byteValue);
        System.out.println("char Value: " + charValue);
        System.out.println("boolean Value: " + boolValue);
    }
}



OUTPUT:

float Value: 8.2
long Value: 200000
short Value: 100
byte Value: 10
char Value: B
boolean Value: false
