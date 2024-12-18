package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hk5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39735Hk5 {
    public static Map A00(InterfaceC106394qt interfaceC106394qt) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (interfaceC106394qt.Bjh() != null) {
            List<InterfaceC106374qr> Bjh = interfaceC106394qt.Bjh();
            if (Bjh != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC106374qr interfaceC106374qr : Bjh) {
                    if (interfaceC106374qr != null) {
                        arrayList.add(interfaceC106374qr.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("questions", arrayList);
        }
        if (interfaceC106394qt.CB2() != null) {
            A1I.put("trigger_condition", interfaceC106394qt.CB2());
        }
        if (interfaceC106394qt.CCS() != null) {
            InterfaceC106354qp CCS = interfaceC106394qt.CCS();
            if (CCS != null) {
                treeUpdaterJNI = CCS.F7o();
            }
            A1I.put("undo_button", treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
