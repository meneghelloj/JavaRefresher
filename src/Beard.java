public class Beard extends Face{
    //String name;
    String beardColor;

    Beard(String name) {
        super("Manly "+name,"Male");
        this.beardColor = hairColor;
    }
    Beard(Face face) {
        super("Manly " + face.getName(),"Male");
        this.beardColor = face.hairColor;
    }
    Beard() {
        super("Manly Ragnar","Male");
        this.setHairColor("Red");
        this.setNoseLength(3);
        this.setMouthLength(4);
        this.beardColor = "Red";
    }

    public void itch() {
        Viking ragnar = new Viking();
        Boolean vikingStatus = ragnar.isViking();
        if (!name.isBlank()) {
            System.out.println(name + " itches his " + beardColor + " beard.");
        } else {
            System.out.println("You itch your" + beardColor + " beard.");
        }

        if(vikingStatus) {
            System.out.println("Then goes off and does viking things.");
        }
    }

    public void setColor(String color) {
        this.beardColor = color;
    }
    private class Viking{
        private Boolean isViking(){
            if(name.contains("Ragnar")){
                return true;
            } else{
                return false;
            }
        }

    }
}

