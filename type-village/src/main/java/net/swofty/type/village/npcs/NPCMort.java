package net.swofty.type.village.npcs;

import net.minestom.server.coordinate.Pos;
import net.swofty.types.generic.entity.npc.NPCParameters;
import net.swofty.types.generic.entity.npc.SkyBlockNPC;
import net.swofty.types.generic.user.SkyBlockPlayer;

public class NPCMort extends SkyBlockNPC {

    public NPCMort() {
        super(new NPCParameters() {
            @Override
            public String[] holograms(SkyBlockPlayer player) {
                return new String[]{"§9Mort", "§e§lGATE KEEPER"};
            }

            @Override
            public String signature(SkyBlockPlayer player) {
                return "";
            }

            @Override
            public String texture(SkyBlockPlayer player) {
                return "";
            }

            @Override
            public Pos position(SkyBlockPlayer player) {
                return new Pos(-88.5, 55, -128.5, -90, 0);
            }

            @Override
            public boolean looking() {
                return true;
            }
        });
    }

    @Override
    public void onClick(PlayerClickNPCEvent e) {
        e.player().sendMessage("§cThis Feature is not there yet. §aOpen a Pull request at https://github.com/Swofty-Developments/HypixelSkyBlock to get it added quickly!");
    }

}
