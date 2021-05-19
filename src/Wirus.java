public class Wirus {

    public Wirus(){
        switch (Main.levelChoosen) {
            case 0:
                System.out.println("Wybrany poziom to easy: "+Main.levelChoosen);
                break;
            case 1:
                System.out.println("Wybrany poziom to medium " + Main.levelChoosen);
                break;
            case 2:
                System.out.println( "Wybrany poziom to hard " + Main.levelChoosen);
                break;
        }
    }
}
