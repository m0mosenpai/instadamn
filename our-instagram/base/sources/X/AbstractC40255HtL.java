package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HtL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40255HtL {
    public static Map A00(InterfaceC102194ip interfaceC102194ip) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC102194ip.Ca9() != null) {
            A1I.put(AbstractC43591JPw.A00(402), interfaceC102194ip.Ca9());
        }
        if (interfaceC102194ip.BcT() != null) {
            A1I.put("permission", interfaceC102194ip.BcT());
        }
        if (interfaceC102194ip.BzF() != null) {
            A1I.put("sponsor", interfaceC102194ip.BzF().A07());
        }
        if (interfaceC102194ip.BzG() != null) {
            A1I.put("sponsor_id", interfaceC102194ip.BzG());
        }
        if (interfaceC102194ip.getUsername() != null) {
            A1I.put(AbstractC50531MSk.A00(), interfaceC102194ip.getUsername());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
