package aston.home.work;

public class Fakultati {
    private String nameFaculty;
    private String dekan;

    public Fakultati(String nameFaculty, String dekan) {
        this.nameFaculty = nameFaculty;
        this.dekan = dekan;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }


    public String getDekan() {
        return dekan;
    }

    public void setDekan(String dekan) {
        this.dekan = dekan;
    }
}

