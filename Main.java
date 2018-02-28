public class Main {
    int[] array = new int[]{0,1,0,1,1,1,0,1,1,0,0,0,1,0,1,0,0,1,1,0,1,1};
    public static void main(String[] args) {
        Main program = new Main();
        System.out.println(program.islandCounter());

    }
    public int islandCounter(){
        int prevInt = 0;
        int currentInt = 0;
        int islandCounter = 0;
        boolean isIsland = false;
        for(int i : array){
            prevInt = currentInt;
            currentInt = i;


            if(currentInt ==0){
                isIsland = false;
            }

            if (currentInt == 1 && prevInt == 1 && !isIsland){
                islandCounter ++;
                isIsland = true;
            }

        }
        return islandCounter;
    }
}
