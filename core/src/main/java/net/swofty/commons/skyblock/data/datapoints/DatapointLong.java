package net.swofty.commons.skyblock.data.datapoints;

import net.swofty.commons.skyblock.serializer.JacksonSerializer;
import net.swofty.commons.skyblock.data.Datapoint;

public class DatapointLong extends Datapoint<Long> {
    private static final JacksonSerializer<Long> serializer = new JacksonSerializer<>(Long.class);

    public DatapointLong(String key, Long value) {
        super(key, value, serializer);
    }

    public DatapointLong(String key) {
        super(key, null, serializer);
    }
}
