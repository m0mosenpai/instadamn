package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hwd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40448Hwd {
    public static Map A00(InterfaceC43524JKk interfaceC43524JKk) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC43524JKk.getCreatedAt();
        A1I.put("created_at", Long.valueOf(interfaceC43524JKk.getCreatedAt()));
        if (interfaceC43524JKk.getEmoji() != null) {
            A1I.put("emoji", interfaceC43524JKk.getEmoji());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
