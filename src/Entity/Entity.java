package Entity;

import javafx.scene.image.Image;

public class Entity {

    private int[] coordinates = new int[2];
    private int[] sizePixels;
    private int[] mapUnits;

    private Image currentImage;
    private Image[] defaultLook;
    private Image[][] moveAnimation;

    private boolean pause;
    private boolean overrideDirection = false;
    private int direction;

    //

    public Entity() {

    }

    public Entity(int x, int y) {
        coordinates[0] = x;
        coordinates[1] = y;
    }

    //



    //

    public Image getCurrentImage() {
        return currentImage;
    }
    private void setCurrentImage(Image currentImage) {
        if (pause) {
            return;
        } else {
            this.currentImage = currentImage;
        }
    }

    public int pause(boolean pause) { //returns 1 if it was already paused
        if (this.pause != pause) {
            this.pause = pause;
            return 0;
        } else {
            return 1;
        }
    }
    public void setDirection(int direction) {
        this.direction = direction;
    }
    public int setOverrideDirection(boolean overrideDirection) {
        if (this.overrideDirection != overrideDirection) {
            this.pause = pause;
            return 0;
        } else {
            return 1;
        }
    }

    //

    public class Action {
        public Action() {

        }
    }

}
