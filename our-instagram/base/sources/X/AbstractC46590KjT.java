package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.KjT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract /* synthetic */ class AbstractC46590KjT {
    public static Map A00(InterfaceC99354d5 interfaceC99354d5) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC99354d5.AkU();
        A1I.put("can_hush", Boolean.valueOf(interfaceC99354d5.AkU()));
        interfaceC99354d5.Al4();
        A1I.put("can_unhush", Boolean.valueOf(interfaceC99354d5.Al4()));
        interfaceC99354d5.AsS();
        A1I.put("cover_reason_category", Integer.valueOf(interfaceC99354d5.AsS()));
        interfaceC99354d5.Cag();
        A1I.put("is_post_covered", Boolean.valueOf(interfaceC99354d5.Cag()));
        return AbstractC06930Yk.A0B(A1I);
    }
}
