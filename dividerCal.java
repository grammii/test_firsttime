public class dividerCal {
    private String ans = "";
    private int divider;
    private int[] array = {1,2,3,4,5,6,7,8,9,10};

    public dividerCal(int divider){
        this.divider = divider;
    }

    public void cal(int[] array, int divider){
        for (int i = 0; i < array.length; i++) {
            if(array[i] % divider == 0){
                ans = ans + array[i] + " ";
            }
        }
    }

    public void display(){
        cal(array, divider);
        System.out.println("Answer : "+ans);
    }
}
