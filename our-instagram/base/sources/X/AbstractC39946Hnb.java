package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hnb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39946Hnb {
    public static Map A00(C67Z c67z) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        List B5S = c67z.B5S();
        if (B5S != null) {
            ArrayList A0q = AbstractC167017dG.A0q(B5S);
            Iterator it = B5S.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            A1I.put("featured_user_list", A0q);
        }
        if (c67z.BAR() != null) {
            A1I.put("group", c67z.BAR().A07());
        }
        if (c67z.BY5() != null) {
            A1I.put("num_total_notes", c67z.BY5());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
