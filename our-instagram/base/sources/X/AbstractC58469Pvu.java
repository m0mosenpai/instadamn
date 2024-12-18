package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Pvu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract /* synthetic */ class AbstractC58469Pvu {
    public static Map A00(InterfaceC88253wa interfaceC88253wa) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC88253wa.getDomain() != null) {
            A1I.put("domain", interfaceC88253wa.getDomain());
        }
        if (interfaceC88253wa.CW1() != null) {
            A1I.put("is_iab_autofill_optout", interfaceC88253wa.CW1());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
