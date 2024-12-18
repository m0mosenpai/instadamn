package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GdY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37392GdY {
    public static Map A00(InterfaceC39481sT interfaceC39481sT) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC39481sT.Apw() != null) {
            A1I.put("comparator", interfaceC39481sT.Apw());
        }
        if (interfaceC39481sT.BN4() != null) {
            A1I.put("lhs", interfaceC39481sT.BN4());
        }
        if (interfaceC39481sT.BpI() != null) {
            A1I.put("rhs", interfaceC39481sT.BpI());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
