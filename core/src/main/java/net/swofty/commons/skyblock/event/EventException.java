package net.swofty.commons.skyblock.event;

import net.minestom.server.event.Event;

public interface EventException {
    void onException(Exception e, Event tempEvent);
}
