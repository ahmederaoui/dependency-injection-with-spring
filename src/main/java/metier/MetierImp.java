package metier;

import dao.IDao;

public class MetierImp implements IMetier{
    private IDao dao;

    @Override
    public int calculer() {
        int res = dao.getData() * 5;
        return res;
    }
    public void setDao(IDao dao){
        this.dao= dao;
    }
}
