package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I35 {
    public static Map A00(C5FJ c5fj) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c5fj.getBackgroundColor() != null) {
            A1I.put("background_color", c5fj.getBackgroundColor());
        }
        if (c5fj.BDW() != null) {
            A1I.put("height_percentage", AbstractC166997dE.A0f(c5fj.BDW()));
        }
        if (c5fj.Bzu() != null) {
            A1I.put("start_x_position_percentage", AbstractC166997dE.A0f(c5fj.Bzu()));
        }
        if (c5fj.Bzw() != null) {
            A1I.put("start_y_position_percentage", AbstractC166997dE.A0f(c5fj.Bzw()));
        }
        if (c5fj.getTextColor() != null) {
            A1I.put("text_color", c5fj.getTextColor());
        }
        if (c5fj.C6j() != null) {
            A1I.put("text_size", c5fj.C6j());
        }
        if (c5fj.CHj() != null) {
            A1I.put("width_percentage", AbstractC166997dE.A0f(c5fj.CHj()));
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
