package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HmC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39863HmC {
    public static Map A00(InterfaceC104804nl interfaceC104804nl) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (interfaceC104804nl.Bx5() != null) {
            IgShowreelComposition Bx5 = interfaceC104804nl.Bx5();
            if (Bx5 != null) {
                treeUpdaterJNI = Bx5.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(3107), treeUpdaterJNI);
        }
        if (interfaceC104804nl.Bx7() != null) {
            IgShowreelNativeAnimationIntf Bx7 = interfaceC104804nl.Bx7();
            if (Bx7 != null) {
                treeUpdaterJNI2 = Bx7.F7o();
            }
            A1I.put("showreel_native_animation", treeUpdaterJNI2);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
