package net.swofty.commons.skyblock.event.actions.custom;

import net.minestom.server.event.Event;
import net.swofty.commons.skyblock.event.SkyBlockEvent;
import net.swofty.commons.skyblock.mission.missions.MissionTalkToVillagers;
import net.swofty.commons.skyblock.event.EventNodes;
import net.swofty.commons.skyblock.event.EventParameters;
import net.swofty.commons.skyblock.event.custom.PlayerRegionChangeEvent;
import net.swofty.commons.skyblock.mission.MissionData;
import net.swofty.commons.skyblock.region.RegionType;

@EventParameters(description = "Handles the the starting of the talk to villagers mission",
        node = EventNodes.CUSTOM,
        validLocations = EventParameters.Location.HUB,
        requireDataLoaded = false)
public class ActionStartHubMission extends SkyBlockEvent {
    @Override
    public Class<? extends Event> getEvent() {
        return PlayerRegionChangeEvent.class;
    }

    @Override
    public void run(Event tempEvent) {
        PlayerRegionChangeEvent event = (PlayerRegionChangeEvent) tempEvent;
        if (event.getTo() == null) return;
        if (event.getTo() != RegionType.VILLAGE) return;

        MissionData data = event.getPlayer().getMissionData();
        if (data.isCurrentlyActive("talk_to_villagers")) return;
        if (data.hasCompleted("talk_to_villagers")) return;

        data.startMission(MissionTalkToVillagers.class);
    }
}