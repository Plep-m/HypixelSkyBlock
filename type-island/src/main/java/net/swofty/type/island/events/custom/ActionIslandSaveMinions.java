package net.swofty.type.island.events.custom;

import net.minestom.server.event.Event;
import net.swofty.types.generic.event.EventNodes;
import net.swofty.types.generic.event.EventParameters;
import net.swofty.types.generic.event.SkyBlockEvent;
import net.swofty.types.generic.event.custom.IslandSavedIntoDatabaseEvent;
import net.swofty.types.generic.minion.IslandMinionData;

@EventParameters(description = "Handles Minions on the players Island",
        node = EventNodes.CUSTOM,
        requireDataLoaded = false)
public class ActionIslandSaveMinions extends SkyBlockEvent {
    @Override
    public Class<? extends Event> getEvent() {
        return IslandSavedIntoDatabaseEvent.class;
    }

    @Override
    public void run(Event tempEvent) {
        IslandSavedIntoDatabaseEvent event = (IslandSavedIntoDatabaseEvent) tempEvent;

        IslandMinionData minionData = event.getIsland().getMinionData();
        minionData.getMinions().forEach(IslandMinionData.IslandMinion::removeMinion);

        event.getIsland().getDatabase().insertOrUpdate("minions", event.getIsland().getMinionData().serialize());
    }
}
