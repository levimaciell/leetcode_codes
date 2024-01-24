public class ClimbingStairs {
    public static void main(String[] args) {
        int steps = 38;
        System.out.println("------------------------------------------------------------");
        System.out.println("How many possibilities to climb a " + steps + " steps stair?");
        System.out.println(climbStairs(steps));
    }
        

        public static int climbStairs(int n){
            if(n == 0 || n == 1) return 1;

            int [] arr = new int[n + 1];

            arr[0] = 1;
            arr[1] = 1;

            for (int i = 2; i <= n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            
            return arr[n];
        }

    //Se soma dos passos for igual a 4, é uma possibilidade
    //Se o passo anterior somado com 1 ou 2 não for maior que o numero de passos, ainda é uma possibilidade
    //Uma possibilidade só é eliminada se for maior que o numero de passos. Se for menor, adiciona    

    //Ideia pensada por mim, mas que é muito lenta 

    // public static int climbStairs(int n) {
    //     int possibilities = 0;
    //     List<Integer> list = new ArrayList<>();
    //     list.add(0);

    //     for(int i  = 0; i < n; i++){
    //         List<Integer> aux = new ArrayList<>();

    //         for(int j = 0; j < list.size(); j++){
    //             int actual = list.get(j);

    //             if((actual + 1) < n)
    //                 aux.add(actual + 1);
                
    //             if((actual + 2) < n)
    //                 aux.add(actual+2);
                
    //             if((actual + 1) == n || (actual + 2) == n)
    //                 possibilities++;

    //         }
    //         list.clear();
    //         list.addAll(aux);
    //         aux.clear();
    //     }

    //     return possibilities;
    // }
}
