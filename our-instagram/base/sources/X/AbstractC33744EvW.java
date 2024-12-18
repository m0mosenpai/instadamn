package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.EvW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33744EvW {
    public static Map A00(InterfaceC37269GbM interfaceC37269GbM) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC37269GbM.BoI() != null) {
            List BoI = interfaceC37269GbM.BoI();
            ArrayList A0q = AbstractC167017dG.A0q(BoI);
            Iterator it = BoI.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            A1I.put("requesters", A0q);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
