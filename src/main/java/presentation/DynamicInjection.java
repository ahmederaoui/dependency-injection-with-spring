package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicInjection {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String classDaoName = scanner.nextLine();
        Class classDao = Class.forName(classDaoName);
        IDao dao = (IDao) classDao.newInstance();

        String classMetierName = scanner.nextLine();
        Class classMetier = Class.forName(classMetierName);
        IMetier metier = (IMetier) classMetier.newInstance();

        Method method = classMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);

        System.out.println("result :" + metier.calculer());
    }
}
