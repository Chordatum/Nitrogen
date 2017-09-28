import Entity.Entity;

import java.util.ArrayList;

/**
 * This class joins entities and maps together, then draws the image for the game
 */
public class Set {

    private int[] screenResolution;
    private int[] pixelDimentions;  

    private ArrayList<Map> maps = new ArrayList<>();
    private ArrayList<Entity> entities = new ArrayList<>();

    private Map currentMap;

    //

    public int addMap(Map map) {
        int x;
        for (x = 0; x < maps.size(); x++) {
            if (maps.get(x) == null) {
                maps.set(x, map);
                return x; //returns index num
            }
        }
        return -1; //there is no circumstance where -1 should be returned, but it is here just in case
    }
    public int addEntity(Entity entity) {
        int x;
        for (x = 0; x < entities.size(); x++) {
            if (entities.get(x) == null) {
                entities.set(x, entity);
                return x; //returns index num
            }
        }
        return -1; //there is no circumstance where -1 should be returned, but it is here just in case
    }
}