package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FCE {
    public static Map A00(InterfaceC37270GbN interfaceC37270GbN) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        List AdW = interfaceC37270GbN.AdW();
        if (AdW != null) {
            ArrayList A0q = AbstractC167017dG.A0q(AdW);
            Iterator it = AdW.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            A1I.put(AbstractC111324zv.A00(1952), A0q);
        }
        if (interfaceC37270GbN.AdY() != null) {
            A1I.put("audience_size", interfaceC37270GbN.AdY());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
