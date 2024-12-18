package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDT {
    public static Map A00(C46j c46j) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (c46j.AhS() != null) {
            InterfaceC102714k8 AhS = c46j.AhS();
            if (AhS != null) {
                treeUpdaterJNI2 = AhS.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("bottom", treeUpdaterJNI2);
        }
        if (c46j.C5t() != null) {
            InterfaceC102714k8 C5t = c46j.C5t();
            if (C5t != null) {
                treeUpdaterJNI = C5t.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("text", treeUpdaterJNI);
        }
        if (c46j.C9R() != null) {
            InterfaceC102714k8 C9R = c46j.C9R();
            if (C9R != null) {
                treeUpdaterJNI3 = C9R.F7o();
            }
            A1I.put("top", treeUpdaterJNI3);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
