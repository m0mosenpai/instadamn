package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9x9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC225449x9 {
    public static Map A00(InterfaceC110074xc interfaceC110074xc) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC110074xc.getDurationInMs();
        A1I.put("duration_in_ms", Long.valueOf(interfaceC110074xc.getDurationInMs()));
        if (interfaceC110074xc.Bp6() != null) {
            A1I.put(AbstractC111324zv.A00(5236), interfaceC110074xc.Bp6());
        }
        if (interfaceC110074xc.Bp7() != null) {
            A1I.put(AbstractC111324zv.A00(5237), interfaceC110074xc.Bp7());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
