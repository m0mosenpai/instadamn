package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hpt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40067Hpt {
    public static Map A00(InterfaceC31134DmH interfaceC31134DmH) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        List B48 = interfaceC31134DmH.B48();
        if (B48 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(B48);
            Iterator it = B48.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            A1I.put("facepile_top_participants", A0q);
        }
        interfaceC31134DmH.BbW();
        A1I.put("participant_count", Integer.valueOf(interfaceC31134DmH.BbW()));
        if (interfaceC31134DmH.Big() != null) {
            A1I.put("prompt_id", interfaceC31134DmH.Big());
        }
        if (interfaceC31134DmH.getText() != null) {
            AbstractC37300Gc1.A15(interfaceC31134DmH.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
