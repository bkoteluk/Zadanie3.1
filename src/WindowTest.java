public class WindowTest {
    public static void main(String[] args) {
        Window window1 = new Window();
        window1.isOpen = false;
        window1.curtainColour = "blue";
        window1.tempIsolation = 10;

        Window window2 = new Window();
        window2.isOpen = true;
        window2.curtainColour = "white";
        window2.tempIsolation = 14;

        System.out.println("Okno 1 jest otwarte ? " + window1.isOpen + " , posiada zasłonę w kolorze: " + window1.curtainColour + ", wsp. przenikalności cieplnej okna to: " + window1.tempIsolation );
        System.out.println("Okno 2 jest otwarte ? " + window2.isOpen + " , posiada zasłonę w kolorze: " + window2.curtainColour + ", wsp. przenikalności cieplnej okna to: " + window2.tempIsolation );
    }
}
