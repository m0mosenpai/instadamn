package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HnW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39941HnW {
    public static Map A00(C54N c54n) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        List B49 = c54n.B49();
        if (B49 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(B49);
            Iterator it = B49.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            A1I.put("facepile_users", A0q);
        }
        if (c54n.getId() != null) {
            AbstractC37300Gc1.A12(c54n.getId(), A1I);
        }
        if (c54n.BgJ() != null) {
            A1I.put("primary_button_text", c54n.BgJ());
        }
        if (c54n.getSubtitle() != null) {
            A1I.put("subtitle", c54n.getSubtitle());
        }
        if (c54n.getTitle() != null) {
            AbstractC37300Gc1.A17(c54n.getTitle(), A1I);
        }
        if (c54n.CBn() != null) {
            AbstractC37300Gc1.A16(c54n.CBn(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
