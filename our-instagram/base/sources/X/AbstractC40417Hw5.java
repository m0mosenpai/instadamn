package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hw5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40417Hw5 {
    public static Map A00(InterfaceC43520JKg interfaceC43520JKg) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43520JKg.B2G() != null) {
            List<JLA> B2G = interfaceC43520JKg.B2G();
            ArrayList arrayList = null;
            if (B2G != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JLA jla : B2G) {
                    if (jla != null) {
                        arrayList.add(jla.F7o());
                    }
                }
            }
            A1I.put("entities", arrayList);
        }
        if (interfaceC43520JKg.getText() != null) {
            AbstractC37300Gc1.A15(interfaceC43520JKg.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
