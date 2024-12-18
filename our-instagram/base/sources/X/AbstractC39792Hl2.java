package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hl2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39792Hl2 {
    public static Map A00(InterfaceC38791rB interfaceC38791rB) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC38791rB.BZI() != null) {
            A1I.put("optimization_type", interfaceC38791rB.BZI());
        }
        if (interfaceC38791rB.BZK() != null) {
            A1I.put("option_value", interfaceC38791rB.BZK());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
