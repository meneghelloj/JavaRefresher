public class Face {

    String name;
    int noseLength;
    int mouthLength;
    String eyeColor;
    String hairColor;
    String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public int getNoseLength() {
        return noseLength;
    }
    public void setNoseLength(int noseLength) {
        this.noseLength = noseLength;
    }
    public int getMouthLength() {
        return mouthLength;
    }
    public void setMouthLength(int mouthLength) {
        this.mouthLength = mouthLength;
    }
    public Face() {
        setName("Bob");
        setEyeColor("Brown");
        setHairColor("Brown");
        setMouthLength(5);
        setNoseLength(5);
        setGender("Male");
    }
    public Face(String name, String gender){
        setName(name);
        setEyeColor("Brown");
        setHairColor("Brown");
        setMouthLength(5);
        setNoseLength(5);
        setGender(gender);
    }
    public void kiss(){
        System.out.println(name + " kisses you.");
    }
    public void itch(){
        System.out.println(name + " itches their face.");
    }
}
