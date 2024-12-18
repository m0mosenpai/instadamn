package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HvG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40370HvG {
    public static Map A00(InterfaceC43514JKa interfaceC43514JKa) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43514JKa.AvZ() != null) {
            InterfaceC43516JKc AvZ = interfaceC43514JKa.AvZ();
            if (AvZ != null) {
                treeUpdaterJNI = AvZ.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("data", treeUpdaterJNI);
        }
        if (interfaceC43514JKa.CBn() != null) {
            AbstractC37300Gc1.A16(interfaceC43514JKa.CBn(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
