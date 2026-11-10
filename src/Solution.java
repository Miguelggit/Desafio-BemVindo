public class Solution{
    public int somarArray (int[] meuArray){
         int soma = 0;
         if(meuArray.length == 0) {return 0;}
            for(int numero : meuArray){
                soma += numero;
            }
            return soma;
    }
}
