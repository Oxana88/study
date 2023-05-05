import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Program {
   
    public static void main(String[] args) throws IOException{
 HashMap<String, Integer> romanToArabic = new HashMap<>();

        romanToArabic.put("I",1);
        romanToArabic.put("II",2);
        romanToArabic.put("III",3);
        romanToArabic.put("IV",4);
        romanToArabic.put("V",5);
        romanToArabic.put("VI",6);
        romanToArabic.put("VII",7);
        romanToArabic.put("VIII",8);
        romanToArabic.put("IX",9);
        romanToArabic.put("X",10);
        romanToArabic.put("XI",11);
        romanToArabic.put("XII",12);
        romanToArabic.put("XIII",13);
        romanToArabic.put("XIV",14);
        romanToArabic.put("XV",15);
        romanToArabic.put("XVI",16);
        romanToArabic.put("XVII",17);
        romanToArabic.put("XVIII",18);
        romanToArabic.put("XIX",19);
        romanToArabic.put("XX",20);
        romanToArabic.put("XXI",21);
        romanToArabic.put("XXII",22);
        romanToArabic.put("XXIII",23);
        romanToArabic.put("XXIV",24);
        romanToArabic.put("XXV",25);
        romanToArabic.put("XXVI",26);
        romanToArabic.put("XXVII",27);
        romanToArabic.put("XXVIII",28);
        romanToArabic.put("XXIX",29);
        romanToArabic.put("XXX",30);
        romanToArabic.put("XXXI",31);
        romanToArabic.put("XXXII",32);
        romanToArabic.put("XXXIII",33);
        romanToArabic.put("XXXIV",34);
        romanToArabic.put("XXXV",35);
        romanToArabic.put("XXXVI",36);
        romanToArabic.put("XXXVII",37);
        romanToArabic.put("XXXVIII",38);
        romanToArabic.put("XXXIX",39);
        romanToArabic.put("XXXX",40);
        romanToArabic.put("XXXXI",41);
        romanToArabic.put("XXXXII",42);
        romanToArabic.put("XXXXIII",43);
        romanToArabic.put("XXXXIV",44);
        romanToArabic.put("XXXXV",45);
        romanToArabic.put("XXXXVI",46);
        romanToArabic.put("XXXXVII",47);
        romanToArabic.put("XXXXVIII",48);
        romanToArabic.put("XXXXIX",49);
        romanToArabic.put("L",50);
        romanToArabic.put("LI",51);
        romanToArabic.put("LII",52);
        romanToArabic.put("LIII",53);
        romanToArabic.put("LIV",54);
        romanToArabic.put("LV",55);
        romanToArabic.put("LVI",56);
        romanToArabic.put("LVII",57);
        romanToArabic.put("LVIII",58);
        romanToArabic.put("LIX",59);
        romanToArabic.put("L",50);
        romanToArabic.put("LI",51);
        romanToArabic.put("LII",52);
        romanToArabic.put("LIII",53);
        romanToArabic.put("LIV",54);
        romanToArabic.put("LV",55);
        romanToArabic.put("LVI",56);
        romanToArabic.put("LVII",57);
        romanToArabic.put("LVIII",58);
        romanToArabic.put("LIX",59);
        romanToArabic.put("LX",60);
        romanToArabic.put("LXI",61);
        romanToArabic.put("LXII",62);
        romanToArabic.put("LXIII",63);
        romanToArabic.put("LXIV",64);
        romanToArabic.put("LXV",65);
        romanToArabic.put("LXVI",66);
        romanToArabic.put("LXVII",67);
        romanToArabic.put("LXVIII",68);
        romanToArabic.put("LXIX",69);
        romanToArabic.put("LXX",70);
        romanToArabic.put("LXXI",71);
        romanToArabic.put("LXXII",72);
        romanToArabic.put("LXXIII",73);
        romanToArabic.put("LXXIV",74);
        romanToArabic.put("LXXV",75);
        romanToArabic.put("LXXVI",76);
        romanToArabic.put("LXXVII",77);
        romanToArabic.put("LXXVIII",78);
        romanToArabic.put("LXXIX",79);
        romanToArabic.put("LXXX",80);
        romanToArabic.put("LXXXI",81);
        romanToArabic.put("LXXXII",82);
        romanToArabic.put("LXXXIII",83);
        romanToArabic.put("LXXXIV",84);
        romanToArabic.put("LXXXV",85);
        romanToArabic.put("LXXXVI",86);
        romanToArabic.put("LXXXVII",87);
        romanToArabic.put("LXXXVIII",88);
        romanToArabic.put("XC",90);
        romanToArabic.put("XCI",91);
        romanToArabic.put("XCII",92);
        romanToArabic.put("XCIII",93);
        romanToArabic.put("XCIV",94);
        romanToArabic.put("XCV",95);
        romanToArabic.put("XCVI",96);
        romanToArabic.put("XVCII",97);
        romanToArabic.put("XVCIII",98);
        romanToArabic.put("XCIX",99);
        romanToArabic.put("C",100);

        HashMap<Integer, String> arabicToRoman = new HashMap<>();

        arabicToRoman.put(1,"I");
        arabicToRoman.put(2,"II");
        arabicToRoman.put(3,"III");
        arabicToRoman.put(4,"IV");
        arabicToRoman.put(5,"V");
        arabicToRoman.put(6,"VI");
        arabicToRoman.put(7,"VII");
        arabicToRoman.put(8,"VIII");
        arabicToRoman.put(9,"IX");
        arabicToRoman.put(10,"X");
        arabicToRoman.put(11,"XI");
        arabicToRoman.put(12,"XII");
        arabicToRoman.put(13,"XIII");
        arabicToRoman.put(14,"XIV");
        arabicToRoman.put(15,"XV");
        arabicToRoman.put(16,"XVI");
        arabicToRoman.put(17,"XVII");
        arabicToRoman.put(18,"XVIII");
        arabicToRoman.put(19,"XIX");
        arabicToRoman.put(20,"XX");
        arabicToRoman.put(21,"XXI");
        arabicToRoman.put(22,"XXI");
        arabicToRoman.put(23,"XXIII");
        arabicToRoman.put(24,"XXIV");
        arabicToRoman.put(25,"XXV");
        arabicToRoman.put(26,"XXVI");
        arabicToRoman.put(27,"XXVII");
        arabicToRoman.put(28,"XXVIII");
        arabicToRoman.put(29,"XXIX");
        arabicToRoman.put(30,"XXX");
        arabicToRoman.put(31,"XXXI");
        arabicToRoman.put(32,"XXXXII");
        arabicToRoman.put(33,"XXXIII");
        arabicToRoman.put(34,"XXXIV");
        arabicToRoman.put(35,"XXXV");
        arabicToRoman.put(36,"XXXVI");
        arabicToRoman.put(37,"XXXVII");
        arabicToRoman.put(38,"XXXVIII");
        arabicToRoman.put(39,"XXXIX");
        arabicToRoman.put(40,"XXXX");
        arabicToRoman.put(41,"XXXXI");
        arabicToRoman.put(42,"XXXXII");
        arabicToRoman.put(43,"XXXXIII");
        arabicToRoman.put(44,"XXXXIV");
        arabicToRoman.put(45,"XXXXV");
        arabicToRoman.put(46,"XXXXVI");
        arabicToRoman.put(47,"XXXIV");
        arabicToRoman.put(48,"XXXV");
        arabicToRoman.put(49,"XXXVI");
        arabicToRoman.put(50,"L");
        arabicToRoman.put(51,"LI");
        arabicToRoman.put(52,"LII");
        arabicToRoman.put(53,"LIII");
        arabicToRoman.put(54,"LIV");
        arabicToRoman.put(55,"LV");
        arabicToRoman.put(56,"LVI");
        arabicToRoman.put(57,"LVII");
        arabicToRoman.put(58,"LVIII");
        arabicToRoman.put(59,"LIX");
        arabicToRoman.put(60,"LX");
        arabicToRoman.put(61,"LXI");
        arabicToRoman.put(62,"LXII");
        arabicToRoman.put(63,"LXIII");
        arabicToRoman.put(64,"LXIV");
        arabicToRoman.put(65,"LXV");
        arabicToRoman.put(66,"LXVI");
        arabicToRoman.put(67,"LXVII");
        arabicToRoman.put(68,"LXVIII");
        arabicToRoman.put(69,"LXIX");
        arabicToRoman.put(70,"LXX");
        arabicToRoman.put(71,"LXXI");
        arabicToRoman.put(72,"LXXII");
        arabicToRoman.put(73,"LXXIII");
        arabicToRoman.put(74,"LXXIV");
        arabicToRoman.put(75,"LXXV");
        arabicToRoman.put(76,"LXXVI");
        arabicToRoman.put(77,"LXXVII");
        arabicToRoman.put(78,"LXXVIII");
        arabicToRoman.put(79,"LXXIX");
        arabicToRoman.put(80,"LXXX");
        arabicToRoman.put(81,"LXXXI");
        arabicToRoman.put(82,"LXXXII");
        arabicToRoman.put(83,"LXXXIII");
        arabicToRoman.put(84,"LXXXIV");
        arabicToRoman.put(85,"LXXXV");
        arabicToRoman.put(86,"LXXXVI");
        arabicToRoman.put(87,"LXXXVII");
        arabicToRoman.put(88,"LXXXVIII");
        arabicToRoman.put(89,"LXXXIX");
        arabicToRoman.put(90,"XC");
        arabicToRoman.put(91,"XCI");
        arabicToRoman.put(92,"XCII");
        arabicToRoman.put(93,"XCIII");
        arabicToRoman.put(94,"XCIV");
        arabicToRoman.put(95,"XCV");
        arabicToRoman.put(96,"XCVI");
        arabicToRoman.put(97,"XCVII");
        arabicToRoman.put(98,"XCVIII");
        arabicToRoman.put(99,"XCIX");
        arabicToRoman.put(100,"C");
 System.out.println("_________________________");
 System.out.println("ЭТО ПРОГРАММА КАЛЬКУЛЯТОР");
 System.out.println();
 System.out.println("Cчитает математические выражения");
 System.out.println("с 1 операцией (+, -, *, /)");
 System.out.println("для целых числ от 0 до 10,");
 System.out.println("принимает арабские и римские цифры.");
 System.out.println("Успешных рассчетов!");
 System.out.println("_________");
 int num1, num2, sum, sub, mul, div;
 String sumRom, subRom, mulRom, divRom;
 Scanner text = new Scanner(System.in);
 while(true) {
  String in = text.nextLine();
  if((in.contains("1") || in.contains("2") || in.contains("3") || in.contains("4") || in.contains("5") || in.contains("6")|| in.contains("7") || in.contains("8") || in.contains("9") || in.contains("0")  ) && (in.contains("I") || in.contains("V") || in.contains("X"))){
    try {
        throw new IOException();
        }//try
    catch (IOException e) {
        System.out.println("В одном выражении калькулятор принимает только арабские или только римские цифры одновременно");
        
       }//catch 
     
       break;
  }//roman and no roman
 else if(in.contains("VIII") && in.length()>9){
            try {
                throw new IOException();
                }//try
            catch (IOException e) {
                System.out.println("Выражение должно содержать 2 операнда (целые числа от 0 до 10) и 1 оператор");
                
               }//catch 
             
               break;
        }//too many op with VIII
        else  if((in.contains("VII") || in.contains("III")) && in.length()>7 && !in.contains("VIII")){
            try {
                throw new IOException();
                }//try
            catch (IOException e) {
                System.out.println("Выражение должно содержать 2 операнда (целые числа от 0 до 10) и 1 оператор");
                
               }//catch 
             
               break;
        }//too many op with VII or III
        else if(in.contains("10") && in.length()>5){
                try {
                    throw new IOException();
                    }//try
                catch (IOException e) {
                    System.out.println("Выражение должно содержать 2 операнда (целые числа от 0 до 10) и 1 оператор");
                    
                   }//catch 
                 
                   break;
                }//if too many op with 10
       else if(!in.contains("10") && !in.contains("IX") && !in.contains("VI") && !in.contains("II") && !in.contains(".") && in.length()>4 ){
        try {
            throw new IOException();
            }//try
        catch (IOException e) {
            System.out.println("Выражение должно содержать 2 операнда (целые числа от 0 до 10) и 1 оператор");
            
           }//catch 
         
           break;
       }//if too many op
    
        else if ((in.contains(".")) || (in.contains(","))) {
            try {
                throw new IOException();
            }//tray
            catch (IOException e ) {
                System.out.println("Калькулятор работает только с ЦЕЛЫМИ числами от 0 до 10");
            }//catch
            break;
        }//no integer
        
        else if (in.contains("+")) {
            if((in.contains("I")) || (in.contains("V")) || (in.contains("X"))) {
                String[] splitStringRom = in.split("\\+");
                String numRom1 = splitStringRom[0];
                String numRom2 = splitStringRom[1];
                num1 = romanToArabic.get(numRom1);
                num2 = romanToArabic.get(numRom2);
                if((num1<0) || (num1>10) || (num2<0) || (num2>10)) {
                    try {
                        throw new IOException();
                    }
                    catch (IOException e) {
                        System.out.println("Калькулятор работает с числами от 0 до 10");
                    }
                    break;
                  }//ex
                sum = num1 + num2;
                sumRom = arabicToRoman.get(sum);
                System.out.println(sumRom);
            }//roman
            else {
            String[] splitString = in.split("\\+");
               num1 = Integer.parseInt(splitString[0]);
               num2 = Integer.parseInt(splitString[1]);
               if((num1<0) || (num1>10) || (num2<0) || (num2>10)) {
                try {
                    throw new IOException();
                }
                catch (IOException e) {
                    System.out.println("Калькулятор работает с числами от 0 до 10");
                }
                break;
              }//ex
               sum = num1 + num2;
               System.out.println(sum);
           }//no roman
          }//if +
         else if (in.contains("-")) {
                if((in.contains("I")) || (in.contains("V")) || (in.contains("X"))) {
                    String[] splitStringRom = in.split("\\-");
                    String numrom1 = splitStringRom[0];
                    String numrom2 = splitStringRom[1];
                    num1 = romanToArabic.get(numrom1);
                    num2 = romanToArabic.get(numrom2);
                    if((num1<0) || (num1>10) || (num2<0) || (num2>10)) {
                        try {
                            throw new IOException();
                        }
                        catch (IOException e) {
                            System.out.println("Калькулятор работает с числами от 0 до 10");
                        }
                        break;
                      }//ex1
                      if(num2>=num1) {
                        try {
                            throw new IOException();
                        }
                        catch (IOException e) {
                            System.out.println("Отрицательное число или ноль в результате");
                        }
                        break;
                      }//ex1
                    sub = num1 - num2; 
                    subRom = arabicToRoman.get(sub); 
                    System.out.println(subRom);  
                }//roman
                else {
            String[] splitString = in.split("\\-");
             num1 = Integer.parseInt(splitString[0]);
             num2 = Integer.parseInt(splitString[1]);
             if((num1<0) || (num1>10) || (num2<0) || (num2>10)) {
                try {
                    throw new IOException();
                }
                catch (IOException e) {
                    System.out.println("Калькулятор работает с числами от 0 до 10");
                }
                break;
              }//ex
              sub = num1 - num2;
              System.out.println(sub); 
          }//no roman
     }//if -
            else if (in.contains("*")) {
                if((in.contains("I")) || (in.contains("V")) || (in.contains("X"))) {
                    String[] splitStringRom = in.split("\\*");
                    String numrom1 = splitStringRom[0];
                    String numrom2 = splitStringRom[1];
                    num1 = romanToArabic.get(numrom1);
                    num2 = romanToArabic.get(numrom2);  
                    if((num1<0) || (num1>10) || (num2<0) || (num2>10)) {
                        try {
                            throw new IOException();
                        }
                        catch (IOException e) {
                            System.out.println("Калькулятор работает с числами от 0 до 10");
                        }
                        break;
                      }//ex
                    mul = num1 * num2;
                    mulRom = arabicToRoman.get(mul);
                    System.out.println(mulRom);  
                }//roman
                else {
            String[] splitString = in.split("\\*");
                num1 = Integer.parseInt(splitString[0]);
                num2 = Integer.parseInt(splitString[1]);
                if((num1<0) || (num1>10) || (num2<0) || (num2>10)) {
                    try {
                        throw new IOException();
                    }
                    catch (IOException e) {
                        System.out.println("Калькулятор работает с числами от 0 до 10");      
                    }
                    break;
                  }//if ex
                mul = num1 * num2;
                System.out.println(mul);            
            }//no roman          
               }//if *       
            else if (in.contains("/")) {
                if((in.contains("I")) || (in.contains("V")) || (in.contains("X"))) {
                    String[] splitStringRom = in.split("\\/");
                    String numrom1 = splitStringRom[0];
                    String numrom2 = splitStringRom[1];
                    num1 = romanToArabic.get(numrom1);
                    num2 = romanToArabic.get(numrom2);
                    if((num1<0) || (num1>10) || (num2<0) || (num2>10)) {
                        try {
                            throw new IOException();
                        }
                        catch (IOException e) {
                            System.out.println("Калькулятор работает с числами от 0 до 10");
                        }
                        break;
                      }//ex1
                      if(num2>num1) {
                        try {
                            throw new IOException();
                        }
                        catch (IOException e) {
                            System.out.println("Результат меньше единицы");
                        }
                        break;
                      }//ex2
                    div = num1 / num2;
                    divRom = arabicToRoman.get(div);
                    System.out.println(divRom);     
                }//roman
               else {
               String[] splitString = in.split("\\/");
                num1 = Integer.parseInt(splitString[0]);
                num2 = Integer.parseInt(splitString[1]);
                if((num1<0) || (num1>10) || (num2<0) || (num2>10)) {
                    try {
                        throw new IOException();
                        }//try
                    catch (IOException e) {
                        System.out.println("Калькулятор работает с числами от 0 до 10");
                       }//catch 
                       break;
                     }//if ex
                div = num1 / num2;
                System.out.println(div); 
         }//no roman  
            }//if /
            else {
                   try {
                       throw new IOException();
                    }//try
                   catch (IOException e) {
                         System.out.println("Калькулятор выполняет сложение, вычитание, умножение и деление чисел от 0 до 10");
                    }//catch
                    break;
             }// other symbols
       System.out.println();
    }//while
    System.out.println("_________");
    text.close();
  }//main
  }//program

