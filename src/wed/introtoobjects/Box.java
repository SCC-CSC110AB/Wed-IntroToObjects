package wed.introtoobjects;

/**
 *
 * @author john
 */
public class Box {

    public static final int MIN_LENGTH = 0;
    public static final int MIN_WIDTH = 0;
    public static final int MIN_HEIGHT = 0;

    private int length;
    private int width;
    private int height;

    public Box(int length, int width, int height) {
        if (length > MIN_LENGTH) {
            this.length = length;
        } else {
            this.length = MIN_LENGTH + 1;
        }
        
        if (width > MIN_WIDTH) {
            this.width = width;
        } else {
            this.width = MIN_WIDTH + 1;
        }
        
        if (height > MIN_HEIGHT) {
            this.height = height;
        } else {
            this.height = MIN_HEIGHT + 1;
        }
    }

    public Box() {
        this.length = MIN_LENGTH + 1;
        this.width = MIN_WIDTH + 1;
        this.height = MIN_HEIGHT + 1;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        if (length > MIN_LENGTH) {
            this.length = length;
        } else {
            System.out.println(length
                    + " is smaller than the min length which is "
                    + (MIN_LENGTH + 1)
            );
        }
    }
    
    public void setWidth(int width) {
        if (width > MIN_WIDTH) {
            this.width = width;
        } else {
            System.out.println(width
                + " is smaller than the min width which is "
                + (MIN_WIDTH + 1)
            );
        }
    }
    
    public boolean equals(Box otherBox) {
        if (this.length == otherBox.length
            && this.width == otherBox.width
            && this.height == otherBox.height) {
            return true;
        }
        
        return false;
    }
    
    public String toString() {
        return this.length + "x" + this.width + "x" + this.height;
    }
    
    public int getVolume() {
        return this.length * this.width * this.height;
    }
    
    public boolean hasSameVolumeAs(Box otherBox) {
        return this.getVolume() == otherBox.getVolume();
    }
}
