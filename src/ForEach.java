public class ForEach {
    public static void main(String[] args) {
        int [] Tablica = new int[10];
        for (int i = 0; i < Tablica.length; i+=2 ){
            Tablica[i] = i+1;
        }
        for (int zmienna:Tablica){
            System.out.println(zmienna);
        }
    }
}
