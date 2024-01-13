public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] arr = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
        String [] er1 = {"c","acc","ccc"};
        System.out.println(longestCommonPrefix(er1));
    }

    public static String longestCommonPrefix(String[] strs) {
        //ler a primeira string, separar suas letras. Após isso, procurar por matches nas strings restantes. 
        //O Match deve ser para todas as strings do array, nas mesmas posições

        if(strs.length == 1) return strs[0];

        String base = strs[0];
        String actual = "";
        String prefix = "";
        int cont = 1;
        boolean continuar = true;

        for(int i = 0; i < base.length(); i++){
            actual += String.valueOf(base.charAt(i));

            //verificar as strings restantes se contem act do inicio até o index i. strs[cont]
            //Substring inicio 0 até i, se i menor q len da string
            //Se não ter, sair do loop e tentar outra match.  se der, prefix = act
            while(cont < strs.length && continuar){

                if(i+1 <= strs[cont].length()){
                    int subs = i + 1;

                    if(!strs[cont].substring(0, subs).equals(actual)){
                        continuar = false;
                    }
                    else if(strs[cont].substring(0, subs).equals(actual) && cont + 1 == strs.length){
                        prefix = actual;
                        continuar = false;
                    }
                }
                else
                    continuar = false;
     
                cont++;
            }
            
            cont = 1;
            continuar = true;
        }


        return prefix;
    }
}
