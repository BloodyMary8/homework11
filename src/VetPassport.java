public class VetPassport {
    private String family;
    private String breed;
    private boolean photo;
    private String name;

    public VetPassport(String family, String breed, boolean photo, String name) {
        this.family = family;
        this.breed = breed;
        this.photo = photo;
        this.name = name;
    }
    public String getFamily() {
        return family;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isPhoto() {
        return photo;
    }

    public String getName() {
        return name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setPhoto(boolean photo) {
        this.photo = photo;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "VetPassport{" +
                "family='" + family + '\'' +
                ", breed='" + breed + '\'' +
                ", photo=" + photo +
                ", name='" + name + '\'' +
                '}';
    }
}
