package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class Hk9 {
    public static Map A00(JK7 jk7) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (jk7.B3i() != null) {
            InterfaceC43499JJl B3i = jk7.B3i();
            if (B3i != null) {
                treeUpdaterJNI = B3i.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("extra_data", treeUpdaterJNI);
        }
        if (jk7.BgF() != null) {
            InterfaceC106354qp BgF = jk7.BgF();
            if (BgF != null) {
                treeUpdaterJNI2 = BgF.F7o();
            }
            A1I.put("primary_button", treeUpdaterJNI2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
