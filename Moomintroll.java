public class Moomintroll extends Human {
    private String leglength;
    APlace place;

    Moomintroll(String y, APlace p) {
        super(y, p);
    }
    public void thinking(AThink t){

        System.out.println("Муми-тролль подумал :" + t.getType());
    }
    public void walk(APlace h){
        place = h;
        System.out.println("Муми-тролль пошагал на место: " + place.getPlace());
    }
    public void climbed(Decor d){
        System.out.println("Муми-тролль спустился по :" + d.getStairs());
    }
    public void look(Decor w){

        System.out.println("Муми-тролль выглянул в :" + w.getWindow());
    }
    public void drewattention(track t){
        System.out.println("Муми-тролль увидел " + t.getTracks() + " Следы" );
    }

}

