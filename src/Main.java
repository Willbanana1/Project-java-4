/**
 * Васянович Нікіта №4
 * 
 * 
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    
    /** 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Вы хотите ввести данные с консоли (0) " +
                "или из файла (1)?");
        int res = Integer.parseInt(s.nextLine());

        Polynom<Rational> pr;
        if (res == 0){
            //console
            System.out.println("Число при Х: ");
            double a = Double.parseDouble(s.nextLine());
            System.out.println("Свободное число: ");
            double b = Double.parseDouble(s.nextLine());
            pr = new Polynom<Rational>(new Rational(a),
                            new Rational(b));
        } else {
            //file
            System.out.println("Введите путь к файлу");
            String adr = s.nextLine();

            BufferedReader br = new BufferedReader(new FileReader(adr));
            double[] values = Arrays.stream(br.readLine().split(" "))
                    .mapToDouble(Double::valueOf).toArray();

            pr = new Polynom<Rational>(new Rational(values[0]),
                    new Rational(values[1]));
        }

        System.out.println("Создаю полином с типом Rational.");
        System.out.printf("Полином: %fx + %f\n", pr.getOne().doubleValue(),
                pr.getZero().doubleValue());

        System.out.println("Решение линейного уравнения: ax + b = 0 => x = " +
                pr.linearEquation(new Rational(0)));

        System.out.println("Решение квадратного уравнения: ax2 + bх + с = 0 => x = " +
                Arrays.toString(pr.quadraticEquation(new Rational(0))));


        System.out.println("f(10) = " + pr.polynomValue(10));

        System.out.println("Производная: " + pr.derivative().doubleValue());

        System.out.println("Опр. интеграл от 0 до 10: " + pr.defIntegral(0, 10));

        System.out.println("Неопр. интеграл: " + pr.undefIntegral());



    }
}
