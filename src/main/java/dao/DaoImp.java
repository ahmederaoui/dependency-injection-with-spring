package dao;

public class DaoImp implements IDao{
    @Override
    public int getData() {
        return (int) (Math.random()*50);
    }
}
