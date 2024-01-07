package net.swofty.commons.skyblock.data.datapoints;

import net.swofty.commons.skyblock.serializer.Serializer;
import net.swofty.commons.skyblock.data.Datapoint;

import java.util.ArrayList;
import java.util.List;

public class DatapointIntegerList extends Datapoint<List<Integer>> {

    public DatapointIntegerList(String key, ArrayList<Integer> value) {
        super(key, value, new Serializer<>() {
            @Override
            public String serialize(List<Integer> value) {
                ArrayList<String> list = new ArrayList<>(value.size());
                for (Integer i : value)
                    list.add(String.valueOf(i));
                return String.join(",", list);
            }

            @Override
            public List<Integer> deserialize(String json) {
                String[] split = json.split(",");
                ArrayList<Integer> list = new ArrayList<>(split.length);
                for (String s : split)
                    list.add(Integer.parseInt(s));
                return list;
            }
        });
    }

    public DatapointIntegerList(String key) {
        this(key, new ArrayList<>());
    }

    public void add(Integer value) {
        List<Integer> current = getValue();
        current.add(value);
        setValue(current);
    }

    public void remove(Integer value) {
        List<Integer> current = getValue();
        current.remove(value);
        setValue(current);
    }

    public boolean has(Integer value) {
        return getValue().contains(value);
    }

    /**
     * @param value
     * @return true if it was added, false if it wasn't
     */
    public boolean hasOrAdd(Integer value) {
        if (has(value))
            return false;
        add(value);
        return true;
    }

}
