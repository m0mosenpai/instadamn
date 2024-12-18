package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HoP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39984HoP {
    public static Map A00(InterfaceC108064tp interfaceC108064tp) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC108064tp.AZ6() != null) {
            A1I.put("adCategory", interfaceC108064tp.AZ6());
        }
        if (interfaceC108064tp.getCtaText() != null) {
            A1I.put("cta_text", interfaceC108064tp.getCtaText());
        }
        if (interfaceC108064tp.BKx() != null) {
            A1I.put("label", interfaceC108064tp.BKx());
        }
        if (interfaceC108064tp.BZN() != null) {
            A1I.put("options", interfaceC108064tp.BZN());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
