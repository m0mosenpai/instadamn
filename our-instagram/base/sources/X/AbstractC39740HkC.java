package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AfiInterestsRecoStyle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HkC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39740HkC {
    public static Map A00(C5FT c5ft) {
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c5ft.B30() != null) {
            A1I.put("expand_button_label", c5ft.B30());
        }
        if (c5ft.B33() != null) {
            A1I.put("expanded_num_rows", c5ft.B33());
        }
        String str = null;
        if (c5ft.BJ1() != null) {
            List<JMH> BJ1 = c5ft.BJ1();
            if (BJ1 != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JMH jmh : BJ1) {
                    if (jmh != null) {
                        arrayList.add(jmh.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("interests", arrayList);
        }
        if (c5ft.BY1() != null) {
            A1I.put("num_rows", c5ft.BY1());
        }
        if (c5ft.Bf6() != null) {
            JK7 Bf6 = c5ft.Bf6();
            if (Bf6 != null) {
                treeUpdaterJNI = Bf6.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("post_selection_cta", treeUpdaterJNI);
        }
        if (c5ft.C33() != null) {
            AfiInterestsRecoStyle C33 = c5ft.C33();
            if (C33 != null) {
                str = C33.A00;
            }
            A1I.put("style", str);
        }
        if (c5ft.getSubtitle() != null) {
            A1I.put("subtitle", c5ft.getSubtitle());
        }
        if (c5ft.getTitle() != null) {
            AbstractC37300Gc1.A17(c5ft.getTitle(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
