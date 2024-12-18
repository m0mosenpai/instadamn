package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HvJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40372HvJ {
    public static Map A00(InterfaceC43516JKc interfaceC43516JKc) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (interfaceC43516JKc.BjW() != null) {
            InterfaceC43567JMb BjW = interfaceC43516JKc.BjW();
            if (BjW != null) {
                treeUpdaterJNI = BjW.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("question_list", treeUpdaterJNI);
        }
        if (interfaceC43516JKc.BxU() != null) {
            InterfaceC38621qt BxU = interfaceC43516JKc.BxU();
            if (BxU != null) {
                treeUpdaterJNI2 = BxU.F7o();
            }
            A1I.put("simple_action", treeUpdaterJNI2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
