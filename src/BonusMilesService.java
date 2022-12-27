public class BonusMilesService {
    public int calculate(int price){
        int miles = price / 20; //Подсчет бонусых миль
        return miles;
    }
}
