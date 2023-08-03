package solid.live.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:14:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResourceAllocator {
    final static private int INVALID_RESOURCE_ID = -1;

    public int allocate(ResourceType resourceType) {
        int resourceId;
        resourceId = resourceType.findFreeSlot();

        if(resourceId==INVALID_RESOURCE_ID) {
            System.out.println("Can't find free slots!");
        }
        
        resourceType.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(ResourceType resourceType, int resourceId) {
        resourceType.markSlotFree(resourceId);
    }
}
