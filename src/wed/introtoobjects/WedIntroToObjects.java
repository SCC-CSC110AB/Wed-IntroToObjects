package wed.introtoobjects;

/**
 *
 * @author john
 */
public class WedIntroToObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean allTestsPass = true;
        Box myBox = new Box(1, 1, 1);
        Box myOtherBox = new Box();
        
        if (!myBox.equals(myOtherBox)) {
            allTestsPass = false;
        }
        
        if (!myBox.toString().equals("1x1x1")) {
            allTestsPass = false;
        }
        
        myBox.setLength(3);
        myOtherBox.setWidth(3);
        
        if (myBox.equals(myOtherBox)) {
            allTestsPass = false;
        }
        
        if (!myBox.hasSameVolumeAs(myOtherBox)) {
            allTestsPass = false;
        }
        
        if (myBox.getLength() != 3) {
            allTestsPass = false;
        }
        
        myBox.setLength(Box.MIN_LENGTH + 1);
        
        if (myBox.getLength() != Box.MIN_LENGTH + 1) {
            allTestsPass = false;
        }
        
        if (myBox.getLength() == Box.MIN_LENGTH) {
            allTestsPass = false;
        }
        
        System.out.println("All tests pass: " + allTestsPass);
    }
    
}
