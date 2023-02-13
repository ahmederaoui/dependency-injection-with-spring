package presentation;

import dao.DaoImp;
import dao.IDao;
import metier.MetierImp;

public class StaticInjection {
    public static void main(String[] args) {
        IDao dao = new DaoImp();
        MetierImp metier = new MetierImp();
        metier.setDao(dao);
        System.out.println("result = "+ metier.calculer());
    }
}
