package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDZ {
    public static Map A00(InterfaceC99474dM interfaceC99474dM) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (interfaceC99474dM.BIU() != null) {
            InterfaceC99464dK BIU = interfaceC99474dM.BIU();
            if (BIU != null) {
                treeUpdaterJNI = BIU.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(4708), treeUpdaterJNI);
        }
        if (interfaceC99474dM.CCc() != null) {
            InterfaceC99464dK CCc = interfaceC99474dM.CCc();
            if (CCc != null) {
                treeUpdaterJNI2 = CCc.F7o();
            }
            A1I.put(AbstractC111324zv.A00(5526), treeUpdaterJNI2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
