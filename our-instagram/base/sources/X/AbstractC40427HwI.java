package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HwI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40427HwI {
    public static Map A00(InterfaceC43521JKh interfaceC43521JKh) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43521JKh.BTR() != null) {
            A1I.put("metadata", interfaceC43521JKh.BTR().F7o());
        }
        if (interfaceC43521JKh.CA8() != null) {
            A1I.put("track", interfaceC43521JKh.CA8().F7o());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
