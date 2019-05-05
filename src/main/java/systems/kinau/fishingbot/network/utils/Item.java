/*
 * Created by David Luedtke (MrKinau)
 * 2019/5/5
 */

package systems.kinau.fishingbot.network.utils;

import javafx.util.Pair;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
public class Item {

    @Getter private int eid;
    @Getter private int itemId;
    @Getter private String name;
    @Getter private List<Pair<String, Short>> enchantments;
    @Getter @Setter private int motX, motY, motZ;

    @Override
    public String toString() {
        return eid + ":" + name + " (" + motX + "/" + motY + "/" + motZ + ")";
    }
}
