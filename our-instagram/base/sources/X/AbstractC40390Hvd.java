package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hvd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40390Hvd {
    public static Map A00(InterfaceC43517JKd interfaceC43517JKd) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43517JKd.Ayb() != null) {
            A1I.put("display_text", interfaceC43517JKd.Ayb());
        }
        if (interfaceC43517JKd.getUri() != null) {
            A1I.put("uri", interfaceC43517JKd.getUri());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
