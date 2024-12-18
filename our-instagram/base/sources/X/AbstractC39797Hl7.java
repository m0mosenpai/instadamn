package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hl7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39797Hl7 {
    public static Map A00(InterfaceC43527JKn interfaceC43527JKn) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43527JKn.Af8() != null) {
            A1I.put("background_url", interfaceC43527JKn.Af8());
        }
        if (interfaceC43527JKn.getText() != null) {
            AbstractC37300Gc1.A15(interfaceC43527JKn.getText(), A1I);
        }
        if (interfaceC43527JKn.CBn() != null) {
            AbstractC37300Gc1.A16(interfaceC43527JKn.CBn(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
