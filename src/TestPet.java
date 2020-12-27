public class TestPet {

    private String name;

    public TestPet(String cat) {
        this.name = cat;
    }

    public TestPet() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPet() {
        return false;
    }
}
