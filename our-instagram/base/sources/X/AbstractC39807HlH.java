package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HlH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39807HlH {
    public static Map A00(C3W0 c3w0) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList2 = null;
        if (c3w0.BGh() != null) {
            List BGh = c3w0.BGh();
            if (BGh != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = BGh.iterator();
                while (it.hasNext()) {
                    AbstractC37303Gc4.A1Q(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            A1I.put("image_hints", arrayList);
        }
        if (c3w0.BQP() != null) {
            List<InterfaceC74423Vy> BQP = c3w0.BQP();
            if (BQP != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (InterfaceC74423Vy interfaceC74423Vy : BQP) {
                    if (interfaceC74423Vy != null) {
                        arrayList2.add(interfaceC74423Vy.F7o());
                    }
                }
            }
            A1I.put("media", arrayList2);
        }
        if (c3w0.CEp() != null) {
            A1I.put("version", c3w0.CEp());
        }
        List CF9 = c3w0.CF9();
        if (CF9 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(CF9);
            Iterator it2 = CF9.iterator();
            while (it2.hasNext()) {
                AbstractC37303Gc4.A1S(A0q, it2);
            }
            A1I.put("video_hints", A0q);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
