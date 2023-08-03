package solid.live.ocp;

public class TimeResource implements ResourceType{
    @Override
    public void markSlotBusy(int resourceId) {

    }

    @Override
    public void markSlotFree(int resourceId) {
    }

    @Override
    public int findFreeSlot() {
        return 0;
    }
}
