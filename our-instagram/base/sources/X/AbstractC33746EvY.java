package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.EvY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33746EvY {
    public static Map A00(InterfaceC37272GbP interfaceC37272GbP) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC37272GbP.getEmoji() != null) {
            A1I.put("emoji", interfaceC37272GbP.getEmoji());
        }
        if (interfaceC37272GbP.Bkm() != null) {
            List Bkm = interfaceC37272GbP.Bkm();
            ArrayList A0q = AbstractC167017dG.A0q(Bkm);
            Iterator it = Bkm.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            A1I.put("reactors", A0q);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
