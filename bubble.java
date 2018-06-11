class bubble {
    public static void main(String args[]){

        int numbers[] = {20,55,98,74,35,21,556,48,42,65};
        int a,b,t;
        int size=10;

        System.out.println("array before sort: ");
        for(int i=0; i<size;i++){

            System.out.print(" " + numbers[i]);

        }
        System.out.println();

        // bubble sort
        for(a=1; a<size; a++){
            for(b=size-1;b>=a;b--){
                if (numbers[b-1] > numbers[b]) {
                    t=numbers[b-1];
                    numbers[b-1]=numbers[b];
                    numbers[b]=t;
                }
            }
        }

        System.out.println("array after sort: ");
        for(int i=0; i<size;i++){

            System.out.print(" " + numbers[i]);

        }

    }
}
