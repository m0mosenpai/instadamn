package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HpP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40038HpP {
    public static Map A00(JMI jmi) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jmi.getBackgroundColor() != null) {
            A1I.put("background_color", jmi.getBackgroundColor());
        }
        if (jmi.B1I() != null) {
            A1I.put("emphasis_style", jmi.B1I());
        }
        if (jmi.getId() != null) {
            AbstractC37300Gc1.A12(jmi.getId(), A1I);
        }
        if (jmi.BZl() != null) {
            A1I.put(AbstractC111324zv.A00(248), jmi.BZl());
        }
        if (jmi.C0h() != null) {
            A1I.put("sticker_style", jmi.C0h());
        }
        if (jmi.getTextColor() != null) {
            A1I.put("text_color", jmi.getTextColor());
        }
        if (jmi.CAd() != null) {
            List<JKN> CAd = jmi.CAd();
            ArrayList arrayList = null;
            if (CAd != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JKN jkn : CAd) {
                    if (jkn != null) {
                        arrayList.add(jkn.F7o());
                    }
                }
            }
            A1I.put(AbstractC111324zv.A00(275), arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
