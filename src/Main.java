public class Main {

private static final String Canine = "Canine";
private static final String Feline = "Felidae";
private static final String Psittacines  = "Psittacines";

    public static void main(String[] args) {
        VetPassport vetPassport1 = new VetPassport("Canine", "jackRassel",true, "Sherry");
        VetPassport vetPassport2 = new VetPassport("Feline", "siamese",true, "Emma");
        VetPassport vetPassport3 = new VetPassport("Canine","poodle",false, "Dolce");
        VetPassport vetPassport4 = new VetPassport("Feline","maineCoon",false, "Kenzo");
        VetPassport vetPassport5 = new VetPassport("Psittacines","macaws",true, "Lokki");
        VetPassport vetPassport6 = new VetPassport("Psittacines","conures",false,"Tom");
    }
}
