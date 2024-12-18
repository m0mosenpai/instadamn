package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HsC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40192HsC {
    public static Map A00(InterfaceC1347967p interfaceC1347967p) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        List B49 = interfaceC1347967p.B49();
        if (B49 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(B49);
            Iterator it = B49.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            A1I.put("facepile_users", A0q);
        }
        if (interfaceC1347967p.BXh() != null) {
            A1I.put("num_items", interfaceC1347967p.BXh());
        }
        if (interfaceC1347967p.Big() != null) {
            A1I.put("prompt_id", interfaceC1347967p.Big());
        }
        if (interfaceC1347967p.Bim() != null) {
            A1I.put("prompt_text", interfaceC1347967p.Bim());
        }
        if (interfaceC1347967p.Bvl() != null) {
            A1I.put(AbstractC111324zv.A00(267), interfaceC1347967p.Bvl());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
