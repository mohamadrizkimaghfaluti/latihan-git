public class DataTypeInJava{

  static String dataString;
  static char dataChar;
  static int dataInt;
  static double dataDouble;
  static float dataFloat;
  static boolean dataBoolean;

  public static void main(String[]args){

    DataTypeInJava.setString("Mohamad Rizki Maghfaluti");
    DataTypeInJava.setChar('r');
    DataTypeInJava.setInt(24081996);
    DataTypeInJava.setDouble(100.000);
    DataTypeInJava.setFloat(10000);
    DataTypeInJava.setBoolean(1 == 1);

    System.out.println("Ini Data String: " + DataTypeInJava.getString());
    System.out.println("Ini Data char: " + DataTypeInJava.getChar());
    System.out.println("Ini Data int: " + DataTypeInJava.getInt());
    System.out.println("Ini Data double: " + DataTypeInJava.getDouble());
    System.out.println("Ini Data float: " + DataTypeInJava.getFloat());
    System.out.println("Ini Data boolean: " + DataTypeInJava.getBoolean());

  }
  public static void setString(String ddataString){
    dataString = ddataString;
  }
  public static String getString(){
    return dataString;
  }

  public static void setChar(char ddataChar){
    dataChar = ddataChar;
  }
  public static char getChar(){
    return dataChar;
  }

  public static void setInt(int ddataInt){
    dataInt = ddataInt;
  }
  public static int getInt(){
    return dataInt;
  }

  public static void setDouble(double ddataDouble){
    dataDouble = ddataDouble;
  }
  public static double getDouble(){
    return dataDouble;
  }

  public static void setFloat(float ddataFloat){
    dataFloat = ddataFloat;
  }
  public static float getFloat(){
    return dataFloat;
  }

  public static void setBoolean(boolean ddataBoolean){
    dataBoolean = ddataBoolean;
  }
  public static boolean getBoolean(){
    return dataBoolean;
  }
}