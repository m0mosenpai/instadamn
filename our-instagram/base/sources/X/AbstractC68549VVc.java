package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VVc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68549VVc {
    public static Map A00(XG1 xg1) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (xg1.AxT() != null) {
            XG3 AxT = xg1.AxT();
            if (AxT != null) {
                treeUpdaterJNI2 = AxT.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            linkedHashMap.put(AbstractC111324zv.A00(872), treeUpdaterJNI2);
        }
        if (xg1.BkP() != null) {
            InterfaceC72030XFs BkP = xg1.BkP();
            if (BkP != null) {
                treeUpdaterJNI = BkP.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put(AbstractC111324zv.A00(1206), treeUpdaterJNI);
        }
        if (xg1.C9h() != null) {
            InterfaceC72035XFx C9h = xg1.C9h();
            if (C9h != null) {
                treeUpdaterJNI3 = C9h.F7o();
            }
            linkedHashMap.put(AbstractC111324zv.A00(1346), treeUpdaterJNI3);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
