public abstract class TangibleAsset{
  private String name;
  private int price;
  private String color;

public TangibleAsset(String name,intprice,String color){
  this.name=name;
  this.price=price;
  this.color=color;
}
public String getName(){retrun this.name;}
public int getPrice(){return this.price;}
public String getColor(){return this.color;}
}
