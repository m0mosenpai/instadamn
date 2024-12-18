package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GdU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37388GdU {
    public static Map A00(InterfaceC39331sE interfaceC39331sE) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC39331sE.Bks() != null) {
            A1I.put("reason", interfaceC39331sE.Bks());
        }
        if (interfaceC39331sE.getText() != null) {
            AbstractC37300Gc1.A15(interfaceC39331sE.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
