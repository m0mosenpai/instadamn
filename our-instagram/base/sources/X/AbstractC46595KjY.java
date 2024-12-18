package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.KjY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract /* synthetic */ class AbstractC46595KjY {
    public static Map A00(InterfaceC99494dO interfaceC99494dO) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        TreeUpdaterJNI treeUpdaterJNI3;
        TreeUpdaterJNI treeUpdaterJNI4;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI5 = null;
        if (interfaceC99494dO.BQg() != null) {
            InterfaceC99474dM BQg = interfaceC99494dO.BQg();
            if (BQg != null) {
                treeUpdaterJNI4 = BQg.F7o();
            } else {
                treeUpdaterJNI4 = null;
            }
            A1I.put(AbstractC111324zv.A00(2701), treeUpdaterJNI4);
        }
        if (interfaceC99494dO.CCA() != null) {
            InterfaceC99474dM CCA = interfaceC99494dO.CCA();
            if (CCA != null) {
                treeUpdaterJNI3 = CCA.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("ufi_like_destination", treeUpdaterJNI3);
        }
        if (interfaceC99494dO.CCB() != null) {
            InterfaceC99474dM CCB = interfaceC99494dO.CCB();
            if (CCB != null) {
                treeUpdaterJNI2 = CCB.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("ufi_reply_destination", treeUpdaterJNI2);
        }
        if (interfaceC99494dO.CCC() != null) {
            InterfaceC99474dM CCC = interfaceC99494dO.CCC();
            if (CCC != null) {
                treeUpdaterJNI = CCC.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("ufi_repost_destination", treeUpdaterJNI);
        }
        if (interfaceC99494dO.CCD() != null) {
            InterfaceC99474dM CCD = interfaceC99494dO.CCD();
            if (CCD != null) {
                treeUpdaterJNI5 = CCD.F7o();
            }
            A1I.put("ufi_reshare_destination", treeUpdaterJNI5);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
