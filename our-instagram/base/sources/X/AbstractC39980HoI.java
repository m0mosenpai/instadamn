package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HoI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39980HoI {
    public static Map A00(InterfaceC43535JKv interfaceC43535JKv) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43535JKv.BN2() != null) {
            A1I.put("length", interfaceC43535JKv.BN2());
        }
        if (interfaceC43535JKv.BYa() != null) {
            A1I.put("offset", interfaceC43535JKv.BYa());
        }
        if (interfaceC43535JKv.getUrl() != null) {
            AbstractC37300Gc1.A13(interfaceC43535JKv.getUrl(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
