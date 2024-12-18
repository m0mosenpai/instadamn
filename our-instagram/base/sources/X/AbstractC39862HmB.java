package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.showreel.IgShowreelComposition;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HmB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39862HmB {
    public static Map A00(InterfaceC104794nk interfaceC104794nk) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (interfaceC104794nk.Bx5() != null) {
            IgShowreelComposition Bx5 = interfaceC104794nk.Bx5();
            if (Bx5 != null) {
                treeUpdaterJNI = Bx5.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(3107), treeUpdaterJNI);
        }
        if (interfaceC104794nk.Bx6() != null) {
            C69N Bx6 = interfaceC104794nk.Bx6();
            if (Bx6 != null) {
                treeUpdaterJNI2 = Bx6.F7o();
            }
            A1I.put("showreel_native_animation", treeUpdaterJNI2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
