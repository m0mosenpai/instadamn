package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hwc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40447Hwc {
    public static Map A00(InterfaceC105674pe interfaceC105674pe) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC105674pe.BL7() != null) {
            A1I.put("language", interfaceC105674pe.BL7());
        }
        if (interfaceC105674pe.getUri() != null) {
            A1I.put("uri", interfaceC105674pe.getUri());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
