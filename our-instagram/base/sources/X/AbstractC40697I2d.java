package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.I2d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40697I2d {
    public static Map A00(JMY jmy) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jmy.BDG() != null) {
            A1I.put("header_text", jmy.BDG());
        }
        if (jmy.BGQ() != null) {
            A1I.put("illustration_id", jmy.BGQ());
        }
        ArrayList arrayList = null;
        if (jmy.BHh() != null) {
            List<C47N> BHh = jmy.BHh();
            if (BHh != null) {
                arrayList = AbstractC166987dD.A1E();
                for (C47N c47n : BHh) {
                    if (c47n != null) {
                        arrayList.add(c47n.F7o());
                    }
                }
            }
            A1I.put("initial_suggestions", arrayList);
        }
        C38321qM BlZ = jmy.BlZ();
        if (BlZ != null) {
            A1I.put("reel_item", BlZ.A1D());
        }
        if (jmy.C3F() != null) {
            A1I.put("subheader_text", jmy.C3F());
        }
        if (jmy.C5f() != null) {
            A1I.put("template_id", jmy.C5f());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
