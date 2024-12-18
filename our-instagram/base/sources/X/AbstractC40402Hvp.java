package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hvp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40402Hvp {
    public static Map A00(JLA jla) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jla.B2I() != null) {
            A1I.put("entity", jla.B2I().F7o());
        }
        if (jla.BN2() != null) {
            A1I.put("length", jla.BN2());
        }
        jla.getOffset();
        return AbstractC37301Gc2.A0r("offset", Integer.valueOf(jla.getOffset()), A1I);
    }
}
