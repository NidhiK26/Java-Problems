public class StockMaxProfit {

    public static int MaxProfit(int prices[]){
         int buyPrice=prices[0];
         
         int profit=0;
for(int i=0;i<prices.length;i++){
    if(buyPrice<prices[i]){
    
       profit=Math.max(prices[i]-buyPrice,profit);
    }
    else{
        buyPrice=prices[i];
    }

}
return profit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
       int profitEarned= MaxProfit(prices);
       System.out.println(profitEarned);
    }
    
}
